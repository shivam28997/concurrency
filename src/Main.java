public class Main {
    public static void main(String[] args) {

        PrintSomething printSomething = new PrintSomething();

        Thread t1 = new Thread(printSomething);

        t1.start();

        System.out.println("Hello world " + Thread.currentThread().getName());
        System.out.println("The next line");

    }
}