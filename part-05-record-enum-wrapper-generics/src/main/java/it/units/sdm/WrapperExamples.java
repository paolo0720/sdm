package it.units.sdm;

public class WrapperExamples {

    void main() {
        // Slide 18: From primitive value to wrapper object
        int i = 60;
        Integer i1 = Integer.valueOf(i);
        // Integer i2 = new Integer(i); // Deprecated

        boolean b = true;
        Boolean b1 = Boolean.valueOf(b);
        // Boolean b2 = new Boolean(b); // Deprecated

        // Slide 19: Caching of wrapper objects
        IO.println(Integer.valueOf(127) == Integer.valueOf(127));
        IO.println(Integer.valueOf(128) == Integer.valueOf(128));

        // Slide 20: From wrapper object to primitive value
        Boolean boolObj = Boolean.FALSE;
        boolean boolPrim = boolObj.booleanValue();

        Character charObj = Character.valueOf('a');
        char charPrim = charObj.charValue();

        // Slide 22: Boxing and unboxing
        Boolean bBoxed = false;
        boolean bUnboxed = bBoxed;

        Character cBoxed = 'a';
        char cUnboxed = cBoxed;

        int intPrim = 60;
        Integer intBoxed = intPrim;
        // Double dBoxed = intPrim; // Compilation error
        Double dBoxed = intBoxed.doubleValue();
        int intPrim2 = intPrim + intBoxed;
    }
}
