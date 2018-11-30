package com.techprimers.springbootwebsocketexample.Service;

import com.techprimers.springbootwebsocketexample.model.ChatMsg;
import com.techprimers.springbootwebsocketexample.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    @Autowired
    SimpMessagingTemplate template;

    public void sendMsg(ChatMsg msg) {
        template.convertAndSend("/topic/user/"+msg.getChannelId(), new UserResponse(msg.getName()));
    }
}
