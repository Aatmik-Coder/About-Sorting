package Sorting;

//---------------------MARGE SORT--------------------------------
//  NOTE:- Index always start from 0.
/* As You all know merge sort follows 'Divide and conquer' strategy so first we will divide array and then 
    conquer and at last combine both the array*/

public class MergeSort
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 59, 29, 4, 89, 76, 7}; // Array which we want to sort its length is even
        
       //Try this by uncommenting it 
       //Array which we want to sort its length is odd and comment the above arr.
        
//        int[] arr = {3, 9, 65, 1, 87, 0, 100}; 
        
//  First of all we will int var so that we can have value which we will use as a condition in SubArrays
        int n1 = 0;
        if(arr.length % 2 != 0)     // this if statement is because if the array has odd index then it can solve it.
        {
            n1 = (arr.length + 1) / 2;
        }
        else
        {
            n1 = (arr.length)/2;    // arr.length = 6 because it starts counting from 1 ((arr.length)/2 = 3).
        }
        
//  Assigning Both SubArray i.e SubArray(1) and SubArray(2) with the above var having value of length/2
        
        int[] L1 = new int[n1];
        int[] R1 = new int[n1];
        
//  Assigning Two var so that they can be used in Sorting each SubArray
        
        int e = 0;
        int w = 0;
//--------------------------------DIVIDE-----------------------------------------
        
//  This loop over and assign first value as per condition to the new SubArray(2).
       
        for (int i = 0; i < n1; i++)
        {
            L1[i] = arr[i];
        }
        
//  This loop over and assign first value as per condition to the new SubArray(2).
        
        if(arr.length % 2 != 0)   /*when the length of original array is odd then it will be able to solve it*/
        {
            int j = 0;
            R1[j] = 0;      // we will add a constant value 0 as a first index of subArray (it is good to take zero 
            for (j = 1; j < n1; j++)
            {
                R1[j] = arr[n1 + j - 1];
            }
        }
        else                  /*when length of original array is even as of now.*/
        {
            for (int j = 0; j < n1; j++)
            {
                R1[j] = arr[n1 + j];
            }
        }
//------------------------------------------------------------------------------
        
//--------------------------------CONQUER----------------------------------------
        
//  This loop over SubArray(1) and will Sort it so that can be used in future for merging
        
        for(int i = 1; i < n1; i++)
        {
            w = L1[i];
            e = i - 1;
            while(L1[e] > w)
            {
                L1[e+1] = L1[e];
                L1[e] = w;
                if(e>0)
                {
                    e--;
                }
            }
        }

//  This loop over SubArray(2) and will Sort it so that can be used in future for merging
        
        for (int j = 1; j < n1; j++)
        {
            w = R1[j];
            e = j - 1;
            while(R1[e] > w)
            {
                R1[e+1] = R1[e];
                R1[e] = w;
                if(e > 0)
                {
                    e--;
                }
            }
        }
//------------------------------------------------------------------------------
        
// Here we are just printing SubArray(1) and SubArray(2) Value after sorting
        
        System.out.print("The Sorted Array for L1[] is = ");
        for(int i : L1)
        {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        System.out.print("The Sorted Array for R1[] is = ");
        for(int i : R1)
        {
            System.out.print(i + " ");
        }
        
//-----------------------------------COMBINE------------------------------------
        
//---------------------MOST IMPORTANT STEP IN ENTIRE PROGRAM---------------------------- 
        
/*  In This steps we will combine both the subArray and will store in a Single array as a Sorted Array */
        
        int u = 0;
        int p = 0;
        
        if(R1[p] == 0)  //when the length of original array is odd
                        /* In this if condition we will remove the first value which is zero which we 
                            have add in past so that while combining we can get the original value back*/ 
        {
            R1[p] = R1[p+1];
            p++;
        }
        
        for(int k = 0; k < arr.length; k++)
        {            
            if(u != n1 && L1[u] <= R1[p])
            {
                arr[k] = L1[u];
                u = u + 1;
            }
            else
            {
                arr[k] = R1[p];
                p = p + 1;
            }
        }
//-------------------------------------------------------------------------------------
        
        System.out.println("");
        
//  Printing the Value of the sorted Array
        
        System.out.print("The Original Sorted Array is = ");
        for(int a = 0; a < arr.length; a++)
        {
                System.out.print(arr[a] + " ");
        }
    }
}
