import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {

        int i,x, fact = 1;
        System.out.println("Enter an integer x");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        //int number=5;//It is the number to calculate factorial
        for (i = 1; i <= x; i++) {
            fact = fact * i;
        }
            System.out.println("Factorial of " + x + " is: " + fact);
        }
    }
