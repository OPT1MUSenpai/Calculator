package org.example;
import javafx.util.Pair;
import java.util.*;

public class Main {
    public double myAdd(double a, double b){
        return a+b;
    }
    public double mySubs(double a, double b){
        return a-b;
    }
    public double myMult(double a, double b){
        return a*b;
    }
    public Pair<Boolean, Double> myDivi(double a, double b){
        if(b == 0){
            return new Pair<Boolean, Double>(false,-1.0);
        }
        return new Pair<Boolean, Double>(true, (a/b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my Calculator");
        Main calc = new Main();
        

        int choice = 5;
        do {
            System.out.println(" 1. Addition ");
            System.out.println(" 2. Subtraction ");
            System.out.println(" 3. Multiplication ");
            System.out.println(" 4. Division ");
            System.out.println(" 5. EXIT ");
            System.out.print(" Enter your Choice : " );
            choice = sc.nextInt();
            double a,b;
            switch(choice){
                case 1 :
                    System.out.print(" Enter two numbers : " );
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(" Ans : "+calc.myAdd(a,b));
                    break;
                case 2 :
                    System.out.print(" Enter two numbers : " );
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(" Ans : "+calc.mySubs(a,b));
                    break;
                case 3 :
                    System.out.print(" Enter two numbers : " );
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println(" Ans : "+calc.myMult(a,b));
                    break;
                case 4 :
                    System.out.print(" Enter two numbers : " );
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Pair<Boolean, Double > ans = calc.myDivi(a, b);
                    if(!ans.getKey()) {
                        System.out.println("Division by 0 encountered!");
                    }
                    else {
                        System.out.println(" Ans : " + ans.getValue());
                    }
                    break;
                case 5 :
                    System.out.print("Exit Initiated!" );
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();
        } while(choice != 5);
        sc.close();
    }
}
