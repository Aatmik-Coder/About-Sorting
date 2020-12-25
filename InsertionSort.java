package Sorting;

//  INSERTION SORT

//  Note:-  Index position always start with 0.

public class InsertionSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {50*10, 120*10, 40*10, 20*10, 10*10};  // Array
        int j = 0;                       // Initializing Variable j
        int k = arr.length;              // Initializing variable k with length of an array
        
        for(int i = 1; i < k; i++)       // loop for arr.length - 1 time so that we can sort each time the loop cycle
        {
            int key = arr[i];           // Initializing variable key with value at index 1
            
            j = i - 1;                  /* Initializing variable with j = i - 1, so that each time the i increases 
                                            the j will be always behind it*/
            
//----------------- Most Important step in entire Program "Sorting for array will start at this point--------------
            
            while(arr[j] > key)         /* while loop for checking wheather value of arr[j] is greater than key or not 
                                            if it is then condition will be true and execution will go inside the loop*/
            {
                arr[j+1] = arr[j];      /* Initializing value of arr[j+1](i.e at index 1 for 1st loop) with value of 
                                            arr[j](i.e in this example 5 because in this case initially value of arr[0]
                                                    is 5 because j = i - 1 (i.e j = 1 - 1) for first case only)*/  
                arr[j] = key;           /* As we know the value of key is 2 so now allocating value to arr[j] 
                                            (i.e arr[0] = 2)*/
                if(j > 0)               /* If j is greater than 0 than j-- initially for first looping it will 
                                            be 0 so this condition will not be satisfied but after that it will help
                                            to sort the array*/
                {
                    j--;
                }
            }
//-----------------------------------------------------------------------------------------------------------------
        }
        for(int i = 0; i < k; i++)      /* This for loop is just to print the result(output) to check the sorted array*/
        {
            System.out.println(arr[i]);
        }
    }
}

