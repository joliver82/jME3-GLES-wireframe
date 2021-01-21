lo  # jME GLES Wireframe render

## About

This is an android jme3 project showing a wireframe material based on geometry shaders for GLES. Requires API level 24 (Android 7) or newer

The implementation is based on the simplest method from https://github.com/martin-pr/possumwood/wiki/Wireframe-using-a-Geometry-Shader which just changes the triangles to line strips so the fragment shader outputs lines instead

## Impl details

Vertex shader: Uses all current jme3 stuff being able to use this material.

Geometry shader: As said, just changes the triangles into line strips. 

Fragment shader: Paints the requested color. Can set Color and VertexColor


## Future work

Not sure I'll spend more time or not into this, but...

* Implement any of the other techniques from @martin-pr's tutorial for better looking and/or more configurability.
* Implement non geometry shader wireframe rendering based on barycentric coordinates. This will imply CPU code and duplicating vertex information in memory but will support openGL ES <3.2.
* Include this info jme3 core.


## Usage

Just load the project with latest Android Studio (Tested using 4.1.2) and run 


## References

* This simple project used the jme3 template from https://github.com/noncom/jme-android-example but updated to current Android Studio and SDK
* The main reference is https://github.com/martin-pr/possumwood/wiki/Wireframe-using-a-Geometry-Shader 

More on wireframe rendering on GLES:

* https://github.com/rreusser/glsl-solid-wireframe
* https://www.geeks3d.com/hacklab/20180514/demo-wireframe-shader-opengl-3-2-and-opengl-es-3-1/
* https://www.reddit.com/r/opengl/comments/34dhi7/wireframe_shader/

## License

Feel free to use this the way you want but just remember to list me in the credits ;)


