/**<h1>Project Title: Groceries</h1>
*<b>Purpose of Project:</b><br>
*<p>Class Design</p>
*<b>How to start the project instructions:</b><br>
*<p>In CMD</p>
*<b>User Instructions:<b/><br>
*<p>Does not use args[]</P>
*<br>
*@author Mark Mercer
*@version 1
*@since 2017-12-08
*/

import java.util.Scanner; //Must import this
import javax.swing.JOptionPane;

public class Groceries {
  /**<b>Class Description: Driver Class</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  /*public String printMoney (double money) {
    String pM = String.format ("$%.2f", money);
    System.out.println(pM);
    return pM;
  }*/

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args unused
  *@return
  *@throws
  */

   public static void main(String[] args)
   throws NumberFormatException
   {

   String preAuth_string1 = JOptionPane.showInputDialog ("Pre-authorization " +
   "for the amount of money you might spend. \nPlease enter only dollars " +
   "and cents, \nFor Example: \'\' 14.50 \'\'");

   double preAuth = Information.checkDoubleEntry(preAuth_string1);

   Boolean preAuthB = Information.checkZeroEntry (preAuth);

   if ( preAuthB == true);
      System.out.println ("User entered zero $");
      JOptionPane.showMessageDialog (null, "A Pre-Authorization amount has not " +
      "been entered. Please correct this issue and restart the " + "program.",
      "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
    } else {
      System.out.println ("User entered $" + preAuth);
      JOptionPane.showMessageDialog (null, "I understand you have entered " +
                Information.printMoney(preAuth), "INFORMATION MESSAGE",
                JOptionPane.INFORMATION_MESSAGE);
}
   //Groceries obj = new Groceries(); //Accesses all methods here;
   System.out.println ("User enters a number of apples");
   String apples_string = JOptionPane.showInputDialog ("Let's fill the box. \n" +
   "Please enter how many whole Apples you would like. \n" +
   "        Apples cost: " + Information.printMoney( Information.appleCost ) +
   " per apple");
   int appleNumber = Information.checkIntEntry(apples_string);
   System.out.println ("User entered: " + appleNumber + "apples.\n");

   System.out.println ("User enters a number of oranges");
   String oranges_string = JOptionPane.showInputDialog ("Please enter how many " +
                            "whole oranges you would like.\n" +
                            "         Oranges cost: " + Information.printMoney(Information.orangeCost)
                            + "" + " per orange")
   int orangeNumber = Information.checkIntEntry(oranges_string);
   System.out.println ("User entered: " + orangeNumber + " orange.\n");

   System.out.println ("User enters a number of boxes of chocolate");
   String chocolate_string = JOptionPane.showInputDialog ("Please enter how many " +
                              "whole boxes of chocolate you would like.\n" +
                              "          Boxes of Chocolate cost: " +
                              Information.printMoney(Information.chocolateBoxCost) +
                              " per box of chocolate");
      int chocolateNumber = Information.checkIntEntry(chocolate_string);
      System.out.println ("User entered: " + chocolateNumber + " chocolate.\n");

      Double moneyLeft = preAuth - ( ( appleNumber * Information.appleCost) +
      (orangeNumber * Information.orangeCost) + (chocolateNumber * Information.chcolateBoxCost));
      System.out.println ("Pre-authorization is: " + preAuth +
                          "\nMoney Left is: " + moneyLeft);
      double totalBill = 0.0;

      Boolean moneyLeftB = Information.checkLessZeroEntry (moneyLeft);

      if ( moneyLeftB == true ) {
        JOptionPane.showMessageDialog (null, "I am sorry:\n" +
        "The pre-authorization amount entered will not pay for the" +
        "amount of groceries.\nPlease check with your bank and restart " +
        "the programe.", "WARNING MESSAGE", JOptionPane.WARNING_MESSAGE);
      System.exit(0);
    } else {
      totalBill = (appleNumber * Information.appleCost ) + (orangeNumber * Information.orangeCost) +
                            (chocolateNumber * Information.chocolateBoxCost);
    }
}


    JOptionPane.showMessageDialog (null, "I understand you have entered:\n" +
    appleNumber + " Apples\n" +
    orangeNumber + " Oranges\n" +
    chocolateNumber + " Boxes of Chocolate\n" +
    "\nThe Total Bill for the items is: " + Information.printMoney(totalBill)
    + "" + "", "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);

    double diameter = Information.appleDiameter;
    Apple apples1 = new Apple ( appleNumber, diameter );
    System.out.println(apples1);
    System.out.println("The total bill for Apples is: " + Information.printMoney(apples1.getTotalCost() ) );
    diameter = Information.orangeDiameter;
    Orange oranges1 = new Orange (orangeNumber, diameter);
    System.out.print.ln(oranges1);
    System.out.println("The total bill for Oranges is: " + Information.printMoney(oranges1.getTotalCost() ) );

  }
}    /*String moneyYouHave_string1 = JOptionPane.showInputDialog ("Tell me how much " +
            "money you have.\n Please enter only dollars and cents, \n" +
            "For Example: \'\' 14.50 \'\'");
   Double moneyYouHave_double = 0.00;
*/
   try {
       moneyYouHave_double = Double.parseDouble(moneyYouHave_string1);
   }
   catch (NumberFormatException ne1) {
       System.out.println ("User failed first attempt "+
                           "inputing money value.");
       String moneyYouHave_string2 = JOptionPane.showInputDialog ("Please " +
               "enter a dolars and cents value\n" +
               "For example: \' 14.50 \'");
       try {
         moneyYouHave_double = Double.parseDouble(moneyYouHave_string2);
       }
       catch (NumberFormatException ne2) {
         System.out.println ("User failed a second attempt for " +
                            "the total money to spend");
         JOptionPane.showMessageDialog (null, "Please restart the program", "Second Attempt Failed", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
       }
     }

     double totalMoneyIn = moneyYouHave_double;
     if ( moneyYouHave_double == Math.abs(0.0) ) { //Checks to see if the try-catch worked
       System.out.println ("Users failed to enter a total amount " +
                           "of money to spend");
       JOptionPane.showMessageDialog (null, "You have not entered a total amount of money to spend.", "Please restart the program", JOptionPane.ERROR_MESSAGE);
       System.exit(0);
     } else {
       System.out.println ("User entered: " + totalMoneyIn);
       JOptionPane.showMessageDialog (null, "I understand you entered " +
            obj.printMoney(totalMoneyIn), "Money to Spend", JOptionPane.INFORMATION_MESSAGE);
          }
          String apples_string1 = JOptionPane.showInputDialog ("Let's fill the box.\n" +
          "Please enter how many whole Apples you would like.");
          int apples_int = 0; //default value for apples
          double apples_double = 0.0; //used to catch user entry if value has a decimal
          String apples_string2 = ""; //need to assign for IF inside Try-Catch

          //Build the tryCatch for the number of apples, oranges, and cheese blocks
          //This will need a flow chart for students! Print this out as variables
          try { //note: once a line fails, rest of try will not run
          apples_double = Double.parseDouble(apples_string1);
          //If parseDouble fails, user probably entered a string
          //If parseDouble passes, user probably entered an integer
          apples_double = 0.0; //reset this value and further test apples_string1
          }
          catch (NumberFormatException ne3) {
          System.out.println ("User has failed first attempt at entering apples");
          apples_string2 = JOptionPane.showInputDialog ("Please " +
                         "enter how many whole Apples.\n" +
                         "For example: \' 3 \'");
          try {
            apples_double = Double.parseDouble(apples_string2);
          }
          catch (NumberFormatException ne4) {
            System.out.println ("User failed a second attempt for " +
                              "an integer value of apples.");
            JOptionPane.showMessageDialog (null, "Please restart the program and " +
                       "enter a whole number of apples, as a whole number.", "ERROR " +
                       "MESSAGE", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
          }
          }
          if (apples_double > 0.0 ) {
          try {
            System.out.println ("Second attempt might be successful.");
            apples_int = Integer.parseInt(apples_string2);
            apples_string1 = apples_string2;
            System.out.println("Second attempt successful and variables reassigned.");
            apples_double = 0.0; //reset this value for math afterward
          }
          catch (NumberFormatException ne5) {
            System.out.println ("User failed a second attempt for " +
                                "an integer value of apples.");
            JOptionPane.showMessageDialog (null, "Please restart the program and " +
                        "enter a whole number of apples, as a whole number.", "ERROR " +
                        "MESSAGE", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
          }
          }
          try {
          System.out.println ("User entered a double or int for number of apples.");
          apples_int = Integer.parseInt(apples_string1);
          //If parseInt fails, user probably entered a decimal
          System.out.println ("User an int for number of apples.");
          }
          catch (NumberFormatException ne6) {
          System.out.println ("User a decimal value for the number of apples.");
          apples_string2 = JOptionPane.showInputDialog ("It seems you have entered " +
                " a decimal number.\nPlease enter a number of whole Apples.\n" +
                "For example: \' 3 \'");
           try {
             apples_int = Integer.parseInt(apples_string2);
             apples_double = 0.0;
           }
           catch (NumberFormatException ne7) {
             System.out.println ("User failed a second attempt for " +
                                 "the whole number of apples.");
             JOptionPane.showMessageDialog (null, "Please restart the program and " +
                        "enter a whole number of apples, as a whole number.", "ERROR " +
                        "MESSAGE", JOptionPane.ERROR_MESSAGE);
             System.exit(0);
           }
          }

          System.out.println ("Hello");
          //Output all the variales to check values and reset if necessary
          System.out.println (apples_int);
          System.out.println (apples_double);
          System.out.println (apples_string1);
          System.out.println (apples_string2);

     //Asking user for groceries amount: apples, oranges, cheese
     //System.out.println();
     //JOptionPane
     //tryCatch: string to an int, through a double (decimal)



     //Formating decimals to two decimal places
     //String s = String.format ("$%.2f", totalMoneyIn);
     //System.out.println("You have entered " + s);
     //"The money to spend here is %.2f",


     //Double input_double = Double.parseDouble(input_string);

     //System.out.println(input_double+2.50);

     //JOptionPane.showMessageDialog (null, "$" + input_string, "You told me " +
     //           " you have: ", JOptionPane.ERROR_MESSAGE);
     //INFORMATION_MESSAGE
     //ERROR_MESSAGE
     //WARNING_MESSAGE
     //QUESTION_MESSAGE

     //System.out.println("$" + input_double);




   }
}

//Scanner input = new Scanner ( System.in );
//String statement = input.nextLine();

//String input = JOptionPane.showInputDialog ("Press 1 for Monday");
