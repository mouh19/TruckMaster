package com.truck.master;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;


public class TruckMaster extends ApplicationAdapter {


	GraphicsManager gfx;
	MapManager map;

	@Override
	public void create() {
		gfx = new GraphicsManager();
		map = new MapManager();
		map.init();
		//map.randomTiles();
		gfx.getMap(map);

	}

	@Override
	public void render () {
		gfx.update();

		//if (Gdx.input.isTouched())
		//{
		//	Vector3 touchPos = new Vector3();
		//	touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
		//	camera.unproject(touchPos);
		//	truck.x = touchPos.x - 20/2;
		//}
	}
	
	@Override
	public void dispose () {
		gfx.close();
	}
}
