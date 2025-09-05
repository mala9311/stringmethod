public class StringExample {
    public static void main(String[] args) {
        // 1. Creating strings
        String str1 = "Hello";
        String str2 = "World";

        // 2. Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Combined: " + combined); // Output: Hello World

        // 3. String length
        System.out.println("Length: " + combined.length()); // Output: 11

        // 4. Character at a specific index
        System.out.println("Character at index 1: " + combined.charAt(1)); // Output: e

        // 5. Substring
        System.out.println("Substring (0, 5): " + combined.substring(0, 5)); // Output: Hello

        // 6. String comparison
        String str3 = "hello";
        System.out.println("Equals: " + str1.equals(str3)); // false
        System.out.println("EqualsIgnoreCase: " + str1.equalsIgnoreCase(str3)); // true

        // 7. Changing case
        System.out.println("Uppercase: " + str1.toUpperCase()); // HELLO
        System.out.println("Lowercase: " + str2.toLowerCase()); // world

        // 8. Replace characters
        String replaced = combined.replace("World", "Java");
        System.out.println("Replaced: " + replaced); // Hello Java

        // 9. Split
        String[] words = combined.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. Trim
        String strWithSpaces = "   trim this   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 11. Check if string contains a substring
        System.out.println("Contains 'World'? " + combined.contains("World")); // true
    }
}
