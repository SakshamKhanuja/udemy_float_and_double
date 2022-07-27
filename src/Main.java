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
    }
}
