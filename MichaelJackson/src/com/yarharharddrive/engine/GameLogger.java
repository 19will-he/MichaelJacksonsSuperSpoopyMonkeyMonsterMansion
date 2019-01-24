package com.yarharharddrive.engine;

public class GameLogger
{
	public static void logEvent(String in, String source)
	{
		System.out.println("[" + source.toUpperCase() + "] [" + ":" + ":" + "] " + in);
	}
}
