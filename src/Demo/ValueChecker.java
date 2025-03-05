package Demo;

class ValueTooHighException extends Exception {
    public ValueTooHighException(String message) {
        super(message);
    }
}

public class ValueChecker {

    public static void checkValue(int value) throws ValueTooHighException {
        if (value > 25000) {
            throw new ValueTooHighException("Value " + value + " is greater than 25000.");
        }
        System.out.println("Value " + value + " is within the allowed range.");
    }

    public static void main(String[] args) {
        try {
            checkValue(26000);
        } catch (ValueTooHighException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkValue(20000);
        } catch (ValueTooHighException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

