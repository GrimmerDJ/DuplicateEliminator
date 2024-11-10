import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateEliminator {

    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int value : list) {
            if (!uniqueList.contains(value)) {
                uniqueList.add(value);
            }
        }

        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }

    public static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {

        int[] userArray = getUserInput();

        int[] uniqueArray = eliminateDuplicates(userArray);

4        System.out.print("Array without duplicates: ");
        for (int value : uniqueArray) {
            System.out.print(value + " ");
        }
    }
}
