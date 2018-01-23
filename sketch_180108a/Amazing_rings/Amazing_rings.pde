float r = 150;
float p = 650;
int speed = 10;
void setup(){
size(800,500);
smooth(8);
frameRate(10);
}

void draw(){
  
  background(200,200,200);
  

  for(int i=300;i>0;i=i-10){
    noFill();
  ellipse(r, 200, i,i);
  }
  r += speed;

  for(int j=300;j>0;j=j-10){
    noFill();
    ellipse(p, 200, j, j);
}
p -= speed;

  if(r==650||p==650){
    speed = -speed;
  }

  


}