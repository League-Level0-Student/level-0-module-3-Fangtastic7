size(500,500);
for(int i=10;i>1;i--){
  
  if(i%2==0){
    fill(255,0,0);
  }
  else  {
    fill(255,255,255);
  }
  ellipse(250 ,250 , 10  * i  , 10 * i );
  print(i);
}