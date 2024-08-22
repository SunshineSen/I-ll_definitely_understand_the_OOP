package Lec.Ex3;


/**
 * Это точка 2D
 */
public class Point2D {
     int x, y;
    
    /**
     * Это конструктор 
     * @param valueX координата х
     * @param valueY координата у
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
       
    }

    public Point2D(int value) {
        this(value, value);
    }

  
    // public Point2D() {
    //   x = 0;
    //   y = 0;
    // }

    // public Point2D(int value) {
    //    x = value;
    //    y = value;
    // }



   public String getInfo() {
        return String.format("x: %d; y: %d", x, y);
   }

   @Override
   public String toString() {
       return getInfo();
   }
}
