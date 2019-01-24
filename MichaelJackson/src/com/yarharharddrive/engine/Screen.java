package com.yarharharddrive.engine;

import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Screen
{
	private final ScreenFactory screenFactory;
	
	public Screen(ScreenFactory screenFactory)
	{
		this.screenFactory = screenFactory;
	}
	
	public abstract void onCreate();
	
	public abstract void onUpdate();
	
	public abstract void onDraw(Graphics g2d);
	
	public ScreenFactory getScreenFactory()
	{
		return screenFactory;
	}
}
