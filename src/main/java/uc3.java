public class HelloApp {

    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
            name = args[0];
        } else {
            System.out.println("Hello, World!");
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}