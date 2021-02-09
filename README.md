# jME GLES Wireframe render sample application

## About

This is an android jme3 project showing two different wireframe rendering methods GLES:

* Geometry shader implementation: Using this method requires openGLES >= 3.2 and Android API level 24 (Android 7) or newer.
* Barycentric coordinates implementation: This method is available to any openGLES version without API level limitation.

The app requires API level 24 (Android 7) or newer, this could be lowered if removing the code making use of Wireframe.j3md

This application demonstrate the functionality of https://github.com/joliver82/jme3-wireframe for inner details go to the library page

## Usage

Just load the project with latest Android Studio (Tested using 4.1.2) and run 

The sample app shows four spheres from left to right, top to bottom: jME3 default wireframe mode (will render solid on android), Barycentric coordinates approach mimicing jME3's default, Geometry shader approach and Barycentric coordinates approach mimicing geometry shader approach.

Desktop screenshot:
![Alt text](/screenshots/wireframe-desktop.png?raw=true "Desktop screenshot")

Android screenshot:
![Alt text](/screenshots/wireframe-android.png?raw=true "Android screenshot")

The sample app has been updated to show 6 spheres including both reserved buffer (center spheres) and normal buffer (right spheres) based

## References

* Designed for jMonkeyEngine 3 https://github.com/jMonkeyEngine/jmonkeyengine/
* Using jme3-wireframe library https://github.com/joliver82/jme3-wireframe
* Using Heart library from stephengold https://github.com/stephengold/Heart

