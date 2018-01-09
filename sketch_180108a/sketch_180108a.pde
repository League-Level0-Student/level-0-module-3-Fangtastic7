size(500,500);
for(int i=1;i<10;i++){
  
  if(i%2==0){
    fill(255,0,0);
  }
  else  {
    fill(255,255,255);
  }
  ellipse(50 ,50 , 10  * i  , 10 * i );
  print(i);
}