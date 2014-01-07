package com.Min3CraftDud3.Wasted.GameStates;

import java.util.Random;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState{
	int tileX=32, tileY=32;
	int mapX=500, mapY=500;
	static int[][] tilemap;
	static int rows, columns;
	
	@Override
	public void init(GameContainer container, StateBasedGame sbg)
			throws SlickException {
		createTilemap();
	}
	@Override
	public void render(GameContainer container, StateBasedGame sbg, Graphics g)
			throws SlickException {	
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int mod_i = (16*i)+1;
				int mod_j = (16*j)+1;
				switch (tilemap[i][j]) {
				case 0:
					g.setColor(Color.green);
					g.fillRect(mod_i, mod_j, 16, 16);
					break;
				case 1:
					g.setColor(Color.gray);
					g.fillRect(mod_i, mod_j, 16, 16);
					break;
				case 2:
					g.setColor(Color.gray);
					g.fillRect(mod_i, mod_j, 16, 16);
					break;
				case 3:
					g.setColor(Color.green);
					g.fillRect(mod_i, mod_j, 16, 16);
					break;
				case 4:
					g.setColor(Color.gray);
					g.fillRect(mod_i, mod_j, 16, 16);
					break;	
				case 5:
					g.setColor(Color.green);
					g.fillRect(mod_i, mod_j, 16, 16);
				}
			}
		}
		g.setColor(Color.black);
		g.drawString("Wasted New Game Window", 100, 100);
	}
	@Override
	public void update(GameContainer container, StateBasedGame sbg, int i)
			throws SlickException {		
	}
	@Override
	public int getID() {
		return 1;
	}
	private void createTilemap() {

		tilemap = new int[500][500];

		rows = tilemap.length;
		columns = tilemap[49].length;


		Random r = new Random();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				tilemap[i][j] = r.nextInt(6);
			}
		}
	}
}
