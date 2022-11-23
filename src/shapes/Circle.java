package shapes;

public class Circle {

private double radius ;
private double circumference ;
   private double area ;

   public Circle () {
    radius = 1 ;
  circumference = findCircumference () ;
   area=findArea () ;
}

    public Circle ( double r ) {
 circumference = findCircumference () ;
    area=findArea () ;  

  this.radius = r ;
   this.circumference = r ;

}

    private double findCircumference () {
     return 2*Math.PI*radius ;
}

    private double findArea () {
  area= Math.PI* Math.pow ( radius, 2);
   return 0 ;
}

  public void printStats () {
    System.out.println( " CIRCLE " );
   System.out.println ( " RADIUS = " + this.radius );
  System.out.println ( " CIRCUMFERENCE = " + this.circumference);
      System.out.println ( " AREA = " + this.area );
}

    public double getRadius () {

   return radius ;
}


    public void setRadius ( double radius ) {
      this.radius = radius ;
}

    public double getCircumference () {
        return circumference ;
}

    public double getArea () {
      return area ;
}


}

