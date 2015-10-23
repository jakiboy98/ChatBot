package chat.controller;

import chat.model.ChatBot;
import chat.view.ChatView;

/**
 * Application controller for the ChatBot project.
 * @author Jacob Willson
 *@version 1.1 10/23/15
 */
public class ChatController
{

	private ChatView myDisplay;
	private ChatBot simpleBot;
	
	public ChatController()
	{
		myDisplay = new ChatView();
		String userName = myDisplay.grabInput("What is your name?");
		simpleBot = new ChatBot(userName);
	}

	public void start()
	{
		myDisplay.myDisplayText("Hello " + simpleBot.getUserName());
	}
}