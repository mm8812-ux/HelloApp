public class HelloApp {
    public static void main(String[] args) {

        String message;
        StringBuilder namesBuilder = new StringBuilder();

        // Check if arguments are provided
        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            // Default case
            message = "Hello, World!";
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Print the message
        System.out.println(message);
        // Enhanced for loop to iterate through names
        for (String name : args) {
            if (namesBuilder.length() > 0) {
                namesBuilder.append(", ");
            }
            namesBuilder.append(name);
        }

        // Final message
        System.out.println("Hello, " + namesBuilder.toString() + "!");
    }
}