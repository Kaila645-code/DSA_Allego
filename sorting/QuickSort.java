/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class QuickSort {

    int[] numbers;
    int iteration = 1;

    public QuickSort(int[] numbers) {
        this.numbers = numbers;
    }

    public void sort() {
        quicksort(0, numbers.length - 1);
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            int pivot = numbers[high];
            int i = low - 1;
            System.out.println("\nPivot: " + pivot);

            for (int j = low; j < high; j++) {

                System.out.println("Iteration " + iteration
                        + ": Comparing " + numbers[j]
                        + " with pivot " + pivot);

                if (numbers[j] < pivot) {
                    i++;
                    //swap
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                    System.out.print("Array placing pivot : ");
                    printArray();
                }
                iteration++;
            }
            int temp = numbers[i + 1];
            numbers[i + 1] = numbers[high];
            numbers[high] = temp;

            int pivotIndex = i + 1;

            quicksort(low, pivotIndex - 1);
            quicksort(pivotIndex + 1, high);

        }
    }

    public void printArray() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void printf() {
        System.out.println("\nSorted numbersay: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
