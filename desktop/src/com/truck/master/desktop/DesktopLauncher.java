package com.truck.master.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.truck.master.TruckMaster;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "TruckMaster";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new TruckMaster(), config);
	}
}
