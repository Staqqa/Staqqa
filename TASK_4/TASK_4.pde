
//TASK 4.A
 
 for (int i = 0; i<=20 ; i++){
 println(i);
 }
 
 //TASK 4.B
 for (int i = 0; i<=20 ; i++){
 if (i % 2==0){
 println (i);
 }
 }
 
 //TASK 4.C
 int start = 3;
 
 for (int i= start; i>=0; i--) {
 println(i);
 }
 println ("Take Off!");
 
 
 //TASK 4.D
 
 int start = 3;
 for (int i= start; i>=0; i--) {
 if(i==3){
 println("Three");
 }
 else if(i==2){
 println("Two");
 }
 else if(i==1){
 println("One");
 }
 else if (i==0){
 println("Zero");
 println("Take Off!");
 }
 }
 

 //TASK 4.E
int i = 10;

while (i >= 0) {
  if (i==3) {
    println("Three");
  } else if (i==2) {
    println("Two");
  } else if (i==1) {
    println("One");
  } else if (i==0) {
    println("Zero");
    println("Take Off!");
  }
  println(i);
  i--;
}
