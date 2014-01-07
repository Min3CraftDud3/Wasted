package com.Min3CraftDud3.Wasted.GameStates;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuState extends BasicGameState{

	public static Double version = 1.1;
	
	//private static Boolean isFullscreen = false;
	private static Color ng = Color.white;
	private static Color cg = Color.white;
	private static Color o = Color.white;
	private static Color e = Color.white;
	public static Color u = Color.white;
	private static Color title = Color.white;
	public static String updateStr = "";
	Sound sound;
	Image bg;
	
	@Override
	public void init(GameContainer container, StateBasedGame sbg)
			throws SlickException {
		sound = new Sound("sounds/MenuSelect.ogg");
		bg = new Image("images/Background.png");
	}
	@Override
	public void render(GameContainer container, StateBasedGame sbg, Graphics g)
			throws SlickException {	
		g.drawImage(bg, 0, 0);
		g.setColor(title);
		g.drawString("==== Wasted ====", 1100, 600);
		g.setColor(ng);
		g.drawString("New Game",1100, 625);
		g.setColor(cg);
		g.drawString("Continue Game", 1100, 650);
		g.setColor(o);
		g.drawString("Options", 1100, 675);
		g.setColor(e);
		g.drawString("Exit", 1100, 700);
		g.setColor(u);
		g.drawString(updateStr, 5, 30);
	}
	@Override
	public void update(GameContainer container, StateBasedGame sbg, int i)
			throws SlickException {	
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		
		if(Mouse.isButtonDown(0)){
			System.out.println("X: "+posX+" | Y:"+posY);
		}
		//New Game 
		if((Mouse.getX()>1100 && Mouse.getX()<1175)&&(Mouse.getY()>80 && Mouse.getY()<94)){
			ng = Color.red;
			if(Mouse.isButtonDown(0)){
				sbg.enterState(1);
			}
		}else{
			ng = Color.white;
		}
		//Continue Game
		if((Mouse.getX()>1100 && Mouse.getX()<1219)&&(Mouse.getY()>54 && Mouse.getY()<68)){
			cg = Color.red;
		}else{
			cg = Color.white;
		}
		//Options
		if((Mouse.getX()>1100 && Mouse.getX()<1167)&&(Mouse.getY()>29 && Mouse.getY()<42)){
			o = Color.red;
			if(Mouse.isButtonDown(0)){
				/*try {
					Updater.updateGame();
				} catch (MalformedURLException e) {e.printStackTrace();
				} catch (IOException e) {e.printStackTrace();}
		*/
				sbg.enterState(2);
			}
		}else{
			o = Color.white;
		}
		//Exit
		if((Mouse.getX()>1100 && Mouse.getX()<1193)&&(Mouse.getY()>0 && Mouse.getY()<25)){
			e = Color.red;
			if(Mouse.isButtonDown(0)){
				System.exit(0);
			}
		}else{
			e = Color.white;
		}
	}
	@Override
	public int getID() {
		return 0;
	}
}
