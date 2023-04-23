package com.dyq.design.design.pattern.example.mediator_pattern;

import java.util.Date;


/**
 * 聊天室
 */
public class ChatRoom {
	   public static void showMessage(User user, String message){
	      System.out.println(new Date().toString()
	         + " [" + user.getName() +"] : " + message);
	   }
}
