// Write a Program in Java to Show the use of Interface.

interface A{
    void show();
}

public class Interface {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Hello World");
            }
        };
        obj.show();
    }
}
