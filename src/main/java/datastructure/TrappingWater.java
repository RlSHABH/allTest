package datastructure;

public class TrappingWater {
  public static void main(String[] args) {
   /* Scanner sc=new Scanner(System.in);
    int input=sc.nextInt();

    for(int i=0;i<input.;i++)
    {
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int j=0;j<n.length;j++)
      {
        a[j]=sc.nextInt();
      }
      trappingWater(a);
    }*/
    test2(new int[] {6 ,1, 8, 9 ,2, 7 ,9 ,5, 4, 3});
    //  test(new int[] {2, 0, 2});
    // test1(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    // test2(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});

  }

  // Optimum solution
  //Time Complexity: O(n)
  //Auxiliary Space: O(n)

  private static void test2(int[] a) {
    int[] right = new int[a.length];
    int[] left = new int[a.length];
    int max = 0;
    for (int i = a.length - 1; i >= 0; i--) {
      if (max < a[i]) {
        max = a[i];
      }
      right[i]= Math.max(max,a[i]);

    }
    max=0;
    for(int j=0;j<a.length;j++)
    {
      if(max<a[j])
      {
        max=a[j];
      }
      left[j]=Math.max(max,a[j]);
    }

    for(int k=1;k<a.length-1;k++)
    {
      if(left[k]<right[k])
      {

        System.out.println(Math.max(left[k],a[k])-a[k]);
      }
      else
      {
        System.out.println(Math.max(right[k],a[k])-a[k]);
      }
    }


  }

  /*Time Complexity: O(n)
  Auxiliary Space: O(1)*/
  private static void test1(int[] a) {

    for (int i = 1; i < a.length-1; i++) {
      int leftHigh = a[i];
      int rightHigh = a[i];
      for (int j = i - 1; j >= 0; j--) {
        if (a[j] > leftHigh) {
          leftHigh = a[j];
        }
      }
      for (int j = i + 1; j < a.length; j++) {
        if (a[j] > rightHigh) {
          rightHigh = a[j];
        }
      }
      if (leftHigh <rightHigh) {
        System.out.println(leftHigh - a[i]);
      } else
        System.out.println(rightHigh - a[i]);

    }
  }
}
