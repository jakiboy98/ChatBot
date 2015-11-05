package chat.controller;

import chat.model.ChatBot;
import chat.view.ChatView;

/**
 * Application controller for the ChatBot project.
 * 
 * @author Jacob Willson
 * @version 1.1 10/23/15
 */
public class ChatController
{

	private ChatView display;
	private ChatBot myBot;

	public ChatController()
	{
		display = new ChatView();
		String userName = display.grabInput("What is your name?");
		myBot = new ChatBot(userName);
	}

	public void start()
	{
		display.myDisplayText("Hello " + myBot.getUserName());
		chat();

	}

	private void chat()
	{
		String conversation = display.grabInput("what would you like to talk about today?");
		while(myBot.lengthChecker(conversation))
		{
			conversation = myBot.processConversation(conversation);
			conversation = display.grabInput(conversation);
		}
	}

	private void ShutDown()
	{
			display.displayText("Goodbye" + myBot.getUserName);
	}
}