package lab_9;

public class Exception1 {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );
    }

    public static void main(String[] args) {
        Exception1 obj = new Exception1();
        obj.exceptionDemo();
    }
}
