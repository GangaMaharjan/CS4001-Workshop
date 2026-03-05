public class DefaultValues {

    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues();

        System.out.println("=== Default Values of Primitive Data Types ===");

        System.out.println("byte default value: " + obj.byteValue);
        System.out.println("short default value: " + obj.shortValue);
        System.out.println("int default value: " + obj.intValue);
        System.out.println("long default value: " + obj.longValue);
        System.out.println("float default value: " + obj.floatValue);
        System.out.println("double default value: " + obj.doubleValue);
        System.out.println("char default value: [" + obj.charValue + "]");
        System.out.println("boolean default value: " + obj.booleanValue);
    }
}

/*
 NOTE:
 This works because member variables (instance variables) are automatically
 assigned default values by Java.

 However, this would NOT work for local variables inside a method.
 Local variables must be initialized before use, otherwise the compiler
 will give an error:

 "variable might not have been initialized"

 Java does not assign default values to local variables.
*/