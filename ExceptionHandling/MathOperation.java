package ExceptionHandling;
public class MathOperation {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide 5 integers as command line arguments.");
            return;
        }

        try {
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            int sum = 0;
            for (int num : arr) {
                sum += num;
            }

            double avg = (double) sum / arr.length;

            System.out.println("Sum of all elements: " + sum);
            System.out.println("Average of all elements: " + avg);

        }/* catch (NumberFormatException e) {
            System.out.println("Please provide valid integers as command line arguments.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred.");
        }*/
        catch(NumberFormatException | ArithmeticException ae) {
        	System.out.println(ae);
        }
    }
}
