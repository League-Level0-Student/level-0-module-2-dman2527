 // 1. Create three integer variables to represent the x, y, and the size of the ellipse
    import java.util.Random;
      int x = 100;
      int y = 100;
      int sizex = 100;
      int sizey = 100;
    void setup() {
      // 2. Set the size of your sketch
    size(400,400);
    }
    
    void draw() {
      // 3. Set the background color of your sketch
      background(#DEDEDE);
      // 4. Draw an ellipse. Make sure it fits in the window.
      // Use the variables created at the top of the sketch, 
      // for the location and size of your ellipse
    ellipse(x,y,sizex,sizey);
    }
    
    void mousePressed() {
      //5. Create an integer variable called distance
      int distance = getDistance( x, y, mouseX, mouseY);
      //6. Set the value of the distance variable to the value returned by the getDistance method
      //   Pass the mouse's x and y (mouseX and mouseY) and the x and y of your ellipse to the method.
        
          
      //7.  Use an if statement to check if the distance variable is < the radius of the ellipse
      //    If it is, set a new x and y for the ellipse, using a random location on the window
      //    Hint: Use the Processing random() function
       if (distance < 400){
         x = 0;
  Random randomMaker = new Random();
 x = randomMaker.nextInt(400)+ x;
         y = 0;
         Random randomMaker1 = new Random();
         y = randomMaker1.nextInt(400) + y;
       }
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
