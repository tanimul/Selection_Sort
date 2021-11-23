package selection_sort;

/**
 *
 * @author fuad
 */
public class Selection_Sort {

    public static void main(String[] args) {
        int numbers[] = {15, 2, 13, 4, 8, 10, 50, 40};

        for (int i = 0; i < numbers.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_index]) {
                    min_index = j;
                }
            }
            int temp = numbers[min_index];
            numbers[min_index] = numbers[i];
            numbers[i] = temp;
        }

        System.out.print("Sorted Array in Ascending Order: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
