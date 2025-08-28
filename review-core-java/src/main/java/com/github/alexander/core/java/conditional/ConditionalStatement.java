package com.github.alexander.core.java.conditional;

public class ConditionalStatement {
    public static void main(String[] args) {
        int x = 7;
        int y = 8;
        int z = 9;

        /// Conditional Statement like if, else, else if, ternary and switch

        if (x > y && x > z) {
            System.out.println("Conditional Result if: False");
        } else if (y > x && y < z) {
            System.out.println("Conditional Result if: True");
        } else {
            System.out.println("Conditional Result: False");
        }

        /// Ternary
        int a = 4;
        int result = 0;

        /// if(a%2==0)
        ///     result = 10;
        /// else
        ///    result = 20;

        result = a % 2 == 0 ? 10 : 20;

        System.out.println("Ternary: " + result);

        ///  Switch
        ///  Important to use the word reserved break
        int day = 8;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter a valid number...");

        }
    }
}
