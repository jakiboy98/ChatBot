package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController baseController;
	private ChatPanel basePanel;
	
	public ChatFrame(ChatController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //installs the panel in the frame
		this.setSize(400,400);
		this.setTitle("ChatBot app!"); //find a good size for the app.
		this.setResizable(false); //can't change size of window.
		this.setVisible(true); //must be last line of setupFrame
	}
	
	public ChatController getBaseController()
	{
		return baseController;
	}
}
