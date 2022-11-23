package shapes;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub

   Scanner in = new Scanner(System.in);

 int userChoice;
   Rectangle rr = null;
 Circle cc =null;
   Triangle tt =null;
 do {
  System.out.println( " Pick a Shape " );
 System.out.println (" 1. TRIANGE " ) ;
     System.out.println( " 2. CIRCLE " ) ;
  System.out.println ( " 3. RECTANGLE " ) ;
System.out.println ( " 4. QUIT " ) ;


 System.out.println ( " Your Choice: " ) ;

    userChoice = in.nextInt();

     if(userChoice == 1) {
  System.out.println ( " You Chose Triangle! " ) ;
   System.out.println ( " Type a number for all of the sides " ) ;
 System.out.println ( " How long are the sides A/B/C " ) ;
    tt = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
   tt.printStats();
}   else if (userChoice == 2) {
 System.out.println ( " You picked Circle ! " ) ;
       System.out.println ( " Type a number for the Radius of the Circle " ) ;
    System.out.println ( " How long is the circle's radius ? ") ;
           cc = new Circle(in.nextDouble());
     cc.printStats();
       } else if(userChoice == 3) {
   System.out.println ( " You chose Rectangle ! " ) ;
      System.out.println ( " Put in a number for the length and width of the Rectangle ! " ) ;
System.out.println ( " How long is the rectangle's length and width? " ) ;
      rr = new Rectangle(in.nextDouble(), in.nextDouble());
   rr.printStats();

         }else if (userChoice == 4); {
      System.out.println ( " THIS TASK HAS BEEN COMPLETED ! " ) ;
            System.exit(0); }



      } while (userChoice != 4);
         System.out.println ( " NEW TASK " );
   



}
}