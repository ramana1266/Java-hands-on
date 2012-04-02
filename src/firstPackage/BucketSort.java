package firstPackage;
import java.util.Arrays;
import java.util.Scanner;
 
public class BucketSort {
 
  public static int[] bucketSort(int[] arr) {
    int i, j;
    int[] count = new int[arr.length];
    Arrays.fill(count, 0);
 
    for(i = 0; i < arr.length; i++ ) 
    {
      count[arr[i]]++;
    }
 
    for(i=0,j=0; i < count.length; i++) 
    {
      for(; count[i]>0; (count[i])--) 
      {
    	  arr[j++] = i;
      }
    }
 
    return arr;
  }
  public static void main(String[] args) {
    int[] arr = new int[] {2, 3, 2, 1, 4, 5, 2, 3, 1};
    arr = bucketSort(arr);
     for(int i = 0; i < arr.length; i++ ) 
    {
    	 System.out.print(arr[i] + " ");
    }
    System.out.println();
 
  }
}