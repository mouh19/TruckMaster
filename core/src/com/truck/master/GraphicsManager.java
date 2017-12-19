/**
 * Created by Bartek on 08/09/2017.
 */

package com.truck.master;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

class GraphicsManager {

    MapManager map;
    Texture img_truck;
    private OrthographicCamera camera;
    private SpriteBatch batch;

    public GraphicsManager(){
        loadTextures();
        setCamera();
    }

    public void getMap(MapManager thisMap)
    {
        map = thisMap;
    }

    private void loadTextures()
    {
        img_truck = new Texture(Gdx.files.internal("truck2.png"));
    }

    private void setCamera()
    {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        batch = new SpriteBatch();
    }

    public int update()
    {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        map.draw(camera);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw( img_truck, 70, 70);
        batch.end();
        return 0;
    }

    public int close()
    {
        batch.dispose();
        img_truck.dispose();
        return 0;
    }

}