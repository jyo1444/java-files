package ExceptionHandling;
import java.util.*;
public class ExcpHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the number of elements in the array");
            int size = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the elements in the array");
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(sc.nextLine());

            int element = array[index];
            System.out.println("The array element at index " + index + " = " + element);
            System.out.println("The array element successfully accessed");

        } /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }*/
        catch(ArrayIndexOutOfBoundsException | NumberFormatException ae) {
        	System.out.println(ae);
        }
	}

}
