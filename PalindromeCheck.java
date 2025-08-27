import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

       
        str = str.toLowerCase();

       
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

       
        if (str.equals(rev)) {
            System.out.println("It is a Palindrome!");
        } else {
            System.out.println("It is NOT a Palindrome!");
        }
    }
}
