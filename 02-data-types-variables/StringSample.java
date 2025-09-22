public class StringSample {
    public static void main(String[] args) {
        String greeting = "Hello";
        String audience = "World";
        String message = greeting + ", " + audience + "!";
        System.out.println(message);

        String repeated = greeting + " ".repeat(3) + audience;
        System.out.println(repeated);

        int year = 2025;
        String yearMessage = "The year is " + year;
        System.out.println(yearMessage);

        System.out.println("Length is: " + yearMessage.length());
        System.out.println("Character at index 5: " + yearMessage.charAt(5));
        System.out.println("Substring (4 to 8): " + yearMessage.substring(4, 8));
        System.out.println("Index of 'year': " + yearMessage.indexOf("year")); // search if "year" is in the string
        System.out.println("Uppercase: " + yearMessage.toUpperCase());
        System.out.println("Lowercase: " + yearMessage.toLowerCase());
        System.out.println("Trimmed: '" + ("   " + yearMessage + "   ").trim() + "'"); // removes all leading and trailing spaces
        System.out.println("Replace 2025 with 2024: " + yearMessage.replace("2025", "2024"));
    }
}
