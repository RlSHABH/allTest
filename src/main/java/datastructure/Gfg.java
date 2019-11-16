package datastructure;

// An efficient Java program to find maximum sum
// sub-square matrix

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Class to store the position of start of
// maximum sum in matrix
class Position {
    int x;
    int y;

    // Constructor
    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Updates the position if new maximum sum
    // is found
    void updatePosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // returns the current value of X
    int getXPosition() {
        return this.x;
    }

    // returns the current value of y
    int getYPosition() {
        return this.y;
    }
}

class Gfg {
    // Size of given matrix
    static int N;

    // A O(n^2) function to the maximum sum sub-
    // squares of size k x k in a given square
    // matrix of size n x n
    public static int max_sum(int a[][], int subMatrixLength) {

        int sum = 0;
        int max=0;
        Integer[][] array =new Integer[subMatrixLength][subMatrixLength];
        Integer[][] finaArray=new Integer[subMatrixLength][subMatrixLength];

        for (int i = 0; i < a.length - subMatrixLength + 1; i++) {
            for (int j = 0; j < a.length - subMatrixLength + 1; j++) {
                int tempI = i;
                int k=0;

                while (k < subMatrixLength) {
                        int l=0;
                    int tempJ = j;
                    while (l < subMatrixLength) {

                        sum += a[tempI][tempJ];
                        array[k][l]=a[tempI][tempJ];
                        tempJ++;
                        l++;
                    }
                    k++;
                    tempI++;
                }
                if(sum>max)
                {
                    max=sum;
                    finaArray=array;
                    sum=0;
                }
                else sum=0;

            }


        }
        // Print the result matrix
        for (int i = 0; i < finaArray.length; i++) {
            for (int j = 0; j < finaArray.length; j++) {
                System.out.print(finaArray[i][j] + " ");
            }
            System.out.println();
        }

            return max;
    }
    // Driver program to test above function
    public static void main(String[] args) {
        N = 5;
        int[][] mat = { { 1, 1, 1, 1, 1 },
                { 2, 2, 2, 2, 2 },
                { 3, 8, 6, 7, 3 },
                { 4, 4, 4, 4, 4 },
                { 5, 5, 5, 5, 5 } };
        int k = 3;

        System.out.println("Maximum sum 3 x 3 matrix is");
        System.out.println(max_sum(mat, k));
    }
}