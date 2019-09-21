package calculate;
import java.util.Scanner;

/**

* Built using Netbeans 8.2 and JDK 1.8.0_221-b11
* 
* For ease of reference, the following convention is used to refer to the variables in the comments:

A = number1
B = number2
C = number3

*/

public class Calculate {

    public static void main(String[] args) {
        
        /* Getting user input */
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter third integer: ");
        int number3 = input.nextInt();
        
        /* Setting up the variables */
        int theSum = number1 + number2 + number3;
        int theAvg = theSum / 3;
        int theProduct = number1 * number2 * number3;
        int theLargest = 0;
        int theSmallest = 0;
        boolean isLargest = true;
        boolean isSmallest = true;
        
        /* Begin finding largest and smallest numbers */
        
            /* Begin case one or more numbers are equal */
            
            if (number1 == number2 && number2 == number3) {
            /* A = B = C : there is no largest or smallest number */
                isLargest = false;
                isSmallest = false;
            }

            else if (number1 == number2 && number1 > number3) {
                // A = B > C 
                theLargest = number1;
                theSmallest = number3;
            }

            else if (number1 == number2 && number1 < number3) {
                // A = B < C
                theLargest = number3;
                theSmallest = number1;
            }

            else if (number1 < number2 && number2 == number3) {
                // A < B = C
                theLargest = number3;
                theSmallest = number1;
            }

            else if (number1 > number2 && number2 == number3) {
                // A > B = C
                theLargest = number1;
                theSmallest = number3;
            }

            else if (number1 == number3 && number1 > number2) {
                // A = C > B
                theLargest = number1;
                theSmallest = number2;
            }

            else if (number1 == number3 && number1 < number2) {
                // A = C < B
                theLargest = number2;
                theSmallest = number1;
            }
            
            /* End case one or more numbers are equal */

            /* Begin case A is greatest number */
            
            else if (number1 > number2 && number1 > number3) {

                // A > B > C
                theLargest = number1;

                /* Begin evaluating B and C */
                if (number2 > number3) {
                    // B > C
                    theSmallest = number3;
                }

                else if (number2 < number3) {
                    // B < C
                    theSmallest = number2;
                }

                /* End evaluating B and C */
            }
            
            /* End case A is greatest number */

            /* Begin case B is greatest number */
            
            else if (number2 > number1 && number2 > number3) {

                // A < B > C
                theLargest = number2;

                /* Begin evaluating A and C */
                if (number1 > number3) {
                    // A > C
                    theSmallest = number3;
                }

                else if (number1 < number3) {
                    // A < C
                    theSmallest = number1;
                }

                /* End evaluating A and C */
            }

            /* End case B is greatest number */

            /* Begin case C is greatest number */
            else if (number3 > number1 && number3 > number2) {

                // A < B < C
                theLargest = number3;

                /* Begin evaluating A and B */
                if (number1 > number2) {
                    // A > B
                    theSmallest = number2;
                }

                else if (number1 < number2) {
                    // A < B
                    theSmallest = number1;
                }
                /* End evaluating A and B */

            }

            /* End case C is greatest number */
        
        /* End finding largest and smallest numbers */        
        
        
        /* Start of printing output */
        
        System.out.print("\nThe total of "+number1+" + "+number2+" + "+number3+" = "+theSum+".\n");
        System.out.print("The average is "+theAvg+".\n");
        System.out.print("The product is "+theProduct+".\n");
        
        if (isLargest == false && isSmallest == false) {
            System.out.print("There is neither a largest nor smallest number.\n");
        }
        
        else {
            System.out.print("The smallest number is "+theSmallest+" and the largest number is "+theLargest+".\n");
        }
        
        /* End of printing output */
        
    } // Closing main()
    
} // Closing Calculate
