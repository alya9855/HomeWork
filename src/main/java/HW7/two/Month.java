package HW7.two;

public class Month {
    private String monthName;
    private int dayQuantity;
    private int dayWorkQuantity;

    public Month(String monthName, int dayQuantity, int dayWorkQuantity) {
        this.monthName = monthName;
        this.dayQuantity = dayQuantity;
        this.dayWorkQuantity = dayWorkQuantity;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDayQuantity() {
        return dayQuantity;
    }

    public int getDayWorkQuantity() {
        return dayWorkQuantity;
    }
}
