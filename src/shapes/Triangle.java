package shapes;

    public class Triangle {
      private double sideA ;
  private double sideB ;
private double sideC ;
   private double perimeter ;
      private double area ;


   public Triangle () {
     this.sideA = 1 ;
          this.sideB = 1 ;
    this.sideC = 1 ;
}

     public Triangle ( double a , double b , double c) {
        this.sideA = a ;
    this.sideB = b ;
        this.sideC = c ;
   this.perimeter = findPerimeter () ;
       this.area=findArea () ;
}

       private double findPerimeter () {
   return this.sideA+this.sideB+this.sideC ;
}


        private double findArea () {
     return ( this.sideB * this.sideA ) / 2 ;
}

         public void printStats() {
    System.out.println( " TRIANGLE " ) ;
   System.out.println ( " PERIMETER = " + this.perimeter);
       System.out.println  ("AREA = " + this.area);
   System.out.println ( " SIDE a = " + this.sideA ) ;
     System.out.println   ( " SIDE b = " + this.sideB ) ;
   System.out.println ( " SIDE c = " + this.sideC ) ;



}

public double getSideA () {
return sideA ;
}

     public void setSideA ( double sideA ) {
       this.sideA = sideA ;
}

          public double getSideB () {
      return sideB ;
}

      public void setSideB ( double sideB ) {
       this.sideB = sideB ;
}

           public double getSideC () {
        return sideC ;
}

   public void setSideC ( double sideC ) {
          this.sideC = sideC ;
}

        public double getPerimeter () {
           return perimeter ;
}

      public double getArea () {
return area ;
}


}
