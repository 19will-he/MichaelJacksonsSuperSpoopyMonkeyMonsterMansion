package com.yarharharddrive.engine;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.yarharharddrive.listeners.KeyboardListener;
import com.yarharharddrive.listeners.MousepadListener;

public class Game
{
	private final JFrame window = new JFrame();
	private final ScreenFactory screenFactory;
	private final GameThread gameThread;
	private final KeyboardListener keyboardListener;
	private final MousepadListener mousepadListener;
	// private final ImageIcon icon = new ImageIcon("config\\icon.png");
	
	public Game(int winX, int winY, String title)
	{
		window.setSize(winX, winY);
		window.setTitle(title);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setFocusable(true);
		window.setLocationRelativeTo(null);
		// window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// window.setUndecorated(true);
		// window.setIconImage(new ImageIcon("icon.png").getImage());
		window.setVisible(true);
		
		screenFactory = new ScreenFactory(this);
		gameThread = new GameThread(this);
		keyboardListener = new KeyboardListener();
		mousepadListener = new MousepadListener();
		
		window.add(gameThread);
		window.addKeyListener(keyboardListener);
		window.addMouseListener(mousepadListener);
		
		new Thread(gameThread).start();
	}
	
	public KeyboardListener getKeyboardListener()
	{
		return keyboardListener;
	}
	
	public MousepadListener getMousepadListener()
	{
		return mousepadListener;
	}
	
	public ScreenFactory getScreenFactory()
	{
		return screenFactory;
	}
	
	public JFrame getWindow()
	{
		return window;
	}
}
