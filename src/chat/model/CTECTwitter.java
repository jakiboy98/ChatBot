package chat.model;

import twitter4j.*;
import java.util.ArrayList;
import chat.controller.ChatController;

public class CTECTwitter
{
	
	private ArrayList<String> wordsList;
	private ArrayList<Status> statusList;
	private Twitter chatbotTwitter;
	private ChatController baseController;
	
	public CTECTwitter(ChatController baseController)
	{
		this.baseController = baseController;
		this.statusList = new ArrayList<Status>();
		this.wordsList = new ArrayList<String>();
		this.chatbotTwitter = TwitterFactory.getSingleton();
	}
	
	public void sendTweet(String message)
	{
		try
		{
			chatbotTwitter.updateStatus("<Jacob> just tweeted from my Java Chatbot " + "program! #APCSRocks @CTECNow Thanks @cscheerlder & @codyhenrichsen! ");
			//if boolean method se variable to true here
		}
		catch(TwitterException error)
		{
			baseController.handleErrors(error.getErrorMessage());
		}
	}
}
