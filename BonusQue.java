import java.util.Scanner;

public class BonusQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Maths marks: ");
                    int maths_marks = sc.nextInt();
                    System.out.print("Enter Science marks: ");
                    int science_marks = sc.nextInt();
                    System.out.print("Enter History marks: ");
                    int history_marks = sc.nextInt();

                    int avg = (maths_marks + science_marks + history_marks) / 3;
                    if (avg >= 90) System.out.println("Grade: A");
                    else if (avg >= 75) System.out.println("Grade: B");
                    else if (avg >= 50) System.out.println("Grade: C");
                    else System.out.println("Grade: F");
                    break;

                case 2:
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        System.out.println(year + " is a leap year");
                    else
                        System.out.println(year + " is not a leap year");
                    break;

                case 3:
                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();
                    switch (day) {
                        case 1: System.out.println("Monday"); 
						break;
                        case 2: System.out.println("Tuesday"); 
						break;
                        case 3: System.out.println("Wednesday"); 
						break;
                        case 4: System.out.println("Thursday");
						break;
                        case 5: System.out.println("Friday"); 
						break;
                        case 6: System.out.println("Saturday");
						break;
                        case 7: System.out.println("Sunday"); 
						break;
                        default: System.out.println("Invalid Day Number");
                    }
                    break;

                case 4:
                    byte a = 0;
                    short b = 0;
                    int c = 0;
                    long d = 0;
                    float e = 0.0f;
                    double f = 0.0;
                    char g = '\u0000';
                    boolean h = false;
                    System.out.println("byte a: " + a);
                    System.out.println("short b: " + b);
                    System.out.println("int c: " + c);
                    System.out.println("long d: " + d);
                    System.out.println("float e: " + e);
                    System.out.println("double f: " + f);
                    System.out.println("char g: '" + g + "'");
                    System.out.println("boolean h: " + h);
                    break;

                case 5:
                    System.out.println("Exit");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
