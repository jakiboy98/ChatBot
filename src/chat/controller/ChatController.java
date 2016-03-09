package chat.controller;

import chat.model.CTECTwitter;
import chat.model.Chatbot;
import chat.view.ChatView;
import chat.view.ChatFrame;
//Method Documentation
/**
 * Application controller for the ChatBot project.
 * 
 * @author Jacob Willson
 * @version 1.1 10/23/15
 */
public class ChatController //Class
{

	private ChatView display;
	private Chatbot myBot; //Data Member
	private ChatFrame baseFrame;
	private CTECTwitter myTwitter;

	public ChatController() //Controller
	{
		myTwitter = new CTECTwitter(this);
		display = new ChatView();
		String userName = display.grabInput("What is your name?");
		myBot = new Chatbot(userName);
		baseFrame = new ChatFrame(this);
	}

	public void start() 
	{
		display.displayText("Hello " + myBot.getUserName());
		chat();

	}

	private void chat()
	{
//		String conversation = display.grabInput("what would you like to talk about today?");
//		while(myBot.lengthChecker(conversation))
//		{
//			conversation = myBot.processConversation(conversation);
//			conversation = display.grabInput(conversation);
//		}
	}
	
	public String userToChatbot(String conversation)
	{
		String response = "";
		
		if(myBot.quitChecker(conversation))
		{
			ShutDown();
		}
		
		response = myBot.processConversation(conversation);
		
		return response;
	}

	private void ShutDown()
	{
			display.displayText("Goodbye" + myBot.getUserName() + " it has been my pleasure to talk with you");
			System.exit(0);
	}
	
	public void sendTweet(String tweet)
	{
		myTwitter.sendTweet(tweet);
	}
	
	
	public void handleErrors(String error)
	{
		display.displayText(error);
	}
	
	public Chatbot getChatbot()
	{
		return myBot;
	}
	
	public ChatFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	public ChatView getChatView()
	{
		return display;
	}
	
	
}