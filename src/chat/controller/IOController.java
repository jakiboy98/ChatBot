package chat.controller;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

import java.swing.JOptionPane;

public class IOController
{
	public static String saveFile(String textToSave)
	{
		String fileName = "Saved Chat File - ";
		fileName += Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		fileName += ":" + Calendar.getInstance().get(Calendar.MINUTE);
		fileName += ".txt";
		FileWriter chatWriter;
		try
		{
			chatWriter = new FileWriter(fileName);
			chatWriter.write("This is the " + fileName + "\n");
			chatWriter.write(textToSave);
			chatWriter.close();
			JOptionPane.showMessageDialog(null, "File saved as: " + fileName);
		}
		catch
		{
			JOptionPane.showMessageDialog(null, ioError.getMessage());
		}
		
		return fileName;
	}
	
	public static String readTextFromFile(String fileName)
	{
		String text = "";
		File chatTextFile = new File(fileName);
		Scanner chatScanner;
		try
		{
			chatScanner = new Scanner (chatTextFile);
			while(chatScanner.hasNext()){
				text += chatScanner.nextLine();
			}
			chatScanner.close();
			javax.swing.JOptionPane.showMessageDialog(null, fileName + " was loaded to the chatArea");
		}
		catch (IOException ioError)
		{
			javax.swing.JOptionPane.showMessageDialog(null, ioError.getMessage());
		}
		
		return text;
	}
}
