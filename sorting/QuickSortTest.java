/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

public class QuickSortTest {

    public static void main(String[] args) {

    int[] numbers = {14, 33, 27, 10, 35, 19, 42};

    QuickSort quickSort = new QuickSort(numbers);

    System.out.println("Original numbers:");
    for (int number : numbers) {
        System.out.print(number + " ");
    }
    System.out.println();

    System.out.println("\n--- QUICK SORT ---");

    quickSort.sort();

    quickSort.printf();
}
}

    
 
    

