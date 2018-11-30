package com.techprimers.springbootwebsocketexample.resource;

import com.techprimers.springbootwebsocketexample.Service.ChatService;
import com.techprimers.springbootwebsocketexample.model.ChatMsg;
import com.techprimers.springbootwebsocketexample.model.User;
import com.techprimers.springbootwebsocketexample.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired ChatService chatService;

    @MessageMapping("/user")
    public void getUser(ChatMsg msg) {

        this.chatService.sendMsg(msg);
    }
}
