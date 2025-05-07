package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {
    }

    public static String format(String firstName, String lastName) {
        return String.format("%s, %s", lastName, firstName);
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder formattedName = new StringBuilder();

        formattedName.append(lastName);

        // Add a comma only if there are others parts of the name
        if ((prefix != null && !prefix.isEmpty()) ||
                (firstName != null && !firstName.isEmpty()) ||
                (middleName != null && !middleName.isEmpty()) ||
                (suffix != null && !suffix.isEmpty())) {
            formattedName.append(",");
        }

        if (prefix != null && !prefix.isEmpty()) {
            formattedName.append(" ").append(prefix);
        }
        if (firstName != null && !firstName.isEmpty()) {
            formattedName.append(" ").append(firstName);
        }
        if (middleName != null && !middleName.isEmpty()) {
            formattedName.append(" ").append(middleName);
        }
        if (suffix != null && !suffix.isEmpty()) {
            formattedName.append(", ").append(suffix);
        }
        return formattedName.toString().trim();
    }

    public static String format(String fullName) {
        String[] nameParts = fullName.split(",", 2);
        String suffix = "";
        if (nameParts.length > 1) {
            suffix = nameParts[1].trim();
        }

        String[] names = nameParts[0].trim().split("\\s+");
        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";

        if (names.length > 3) {
            prefix = names[0];
        }
        if (names.length > 1) {
            firstName = names[names.length - 3];
        }
        if (names.length > 2) {
            middleName = names[names.length - 2];
        }
        if (names.length > 0) {
            lastName = names[names.length - 1];
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }
}
