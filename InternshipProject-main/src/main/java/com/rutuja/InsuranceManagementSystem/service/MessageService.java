package com.rutuja.InsuranceManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rutuja.InsuranceManagementSystem.domain.Message;
import com.rutuja.InsuranceManagementSystem.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	private MessageRepository messageRepository;
	
	// For Message
	public void addMessage(Message message) {
		messageRepository.save(message);
	}
	
	public List<Message> getAllUsersMessage(){
		return messageRepository.findAll();
	}

}
