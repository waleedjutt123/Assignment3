public class Assignment3Q2 {
    public static void main(String args[]) {
        String currentMonth = "February";

        System.out.println("The current month is: " + currentMonth);
        switch (currentMonth) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("Number of days: 31");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("Number of days: 30");
                break;
            case "February":
                System.out.println("Number of days: 28");
                break;
            default:
                System.out.println("invalid month");
        }
    }
}