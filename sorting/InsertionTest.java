/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class InsertionTest {

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 4, 2};

        InsertionSort insertionSort = new InsertionSort(numbers);

        System.out.println("==================================");
        System.out.println("BEFORE SORTING:       ");
        insertionSort.display();

        System.out.println("\n\nInsertion Sort:");

        insertionSort.sort();

        System.out.println("==================================");
        System.out.println("AFTER SORTING:          ");
        insertionSort.display();

        System.out.println("==================================");

    }

}
