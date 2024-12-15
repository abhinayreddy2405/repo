public class prograim {
    public static void main(String[] args) {
        // Predefined string to check
        String input = "level";
       
        // Normalize the input string by removing spaces and converting to lowercase
        String normalizedString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       
        // Reverse the normalized string
        String reversedString = new StringBuilder(normalizedString).reverse().toString();
       
        // Check if the normalized string is equal to its reversed version
        if (normalizedString.equals(reversedString)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}


