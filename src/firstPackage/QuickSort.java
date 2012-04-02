package firstPackage;

public class QuickSort{
public static int partition(int arr[], int left, int right)
{
      int i = left, j = right;
      int tmp;
      int pivot = arr[(left + right) / 2];
      while (i <= j) {
            while (arr[i] < pivot)
                  i++;
            while (arr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  i++;
                  j--;
            }
      };
      return i;
}
public static void quickSort(int arr[], int left, int right) {
      int index = partition(arr, left, right);
      if (left < index - 1)
            quickSort(arr, left, index - 1);
      if (index < right)
            quickSort(arr, index, right);
}
public static void main(String [] args)
{
	int [] array = {1,3,2,4,6,5,7,6};
	quickSort(array,0,array.length-1);
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
}
}