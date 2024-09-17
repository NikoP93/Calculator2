

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// "char" kan bruges ligesom string og int. Det må dog kun være et tegn.
        double num1;
        double num2;
        char op;
        double result;

        while (true) {
            System.out.println("Velkommen til regnemaskinen");
            System.out.println(" + for addition ");
            System.out.println(" - for substraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for quit");
            op = input.next().toLowerCase().charAt(0);

            if (op == 'q') break;

            num1 = inputDouble("Skriv det første tal: ");

            num2 = inputDouble("Skriv det andet tal: ");

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ugyldig operator (regne tegn)");
                    input.nextLine();
                    continue;
            } //switch end
            System.out.print("Resultat = " + result);
            System.out.println();

        }// while løkke slut
    }//main

    static double inputDouble(String promt) {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        double num = 0;

        do {
            try {
                System.out.print(promt);
                num = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Forkert input, prøv igen");
            }
        } while (!ok);
        return num;
    }
}
