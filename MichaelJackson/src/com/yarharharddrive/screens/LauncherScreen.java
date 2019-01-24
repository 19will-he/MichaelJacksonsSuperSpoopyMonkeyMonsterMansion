package com.yarharharddrive.screens;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import com.yarharharddrive.engine.GameLogger;
import com.yarharharddrive.engine.Screen;
import com.yarharharddrive.engine.ScreenFactory;

public class LauncherScreen extends Screen
{
	private int x = 0, y = 0;

	public LauncherScreen(ScreenFactory screenFactory)
	{
		super(screenFactory);
	}
	
	@Override
	public void onCreate()
	{
		GameLogger.logEvent("Creating Launcher", "info");
	}
	
	@Override
	public void onUpdate()
	{
		if(getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_A))
		{
			x -= 1;
		}
		if(getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_D))
		{
			x += 1;
		}
		if(getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_W))
		{
			y -= 1;
		}
		if(getScreenFactory().getGame().getKeyboardListener().isKeyPressed(KeyEvent.VK_S))
		{
			y += 1;
		}
	}

	@Override
	public void onDraw(Graphics g2d)
	{
		g2d.setColor(Color.black);
		g2d.fillRect(0, 0, 720, 480);
		g2d.setColor(Color.cyan);
		g2d.fillRect(x, y, 10, 10);
	}
}
