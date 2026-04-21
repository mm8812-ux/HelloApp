public class HelloApp {
    public static void main(String[] args) {

        StringBuilder namesBuilder = new StringBuilder();
    public static void main(String[] args) {

        // Check if no arguments are provided
        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Enhanced for loop to iterate through names
        // Case 2: Arguments present
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop to append names
        for (String name : args) {
            if (namesBuilder.length() > 0) {
                namesBuilder.append(", ");
            }
            namesBuilder.append(name);
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = "";
        if (nameBuilder.length() > 0) {
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        // Final message
        System.out.println("Hello, " + namesBuilder.toString() + "!");
        // Final output
        System.out.println("Hello, " + names + "!");
    }
}