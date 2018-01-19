import java.util.Scanner;
import javax.swing.JOptionPane;

public class Information {


  public static final double appleCost = 1.3465;
  public static final double appleDiameter = 7.2;
  public static final double orangeCost = 2.315468;
  public static final double orangeDiameter = 7.2;
  public static final double chocolateBoxCost = 6.1235874;
  public static final double chocolateBoxwidth = 5;
  public static final double chocolateBoxLength = 5;
  public static final double chocolateBoxHeight = 5;

  public static final double box1Width = 1.5 * 12 * 2.54;
  public static final double box1Length = 2.0 * 12 * 2.54;
  public static final double box1Height = 1 * 12 * 2.54;

  public static String printMoney (double money) {
    String pM = String.format ("$%.2f", money);
    System.out.println("Current Money output is " + pM);
    return pM;
  }

  public static double checkDoubleEntry (String userNumber) {
    userNumber = userNumber.trim();
    double preAuth = 0.0;
    double preAuth_double = 0.0;
    try {
      preAuth_double = Double.parseDouble(userNumber);
    }
    catch (NumberFormatException ne1) {
      System.out.println ("User has failed first attempt at entering Pre-Authorization");
      String preAuth_userNumber2 = JoptionPane.showInputDialog ("Please " +
              "enter a dollars and cents value\n" +
              "For example: \' 14.50 \'");
     try {
        preAuth_double = Double.parseDouble(preAuth_userNumber2);
      }
      catch (NumberFormatException ne2) {
        System.out.println ("User failed a second attempt for Pre-authorization");
        JOptionPane.showMessageDialog (null, "Please restart the program", "" +
                    "Second Attempt Failed", JOption.ERROR_MESSAGE);
        System.exit(0);
      }
  }
  return preAuth = preAuth_double;
}

public static int checkIntEntry (String userNumber1) {
  userNumber1 = userNumber1.trim();
  String userNumber2 = new String();
  userNumber2 = "";
  int item_int = 0;
  double item_double = 0.0;
  try {
    item_double = Double.parseDouble(userNumber1);
    item_double = 0.0;
  }
  catch (NumberFormatException ne3) {
    System.out.println ("User has failed first attempt at entering item number");
    userNumber2 = JOptionPane.showInputDialog ("Please enter how many " +
        "whole items. \nFor example: \'3\'");
    try {
      item_double = Double.parseDouble(userNumber2);
      userNumber1 = userNumber2;
      item_double = 0.0;
    }
    catch (NumberFormatException ne4) {
      System.out.println ("User failed a second attempt for " +
                          "an integer value of items.");
      JOptionPane.showMessageDialog (null, "Please restart the program and " +
                  "enter a whole number of items, as a whole number.", "ERROR" +
                  "MESSAGE", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
  try {
    System.out.println ("User entered a double or int for number of items.");
    item_int = Integer.parseInt(userNumber1);
    System.out.println ("User entered an int for number of items.");
  }
  catch (NumberFormatException ne6) {
    System.out.println ("User entered a decimal value for the number of items.");
    userNumber2 = JOptionPane.showInputDialog ("It seems you have entered " +
                " a decimal number.\nPlease enter a number of whole items. \n" +
                "For example: \' 3 \'");
    try {
      item_int = Integer.parseInt(userNumber2);
      item_double = 0.0;
    }
    catch (NumberFormatException ne7) {
      System.out.println ("User failed a second attempt for " +
                          "the whole number of items.");
      JOptionPane.showMessageDialog (null, "Please restart the program and " +
                  "enter a whole number of items, as a whole number.", "ERROR" +
                  "MESSAGE", JOptionPane.ERROR_MESSAGE);
      System.exit(0);
    }
  }
  System.out.println ("Tracking variables of Procedure for debugging");
  System.out.println (item_int);
  System.out.println (item_double);
  System.out.println (userNumber1);
  System.out.println (userNumber2);
  return item_int;
}

public static Boolean checkZeroEntry(double zero) {
  Boolean zeroB;
  if ( zero ==Math.abs(0.0) ) {
    zeroB = true;
  } else {
    zeroB = false;
  }
  return zeroB;
}

public static Boolean checkLessZeroEntry (double lessThanZero) {
  Boolean zeroB;
  if ( lessThanZero < Math.abs(0.0) ) {
    zeroB = true;
  } else {
    zeroB = false;
  }
  return zeroB;
}
