/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class MergeSort {
    
  

    int[] numbers;
    int iteration = 1;

    public MergeSort(int[] numbers) {
        this.numbers = numbers;
    }

    public void sort() {
        mergeSort(0, numbers.length - 1);
    }

    private void mergeSort(int left, int right) {

        if (left < right) {

            int middle = (left + right) / 2;

           
            mergeSort(left, middle);
            mergeSort(middle + 1, right);

            
            merge(left, middle, right);

            System.out.println("Iteration " + iteration + ":");
            print();
            System.out.println();

            iteration++;
        }
    }

    private void merge(int left, int middle, int right) {

        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

       
        for (int i = 0; i < n1; i++) {
            leftArray[i] = numbers[left + i];
        }

       
        for (int j = 0; j < n2; j++) {
            rightArray[j] = numbers[middle + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        
        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                numbers[k] = leftArray[i];
                i++;
            } else {
                numbers[k] = rightArray[j];
                j++;
            }

            k++;
        }

       
        while (i < n1) {
            numbers[k] = leftArray[i];
            i++;
            k++;
        }

        
        while (j < n2) {
            numbers[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void print() {

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}
    

