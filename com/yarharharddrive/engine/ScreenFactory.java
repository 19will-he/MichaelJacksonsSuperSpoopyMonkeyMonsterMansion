package com.yarharharddrive.engine;

public class ScreenFactory
{
	private final Game game;
	private Screen screen;
	
	public ScreenFactory(Game game)
	{
		this.game = game;
	}
	
	public void showScreen(Screen screen)
	{
		this.screen = screen;
		screen.onCreate();
	}
	
	public Screen getCurrentScreen()
	{
		return screen;
	}
	
	public Game getGame()
	{
		return game;
	}
}
