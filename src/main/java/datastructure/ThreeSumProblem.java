package datastructure;

class ThreeSumProblem{

    public static void main(String[] args){

        int a[]=new int[]{10,20,-10,30,-20,40,-30,60};
        System.out.println(getCountWhereThreeSumIsZero(a));
    }

    static int getCountWhereThreeSumIsZero(int a[])
    {
        int count=0;
        bubbleSort(a);// {-30,-20,-10,10,20,30,60}
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                Integer binarySearchNo= binarySearch(a,0,a.length,-(a[i]+a[j]));
                if(binarySearchNo!=null&&(a[i]<a[j]&& a[j]<binarySearchNo))
                {
                    count++;
                }
            }
        }
        return count;
    }

    static Integer binarySearch(int a[],int first,int last,int n)
    {

        int mid=(first+last)/2;
        if(a[mid]<n && (mid+1)<last) binarySearch(a,mid+1,last,n);
        if(a[mid]>n&&mid-1>0)binarySearch(a,first,mid-1,n);
        if(a[mid]==n)
        {
            return a[mid];
        }
       return null;
    }
    static void bubbleSort(int a[])
    {

        for(int i=0;i<a.length;i++)
        { boolean  isSorted=true;
            for(int j=0;j<a.length-1-i;j++)
            {

                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    isSorted=false;
                }

            }
            if(isSorted)
                break;
        }
    }
}