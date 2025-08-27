public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        // Concatenation using +
        String str3 = str1 + str2;

        // Check if str3 is the same as str1
        System.out.println("Is str3 pointing to the same object as str1? " + (str3 == str1));

        // For better clarity, also check content
        System.out.println("Does str3 contain 'helloworld'? " + str3.equals("helloworld"));
    }
}
