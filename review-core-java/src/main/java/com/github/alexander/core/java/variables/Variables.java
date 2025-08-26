package com.github.alexander.core.java.variables;

public class Variables {
    public static void main(String[] args) {
        /// Variables in Java

        /// Data type: Primitives are Integer(int(4 bytes), long(8 bytes), short(2 bytes), byte(1 byte)),
        /// Float(4 bytes, double(8 bytes)), Character(char(2 bytes)) and Boolean(true or false)

        ///Primitives
        int num = 1000;
        int num2 = 1400;
        float salary = 980.00f;
        byte by = (byte) 129;
        short sh = 558;
        long lg = 5854l;
        char c = 'S';
        boolean boo = true;

        /// Literals are value of boolean, numeric, character, or string data.
        /// Any constant value that can be assigned to the variable is called a literal
        int lit = 10_00_00_000;

        /// Conversion types
        //byte b = 127;
        int a = 257;
        /// Cast
        byte k = (byte) a;

        float f = 10.0f;
        int i = (int) f;

        System.out.println("Result: "+ (num + num2));
        System.out.println("Float: " + salary);
        System.out.println("Byte: " + by);
        System.out.println("Short: " + sh);
        System.out.println("Long: " + lg);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + boo);

        System.out.println("Literals: " + lit);

        System.out.println("Conversions Types: " + k);
        System.out.println("Conversions Types: " + i);
    }
}
