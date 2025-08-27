public class StringIntern {
    public static void main(String[] args) {
        // String created using new keyword (stored in heap)
        String str1 = new String("hello");

        // Interned string (forced into string pool)
        String str2 = str1.intern();

        // String literal (already in string pool)
        String str3 = "hello";

        // Check reference equality
        System.out.println("Is str2 and str3 pointing to the same object? " + (str2 == str3));
    }
}
