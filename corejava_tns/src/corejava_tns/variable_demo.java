package corejava_tns;

public class variable_demo {

    int a = 10; // Instance variable

    void print() {
        String msg = "hello";
        System.out.println(msg);
    }

    static String message = "hello students"; // Static variable

    public static void main(String[] args) {
        variable_demo obj = new variable_demo();
        System.out.println("The value of a: " + obj.a);
        obj.print();
        System.out.println(message);
    }
}
