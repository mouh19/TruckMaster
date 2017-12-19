/**
 * Created by Bartek on 08/09/2017.
 */

package com.truck.master;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import java.util.Random;


class MapManager {

    private TiledMap tiledMap;
    private TiledMapRenderer tiledMapRenderer;

    public void init()
    {
        tiledMap = new TmxMapLoader().load("Maps/map1.tmx");
        tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
    }

    public void draw(OrthographicCamera camera)
    {
        tiledMapRenderer.setView(camera);
        tiledMapRenderer.render();
    }

}
