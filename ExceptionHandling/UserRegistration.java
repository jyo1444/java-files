package ExceptionHandling;
class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userReg = new UserRegistration();
        try {
            userReg.registerUser("Jyo", "US");
            userReg.registerUser("jyo", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }

    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
        System.out.println("User registration done successfully");
    }
}


