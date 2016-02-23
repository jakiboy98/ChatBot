package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author Jacob Willson
 * @version 1.1 10/23/15 Completed the lengthChecker method. Fixed the Constructor and getter for userName.
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.memesList = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		this.userName = userName;
		this.content = "Motivational Sign!";
		
		buildMemesList();
		buildPoliticalTopicsList();
	}
	
	private void buildMemesList()
	{
		this.memesList.add("Me Gusta");

		this.memesList.add("Troll");

		this.memesList.add("\"Aliens\"");

		this.memesList.add("doge");

		this.memesList.add("Bad Luck Brian");

		this.memesList.add("Unhelpful Highschool Teacher");

		this.memesList.add("Cute Animals");

		this.memesList.add("Spoderman");

		this.memesList.add("Rare Pepe");

		this.memesList.add("What if I told you...");

		this.memesList.add("cute animals");

	}
	
	private void buildPoliticalTopicList()
	{
		this.politicalTopicList.add("election");
		
		this.politicalTopicList.add("Democrat");
		
		this.politicalTopicList.add("Republican");
		
		this.politicalTopicList.add("liberal");
		
		this.politicalTopicList.add("conservative");
		
		this.politicalTopicList.add("Trump");
		
		this.politicalTopicList.add("Clinton");
		
		this.politicalTopicList.add("Biden");
		
		this.politicalTopicList.add("Carson");
		
		this.politicalTopicList.add("Rubio");
		
		this.politicalTopicList.add("Fiorina");
		
		this.politicalTopicList.add("Sanders");
		
		this.politicalTopicList.add("vote");
		
		this.politicalTopicList.add("11/4/16");
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null && currentInput.length() > 0)
		{
			hasLength = true;
		}
		
		return hasLength;
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		if (currentInput != null && currentInput.length() > 0)
		{
			hasContent = true;
		}
		
		return hasContent;
	}
	
	public boolean keyboardMashChecker(String currentInput)
	{
		boolean hasMash = false;
		if (currentInput.toLowerCase().contains("sdf") || currentInput.toLowerCase().contains("dfg") || currentInput.toLowerCase().contains("cvb") || currentInput.toLowerCase().contains(",./"))
		{
			hasMash = true;
		}
		
		return hasMash;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		return false;
	}
	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		
		for(String meme : memesList)
		{
			if(currentInput.toLowerCase().contains(meme.toLowerCase()))
			{
				hasMeme = true;
			}
		}
		
		return hasMeme;
	}
	
	public String processConversation(String currentInput)
	{
		String nextConversation = "oh what else would you like to talk about?";
		int randomTopic = (int) (Math.random() *5); //generates a random number from 1 to 4
		
		switch (randomTopic)
		{
			case 0:
				if(memeChecker(currentInput))
				{
					nextConversation = "That is a very popular meme this year. What else are you wanting to talk about?";
				}
				break;
			case 1:
				if(politicalTopicChecker(currentInput))
				{
					nextConversation = "blue pickles";
				}
				break;
			case 2:
				if(contentChecker(currentInput))
				{
					nextConversation = "fireball";
				}
				break;
			case 3:
				if(currentInput.length() > 20)
				{
					nextConversation = "cheese";
				}
				break;
			case 4:
				nextConversation = "Yes, I do like it. What else?";
				break;
			default:
				break;
		}
		
		return nextConversation;
	}
	
	public boolean quitChecker(String currentInput)
	{
		boolean okToQuit = false;
		
		if(currentInput.equalsIgnoreCase("quit"))
		{
			okToQuit = true;
		}
		return okToQuit;
	}
	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		this.content = content;
	}
}
