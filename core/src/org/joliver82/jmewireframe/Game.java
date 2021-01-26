package org.joliver82.jmewireframe;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.material.RenderState;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.shape.Sphere;

import org.joliver82.jme3utils.wireframe.BarycentricCoordGenerator;

public class Game extends SimpleApplication {

    @Override
    public void simpleInitApp() {
        flyCam.setDragToRotate(true);
        cam.setLocation(new Vector3f(0f,0f,7f));

        // Materials
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        mat.getAdditionalRenderState().setWireframe(true);
        Material wireframeMat = new Material(assetManager, "MatDefs/Wireframe.j3md");
        wireframeMat.setColor("Color", ColorRGBA.Red);
        Material matWireframeBarycentric = new Material(assetManager, "MatDefs/BarycentricWireframe.j3md");
        matWireframeBarycentric.setColor("Color", ColorRGBA.Green);
        Material matWireframeBarycentricNotCulling = new Material(assetManager, "MatDefs/BarycentricWireframe.j3md");
        matWireframeBarycentricNotCulling.setColor("Color", ColorRGBA.White);
        matWireframeBarycentricNotCulling.getAdditionalRenderState().setFaceCullMode(RenderState.FaceCullMode.Off);
        matWireframeBarycentricNotCulling.getAdditionalRenderState().setDepthTest(false); //Disabled depth test because some backfaces were not rendered properly

        // Uses jme3 renderstate wireframe
        Geometry geometry0 = new Geometry("S0", new Sphere(10, 10, 1));
        geometry0.setLocalTranslation(-1.5f, 1.5f, 0);
        geometry0.setMaterial(mat);
        rootNode.attachChild(geometry0);

        // Uses geometry shader aproach
        Geometry geometry1 = new Geometry("S1", new Sphere(10, 10, 1));
        geometry1.setLocalTranslation(-1.5f, -1.5f, 0);
        geometry1.setMaterial(wireframeMat);
        rootNode.attachChild(geometry1);

        // Uses Barycentric coordinates aproach
        Mesh barySphere0 = BarycentricCoordGenerator.setBarycentricCoords(new Sphere(10, 10, 1));
        Geometry geometry2 = new Geometry("S2", barySphere0);
        geometry2.setLocalTranslation(1.5f, 1.5f, 0);
        geometry2.setMaterial(matWireframeBarycentric);
        rootNode.attachChild(geometry2);

        // Uses Barycentric coordinates aproach
        Mesh barySphere1 = BarycentricCoordGenerator.setBarycentricCoords(new Sphere(10, 10, 1));
        Geometry geometry3 = new Geometry("S3", barySphere1);
        geometry3.setLocalTranslation(1.5f, -1.5f, 0);
        geometry3.setMaterial(matWireframeBarycentricNotCulling);
        rootNode.attachChild(geometry3);
    }

}