package rosalila.studio.mortal.parachute;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MortalParachuteGame extends Game {

	
	@Override
	public void create () {
		MenuScreen menu=new MenuScreen();
        setScreen(menu);
        Global.game=this;
        Global.menu_screen=new MenuScreen();
        Global.game_screen=new GameScreen();
	}

	@Override
	public void render () {
        super.render();
	}
}
