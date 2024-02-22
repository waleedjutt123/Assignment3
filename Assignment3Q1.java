public class Assignment3Q1 {
    public static void main(String[] args) {
        char someChar = 'a';

        System.out.println("Char is: " + someChar);

        switch (Character.toLowerCase(someChar)) {
            case 'a':
            case 'e':
                System.out.println("It's a vowel.");
                break;
            default:
                System.out.println("It's a consonant.");
        }
    }
}