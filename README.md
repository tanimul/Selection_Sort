# Selection Sort
Perform Insertion Sort using JAVA language.

# About Selection Sort
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
The algorithm maintains two subarrays in a given array.
1) The subarray which is already sorted. 
2) Remaining subarray which is unsorted.
In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.

# Java
   Step 1: 
           
            for (int i = 0; i < numbers.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_index]) {
                    min_index = j;
                }
            }
            int temp = numbers[min_index];
            numbers[min_index] = numbers[i];
            numbers[i] = temp;
            }
  
   Step 2: 
   Now,Print sorted Array in Ascending Order by loop
   
            System.out.print("Sorted Array in Ascending Order: ");
            for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            }
