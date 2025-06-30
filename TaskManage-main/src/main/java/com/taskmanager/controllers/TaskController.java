package com.taskmanager.controllers;

import com.taskmanager.entities.Task;
import com.taskmanager.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public String viewTasks(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        model.addAttribute("task", new Task());
        return "Dashboard";
    }

    @PostMapping
    public String saveTask(@ModelAttribute("task") Task task) {
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/edit/{id}")
    public String editTask(@PathVariable Long id, Model model) {
        Task task = taskService.getTaskById(id);
        model.addAttribute("task", task);
        model.addAttribute("tasks", taskService.getAllTasks());
        return "Dashboard";
    }

    @PostMapping("/update/{id}")
    public String updateTask(@PathVariable Long id, @ModelAttribute("task") Task task) {
        task.setId(id);
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }
}
