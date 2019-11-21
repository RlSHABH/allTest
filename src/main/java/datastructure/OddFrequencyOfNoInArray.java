package datastructure;

public class OddFrequencyOfNoInArray     {

    public static void main(String[] args)
    {
        int arr[]=new int[]{2,4,3,2,5,4,3,6};
        System.out.println(findOddOccuringNumber(arr));
    }

    static int   findOddOccuringNumber(int[] arr)
  {
      int oddOccNumber=0;
      // X_OR gives 0 on same bits and 1 on different bit
      for(int i=0;i<arr.length;i++)
      {
          oddOccNumber=oddOccNumber^arr[i];
      }
      return oddOccNumber;

  }
}
