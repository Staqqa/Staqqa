int[] arr = {28, 230, 9, 310, 72};

void setup() {
  
  int randoM = getRandom_();
  println("Random tal fra array: " + randoM);
}

int getRandom_() {
  int r1 = int(random(arr.length));
  return arr[r1];
}
