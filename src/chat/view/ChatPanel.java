package chat.view;

import javax.swing.*;
import chat.controller.ChatController; //ChatController
import java.awt.Color;
import java.awt.event.*;
//Method Documentation
/**
 * 
 * @author jwil9706
 * December 3 2015 v.1.00
 */
public class ChatPanel extends JPanel //Gui Class, and Chatbot Class
{
	private ChatController baseController;
	private JButton submitButton;
	private JButton testButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextField typingField;
	private JLabel promptLabel;
	private JTextArea chatArea;
	private JScrollPane textPane;
	private JButton tweetButton;
	private JButton saveButton;
	private JButton loadButton;
	
	public ChatPanel(ChatController baseController)
	{
		//chatArea = new JTextArea(10, 25);
		//typingField = new JTextField(25);
		
		//testButton =new JButton("Chat");
		
		//this.baseController = baseController;
		
		//baseLayout = new SpringLayout();
		//submitButton = new JButton("Please do not click the button"); //New Data Member
		//firstTextField = new JTextField("Words can be typed here");
		//chatArea = new JTextArea();
		//promptLabel = new JLabel();
		//typingField = new JTextField();
		//setupChatPane();
		//setupPanel();
		//setupLayout();
		//setupListeners();
		
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(10,25);
		typingField = new JTextField(25);
		testButton = new JButton("chat");
		
		setupChatPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupChatPane()
	{
		textPane = new JScrollPane(chatArea);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEnabled(false);
		chatArea.setBackground(Color.ORANGE);
		chatArea.setEditable(false);
		textPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		textPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 143, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -50, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -10, SpringLayout.EAST, this);
	}
	
	private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.setBackground(Color.BLUE);
			this.add(firstTextField);
			this.add(chatArea);
			this.add(submitButton);
			this.add(promptLabel);
			typingField.setToolTipText("Type here for the chatbot");
			chatArea.setEnabled(false);
			
		}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//need to do this
				//grab user typed answer
				//display typed answer
				//send the text to chatbot
				//chatbot will process
				//display the response
				String userText = typingField.getText();
				chatArea.append(userText);
				typingField.setText("");
				String response = baseController.userToChatbot(userText);
				chatArea.append("\nChatbot: " + response);
			}
		});
	}
	
	public JTextField getTextField()
	{
		return typingField;
	}
}
