import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date();

       boolean valid = false;
       while (!valid) {
        System.out.println("Enter the month (1-12): ");
        int month = input.nextInt();
        try {
            date.setMonth(month);
            valid = true;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid" + e.getMessage());
        }
       } 

       valid = false;
       while (!valid) {
        System.out.println("Enter the day (1-31): ");
        int day = input.nextInt();
        try {
            date.setDay(day);
            valid = true;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid" + e.getMessage());
        }
       }

       System.out.println("Enter the year: ");
       date.setYear(input.nextInt());

       System.out.println();
       date.displayNumeric();
       date.displayMonthFirst();
       date.displayDayFirst();
    }
}
