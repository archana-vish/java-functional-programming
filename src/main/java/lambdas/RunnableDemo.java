package lambdas;

import java.util.stream.Stream;

public class RunnableDemo {
    public static void main(String[] args) {
        // Java 7 syntax
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside an anonymous inner class");
            }
        }).start();

        new Thread(()->System.out.println("easy with lambdas..")).start();

        // Expression lambda
        new Thread(() -> System.out.println("Inside expression lambda")).start();

        // Block lambda
        new Thread(() -> {
            System.out.println("Inside block lambda");
        }).start();

        Runnable runnable = () -> System.out.println("Assigned to a variable");
        new Thread(runnable).start();

        // Wow! Method reference
        new Thread(System.out::println).start();

        Stream.of("this is a string".split(" "))
              .parallel()
              .forEach(System.out::println);
    }
}

