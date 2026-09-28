/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

/**
 *
 * @author User
 */
public class BubbleSortTest {
    
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

       
        BubbleSort bubble = new BubbleSort(numbers);

        
        System.out.println("Original Array:");
        bubble.print();

        System.out.println();

       
        bubble.sort();

       
        System.out.println("Final Sorted Array:");
        bubble.print();
    }
    
    
    
}
