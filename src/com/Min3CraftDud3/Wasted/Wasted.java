package com.Min3CraftDud3.Wasted;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.Min3CraftDud3.Wasted.GameStates.GameState;
import com.Min3CraftDud3.Wasted.GameStates.MenuState;
import com.Min3CraftDud3.Wasted.GameStates.OptionsState;

public class Wasted extends StateBasedGame{
	public Wasted(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new Wasted("Wasted Test"));
		app.setDisplayMode(1280, 720, false);
		app.start();
		
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.addState(new MenuState());
		this.addState(new GameState());
		this.addState(new OptionsState());
	}

}
