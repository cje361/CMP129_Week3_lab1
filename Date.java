public class Date {
    
    private static final String[] months = {
        "January", "February", "March","April", "May", "June", "July", "August", "September", "October", "November", "December"
    };

    private int month;
    private int day;
    private int year;

    public Date() {
        this(1, 1, 2000);
    }

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31.");
        }
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void displayNumeric() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public void displayMonthFirst() {
        System.out.println(getMonthName() + " " + day + ", " + year);
    }

    public void displayDayFirst() {
        System.out.println(day + " " + getMonthName() + " " + year);
    }

    private String getMonthName() {
        return months[month - 1];
    }


}
