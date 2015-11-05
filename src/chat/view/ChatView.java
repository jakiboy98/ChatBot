package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ChatView
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatView()
	{
			windowMessage = "Hello from your friendly chatbot :D";
			chatIcon = new ImageIcon(getClass().getResource("images/Roy_Mustang.jpg"));
			
	}
	
	public void displayText(String displayText)
	{
		JOptionPane.showMessageDialog(null, displayText, windowMessage, JOptionPane.INFORMATION_MESSAGE, chatIcon);
	}
	
	public String grabInput(String displayText)
	{
		String userInput = "";
		
		userInput = JOptionPane.showInputDialog(null, displayText, windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon, null, "Answer here :)").toString();
		
		return userInput;
	}
	
	
}