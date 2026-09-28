/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import static sorting.SelectionSort.SelectionSort;

/**
 *
 * @author User
 */
public class SelectionSortTest {

    public static void main(String[] args) {

        int[] numbers = {9, 1, 8, 7, 2, 3, 6, 5, 4};

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.print("\n");
        
        SelectionSort(numbers);
        
        System.out.println("\nSorted array: ");
        for (int num : numbers){
            System.out.print(num + " ");
        }

    }
}
