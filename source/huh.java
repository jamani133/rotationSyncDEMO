import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class huh extends PApplet {

float armpos[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
public void setup(){
    
    strokeWeight(5);
}
public void draw(){
    colorMode(HSB);
    background(0);
    for(int i = 0;i < 36;i++){
        armpos[i] = armpos[i] + i;
        stroke(i*10,255,128,200);
        if(i != 1){
            line(500,450,sin(armpos[i]/1000)*400+500,cos(armpos[i]/1000)*400+450);
        }else{
            line(500,450,sin(armpos[i]/1000)*420+500,cos(armpos[i]/1000)*420+450);
        }
    }
}
public void mousePressed(){
    for(int i = 0;i < 36;i++){
        armpos[i] = 0;
    }
}
  public void settings() {  size(1000,900); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "huh" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
