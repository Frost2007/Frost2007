package lesson17;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("in body of method throwOne()");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Exception is exceeded:" + e);
        }
    }
}
