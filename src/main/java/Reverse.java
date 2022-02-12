public class Reverse {

    public static void main(String[] args) {
        int num = 786;
        String stringToBeReversed = "Chintan";
        Reverse reverse = new Reverse();
        System.out.println("Reversed Integer is: " + reverse.reverseInteger(num));
        System.out.println("Reversed String is: " + reverse.reverseString(stringToBeReversed));

    }

    private String reverseString(String stringToBeReversed) {
        char[] characters = stringToBeReversed.toCharArray();

        String result = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            result += characters[i];
        }
        return result;
    }

    private int reverseInteger(int num) {

        int reversedNumber = 0;
        int denominator = 0;
        while (num > 0) {
            denominator = num % 10;
            reversedNumber = denominator + reversedNumber * 10;
            num = num / 10;
        }
        return reversedNumber;
    }
}
