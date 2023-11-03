float characterX = 100;
float characterY = 100;
float characterSpeed = 1;
float stopPosition = 250;
boolean appleRedorGreen = true; 
float danceBattle = 0;
float danceSpeed = 2;


void setup() {
  size(500, 500);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  rectMode(CENTER);
  stroke(0);
  fill(150);

  // Update the character's X position to make it float
  if (characterX < stopPosition) {
    characterX += characterSpeed;
  }
  

  //BODY
  rect(characterX, characterY, 20, 100);
  fill(255);

  //arms
  line(characterX - 10, characterY + 10, characterX - 40, characterY);
  line(characterX + 10, characterY + 10, characterX + 40, characterY);

  //HEAD
  ellipse(characterX, characterY - 30, 60, 60);
  fill(0);

  //EYes
  ellipse(characterX - 9, characterY - 30, 16, 32);
  ellipse(characterX + 15, characterY - 30, 16, 32);
  stroke(0);

  //legs
  line(characterX - 10, characterY + 50, characterX - 20, characterY + 90);
  line(characterX + 10, characterY + 50, characterX + 20, characterY + 90);

  // Draw the apple
  fill(255, 0, 0); // Red apple
  ellipse(300, characterY + 30, 30, 30);

  fill(139, 69, 19); // Brown stem
  rect(300, characterY - -10, 5, 10);
  
  
 mousePressed(); {
  
  float distance = dist(300, characterY + 30, mouseX, mouseY);
  if (distance < 15) {
    if (appleRedorGreen) {
      println("Yes, the apple is red! Let's have a DANCE BATTLE!");
    } else {
      println("Are you colorblind???");
    }
  }
 }
}
