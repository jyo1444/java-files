package ExceptionHandling;
class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws AgeOutOfRangeException {
        if (age < 18 || age >= 60) {
            throw new AgeOutOfRangeException("Age should be between 18 and 60.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class PersonAge {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two arguments: name and age.");
            return;
        }

        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            Person person = new Person(name, age);

            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a valid integer for age.");
        } catch (AgeOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
