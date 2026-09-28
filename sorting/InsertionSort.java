/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author Tugay
 */
public class InsertionSort {
    


    
    int[] numbers;
    private int index;

    public InsertionSort(int[] numbers) {
        this.numbers = numbers;
    }

    public void sort() {

        for (int i = 1; i < numbers.length; i++) {

            int temp = numbers[i];
            int j = i - 1;

            System.out.println("Temp: " + temp);

            while (j >= 0 && numbers[j] > temp) {

                System.out.printf("Comparing: %d and %d\n", temp, numbers[j]);

                numbers[j + 1] = numbers[j];
                j--;

                if (j != -1) {
                    System.out.printf("Comparing: %d and %d\n", temp, numbers[j]);
                }
            }

            System.out.printf("%d inserted at index %d\n", temp, j + 1);

            numbers[j + 1] = temp;

            showSortedArray();
        }
    }

    public void showSortedArray() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void display() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}