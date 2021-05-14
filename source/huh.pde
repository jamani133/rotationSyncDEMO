float armpos[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
void setup(){
    size(1000,900);
    strokeWeight(5);
}
void draw(){
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
void mousePressed(){
    for(int i = 0;i < 36;i++){
        armpos[i] = 0;
    }
}
