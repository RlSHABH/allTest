package datastructure;

public class TowerofHanoiProblem {

    public static void main(String[] args)
    {
        int n=4;//disk
        towerOfHanoi(n,"A","B","C");
    }

    static void towerOfHanoi(int n,String A,String B,String C)
    {
        if(n==1)
        {
            System.out.println("disk 1 From "+A+"   to  " +C);
            return;
        }
        towerOfHanoi(n-1,A,C,B);// move upper n-1 to aux

        System.out.println("disk 1 From "+A+"   to  " +C);
        towerOfHanoi(n-1,B,A,C);// move n-1 to 'To'
    }
}
