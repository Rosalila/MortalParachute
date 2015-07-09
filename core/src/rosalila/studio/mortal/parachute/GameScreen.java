package rosalila.studio.mortal.parachute;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by turupawn on 7/9/15.
 */
public class GameScreen implements Screen {
    SpriteBatch batch;
    Texture background;

    Stage stage;
    @Override
    public void show(){
        System.out.println("ShowGame");
        batch = new SpriteBatch();
        background = new Texture("game_background.png");

        stage = new Stage();
        Image button = new Image(new Texture("button.png"));
        button.addListener(new ClickListener()
        {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                super.touchDown(event, x, y, pointer, button);
                Global.game.setScreen(Global.menu_screen);
                return true;
            }
        });

        Image button2 = new Image(new Texture("button2.png"));
        button2.setX(200);
        button2.addListener(new ClickListener()
        {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                super.touchDown(event, x, y, pointer, button);
                Global.game.setScreen(Global.game_screen);
                return true;
            }
        });

        stage.addActor(button);
        stage.addActor(button2);
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(background, 0, 0);
        batch.end();

        stage.draw();
        stage.act();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
