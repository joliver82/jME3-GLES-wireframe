package org.joliver82.jmewireframe;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Sphere;

public class Game extends SimpleApplication {

    @Override
    public void simpleInitApp() {
        Material wireframeMat = new Material(assetManager, "MatDefs/Wireframe.j3md");

        Geometry geometry0 = new Geometry("S0", new Sphere(10, 10, 1));
        geometry0.setLocalTranslation(-3, 0, 0);
        geometry0.setMaterial(wireframeMat);
        rootNode.attachChild(geometry0);

        Geometry geometry1 = new Geometry("S1", new Sphere(10, 10, 1));
        Material wireframeRed = wireframeMat.clone();
        wireframeRed.setColor("Color", ColorRGBA.Red);
        geometry1.setMaterial(wireframeRed);
        rootNode.attachChild(geometry1);

        Geometry geometry2 = new Geometry("S2", new Sphere(10, 10, 1));
        geometry2.setLocalTranslation(3, 0, 0);
        Material wireframeBlue = wireframeMat.clone();
        wireframeBlue.setColor("Color", ColorRGBA.Blue);
        geometry2.setMaterial(wireframeBlue);
        rootNode.attachChild(geometry2);
    }
}