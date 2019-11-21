package com.demo.corejava.designPattern;


public class CuttingRod {

  private static  int maxPieces;
  public static void main(String[] args)
  {
    /*Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      int rod=sc.nextInt();
      int[] arr =new int[3];
      for(int j=0;j<3;j++)
      {
        arr[i]=sc.nextInt();
      }*/
    System.out.println(findMaximumPieces(2,new int[]{6,3,4}));
  }

  private static int findMaximumPieces(int rod,int[] arr) {
    if(rod== 0)
      return 0;
    if(rod < 0)
      return -1;
    int res= Math.max(Math.max(findMaximumPieces(rod-arr[0],arr),
        findMaximumPieces(rod-arr[1],arr)),
        findMaximumPieces(rod-arr[0],arr));
    return res+1;
  }
}