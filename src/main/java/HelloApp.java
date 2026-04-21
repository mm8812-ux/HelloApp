   }

        // Case 2: Arguments present
        StringBuilder nameBuilder = new StringBuilder();

        // Enhanced for loop to append names
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        String names = "";
        if (nameBuilder.length() > 0) {
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        }
        String names = String.join(", ", args);

        // Final output
        System.out.println("Hello, " + names + "!");