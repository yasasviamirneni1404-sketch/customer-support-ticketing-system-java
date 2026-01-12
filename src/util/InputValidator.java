package util;

public class InputValidator {

    public static boolean isValidPriority(String priority) {
        return priority.equalsIgnoreCase("HIGH")
                || priority.equalsIgnoreCase("MEDIUM")
                || priority.equalsIgnoreCase("LOW");
    }
}
