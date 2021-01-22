#import "Common/ShaderLib/GLSLCompat.glsllib"

uniform vec4 m_Color;

varying vec3 baryCoord;
varying vec4 vertColor;

void main(){
    vec4 color = vec4(1.0);

    #ifdef HAS_VERTEXCOLOR
        color *= vertColor;
    #endif

    #ifdef HAS_COLOR
        color *= m_Color;
    #endif

    // Add barycentric calc
    float max_edge_dist = 0.02;
    float alpha = 0.0;
    float closest_edge = min(baryCoord.x, min(baryCoord.y, baryCoord.z)); 
    if(closest_edge < max_edge_dist)
    {
        alpha=(max_edge_dist-closest_edge)/max_edge_dist;
    }

    gl_FragColor = vec4(color.rgb, alpha);
}