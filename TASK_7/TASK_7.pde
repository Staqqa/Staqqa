//7.A - but i dont know how to replace 6 & 10 (which is half)
int input = 20;

for (int i= input; i>=0; i--) {
  println(i);
  
  if (i==6) {
    println("Six");
  }
  else if (i==10){
    println ("half");
  }
  
}


//7.B with minus

int input = -20;

for (int i= input; i<=0; i++) {
  println(i);
  
  if (i==-6) {
    println("Six");
  }
  else if (i==-10){
    println ("half");
  }
  
}
