

import java.util.Arrays;
import java.util.Random;


class ranquick {

  static int partition(int array[], int low, int high,int pivot) {
    
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {

        i++;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where partition is done
    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
      
      if (high- low <= 0)
                return;
       Random rand = new Random();

                int pivotIndex = low + rand.nextInt(high - low + 1);

                int pivot = array[high];
		System.out.println(" Pivot = " + pivot);
  
      int pi = partition(array, low, high,pivot);
      System.out.println(Arrays.toString(array));
      // recursive call on the left of pivot
      quickSort(array, low, pi - 1);
      System.out.println(Arrays.toString(array));

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high);
      System.out.println(Arrays.toString(array));
    
  }
}

// Main class
class Main {
  public static void main(String args[]) {

    int[] data = { 8, 7, 2, 1, 0, 9, 6 };
    System.out.println("Unsorted Array");
    System.out.println(Arrays.toString(data));

    int size = data.length;

   ranquick.quickSort(data, 0, size - 1);

    System.out.println("Sorted Array in Ascending Order ");
    System.out.println(Arrays.toString(data));
  }
}