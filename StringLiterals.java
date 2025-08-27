public class StringLiterals {
    public static void main(String[] args) {
        // All are string literals → stored in string pool
        String str1 = "java";
        String str2 = "java";
        String str3 = "java";

        // Check if all point to the same object in pool
        boolean result = (str1 == str2) && (str2 == str3);

        System.out.println("All strings point to the same object: " + result);
    }
}
