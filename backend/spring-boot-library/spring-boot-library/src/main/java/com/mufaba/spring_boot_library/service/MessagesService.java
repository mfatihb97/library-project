package com.mufaba.spring_boot_library.service;

import com.mufaba.spring_boot_library.dao.MessageRepository;
import com.mufaba.spring_boot_library.entity.Message;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MessagesService {

    private MessageRepository messageRepository;

    @Autowired
    public MessagesService(MessageRepository messageRepository){
        this.messageRepository=messageRepository;
    }

    public void postMessage(Message messageRequest,String userEmail){
        Message message = new Message(messageRequest.getTitle(),messageRequest.getQuestion());
        message.setUserEmail(userEmail);
        messageRepository.save(message);
    }

    public Page<Message> getAllMessages(String userEmail){
        Pageable pageable = PageRequest.of(0, 5, Sort.by("title").ascending());
        return messageRepository.findByUserEmail(userEmail,pageable);
    }
}
