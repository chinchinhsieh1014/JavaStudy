package Playground;

public class variables {
    public static void main(String[] args) {
        // DataType VarName = Value;

        // Primitive Data Types
        byte var1 = 1;
        short var2 = 2;
        int var3 = 3;
        long var4 = 4L;

        float var5 = 5f;
        double var6 = 6d;

        double poundsToKilograms = 0.45359237d;
        System.out.println("10 pounds is "+ 10*poundsToKilograms+" kg");

        boolean var7 = true;

        char var8 = 'a';

        // wrapped class
        System.out.println("The minimum value of byte:"+Byte.MIN_VALUE);
        System.out.println("The maximum value of byte:"+Byte.MAX_VALUE);
        System.out.println("The minimum value of short:"+Short.MIN_VALUE);
        System.out.println("The maximum value of short:"+Short.MAX_VALUE);
        System.out.println("The minimum value of int:"+Integer.MIN_VALUE);
        System.out.println("The maximum value of int:"+Integer.MAX_VALUE);
        System.out.println("The minimum value of long:"+Long.MIN_VALUE);
        System.out.println("The maximum value of long:"+Long.MAX_VALUE);

        // string
        String myText = "Hello World";

        // Reference Data Types
        // array
        // class
        // interface
    }
}
