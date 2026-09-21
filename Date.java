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

    
}
