public class Main {

    public static void main(String[] args) {
        // 1. float (Primitive Type) - Float (Wrapper Class)

        // Stores minimum and maximum valid "float" values.
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        // Prints out the minimum and maximum "float" values.
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        // 2. double (Primitive Type) - Double (Wrapper Class)

        // Stores minimum and maximum valid "double" values.
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        // Prints out the minimum and maximum "double" values.
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        // Initializing a variable of type "float".
        float myFloatValue = 5.25F;         // float myFloatValue = 5.25; -> ERROR
        System.out.println("Float value = " + myFloatValue);

        // Initializing a variable of type "double" - Default type for real numbers.
        double myDoubleValue = 5.25D;       // double myDoubleValue = 5.25; -> VALID
        System.out.println("Double value = " + myDoubleValue);

        // Dividing 5 by 3 in case of "int" - Doesn't handle remainder of the division.
        int myIntDivide = 5 / 3;            // 1
        System.out.println("Int divide = " + myIntDivide);

        // Dividing 5 by 3 in case of "float".
        float myFloatDivide = 5F / 3F;      // 1.6666666
        System.out.println("Float divide = " + myFloatDivide);

        // Dividing 5 by 3 in case of "double".
        double myDoubleDivide = 5D / 3D;    // 1.6666666666666667
        System.out.println("Double divide = " + myDoubleDivide);

        // "double" has a lot more precision than "float".
    }
}
