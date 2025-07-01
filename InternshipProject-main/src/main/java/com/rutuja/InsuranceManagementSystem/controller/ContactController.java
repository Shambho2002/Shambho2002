package com.rutuja.InsuranceManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rutuja.InsuranceManagementSystem.domain.Message;
import com.rutuja.InsuranceManagementSystem.service.MessageService;

@Controller
public class ContactController {
    
    @Autowired
    private MessageService messageService;
    
    @PostMapping("/send/message")
    public String sendMessage(
        @RequestParam("name") String name,
        @RequestParam("email") String email,
        @RequestParam("content") String content,
        Model model
    ) {
        Message message = new Message(name, email, content);
        message.setName(name);
        message.setEmail(email);
        message.setContent(content);
        messageService.addMessage(message);

        model.addAttribute("confirmation", "Your message has been successfully sent!!");
        model.addAttribute("messages", messageService.getAllUsersMessage());

        return "ContactUs";  // or consider redirect:/contact
    }
}
