package com.Min3CraftDud3.Wasted.GameStates;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class OptionsState extends BasicGameState{
	@Override
	public void init(GameContainer container, StateBasedGame sbg)
			throws SlickException {
	}
	@Override
	public void render(GameContainer container, StateBasedGame sbg, Graphics g)
			throws SlickException {	
		g.drawString("==== Options ====", 100, 100);
		g.drawString("Option 1", 100, 125);
		g.drawString("Option 2", 100, 150);
		g.drawString("Option 3", 100, 175);
		g.drawString("Option 4", 100, 200);
	}
	@Override
	public void update(GameContainer container, StateBasedGame sbg, int i)
			throws SlickException {		
	}
	@Override
	public int getID() {
		return 2;
	}
}
