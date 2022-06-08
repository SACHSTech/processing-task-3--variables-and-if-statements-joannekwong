import processing.core.PApplet;
import java.util.*;
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    int randomNum =  (second()%4);
    if(randomNum == 0 || randomNum == 1){
      background(110, 192, 255);
    
    }
    if(randomNum == 2 || randomNum == 3){
      background(78, 3, 135);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    fill(255, 255, 255);
    rect(0, 0, 150, 50);
    fill(0, 0, 0);
    size(400, 400);
    textSize(50);
    int minute = minute();
    int hour = hour();
    text(hour + ":" + minute, 0, 40);
    
// random number generator
    randomSeed(minute());
    int randomNum =  (second()%4);
// 0,1 - nighttime, pink
// 2,3 - morning time, dark blue
    
    float flowerX = 120;
    float flowerY = 270;
    float petalSize = 50;
    float petalDistance = petalSize / 2;

    if(randomNum == 0 || randomNum == 1){
      fill(202, 110, 255);
    
    }
    if(randomNum == 2 || randomNum == 3){
      fill(3, 86, 252);
    
    }
  // upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance,
          petalSize, petalSize);
  
  // upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance,
          petalSize, petalSize);
  
  // lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance,
          petalSize, petalSize);
  
  // lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance,
          petalSize, petalSize);
    
    if(randomNum == 0 || randomNum == 1){
      fill(181, 3, 252);
    
    }
    if(randomNum == 2 || randomNum == 3){
      fill(252, 181, 3);
    
    }
  // center petal
    ellipse(flowerX, flowerY,
          petalSize, petalSize);
  
  // flower stem
    stroke(128);
    strokeWeight(3/2);
    line(120, 400, 120, 305);
    

// house
    fill(255, 231, 110);
    rect(210, 170, 200, 200);

// roof
    fill(252, 53, 3);
    triangle(320, 90, 440, 180, 180, 180);

// door
    fill(255, 152, 25);
    rect(240, 260, 70, 110);

// grass
    fill(50, 168, 84);
    rect(0, 370, 400, 30);
  }
  
  // define other methods down here.
}