//package com.stackroute.socket.controller;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
//
//import com.stackroute.socket.domain.Message;
//import com.stackroute.socket.domain.OutputMessage;
//
//public class SocketController {
//
//	@MessageMapping("/chat")
//	@SendTo("/topic/messages")
//	public OutputMessage send(Message message) throws Exception {
//	    String time = new SimpleDateFormat("HH:mm").format(new Date());
//	    return new OutputMessage(message.getFrom(), message.getText(), time);
//	}
//	
//}
