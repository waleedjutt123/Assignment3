public class Assignment3Q3 {
    public static void main(String args[]) {
        int currentValue = 5;
        System.out.println("The number is: " + currentValue);

        long factorial = 1;

        for (int i = 1; i <= currentValue; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + currentValue + " is: " + factorial);
    }
}