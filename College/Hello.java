public class Hello {
    public static void main(String[] args) {
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        char doubleVar =  (char)floatVar;
    
        System.out.println(doubleVar);   
    }
}