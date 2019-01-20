package com.yarharharddrive;

import com.yarharharddrive.engine.Game;
import com.yarharharddrive.engine.GameLogger;
import com.yarharharddrive.screens.LauncherScreen;

public class ClientCode
{
	private Game game;
	
	public ClientCode()
	{
		GameLogger.logEvent("Initializing the Engine", "info");
		game = new Game(720, 480, "Michael Jackson's Mansion");
		game.getScreenFactory().showScreen(new LauncherScreen(game.getScreenFactory()));
	}
	
	public static void main(String[] args)
	{
		new ClientCode();
	}
}
