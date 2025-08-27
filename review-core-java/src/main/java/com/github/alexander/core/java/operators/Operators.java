package com.github.alexander.core.java.operators;

public class Operators {

    public static void main(String[] args) {
        /// Operators are + , - , * , %, = ,e etc

        int num = 10;
        int num2 = 4;
        /// Increment
        num++;
        /// Decrement
        num2--;
        int result = num + num2;
        result *= 10;

        System.out.println(result);

        /// Relational Operators are <, >, = and !

        int x = 6;
        int y = 10;
        boolean check = x < y;
        System.out.println("Relational Operators: " + check);

        /// Logical Operators are &(and), |(or) and !(not)

        boolean logicalOperators = x < y && check != false;
        System.out.println("Logical Operators... "+ logicalOperators);
    }
}
