/*
 * Observes a 6x6 array in hourglass patters 
 * 101
 *  1
 * 101
 * and returns the sum of the largest pattern in the array
 */
import java.util.*;

public class Hourglass 
{	//method to find hourglass pattern
    public static int hourglass(int [][] arr, int row, int col, int maxSum)
    {
        int sum = 0;
        for (row = 0; row < 4; row++)
        {	//arranged to find the hourglass pattern and add the values in the locations
           sum = arr[row][col] + arr[row][col+1] + arr[row][col+2] + arr[row+1][col+1] + arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2];
            if(row == 0 && col == 0)
            {	
                maxSum = sum;
            }
            else if(sum > maxSum)
            {
                maxSum = sum;
            }
    
        }
        col++;
        if(col < 4)
        {
            return hourglass(arr, row, col, maxSum);
        }
        else
        {	//returns max sum once all rows and columns have been iterated through
        	 return maxSum;
        }
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int maxSum = 0;
        int row;
        int col;
        int arr[][] = new int[6][6];
        System.out.println("Enter the numbers that you would like to be input into"
        		+ "/nthis array:");
        for(row = 0; row < 6; row++)//loop to accept input for array
        {
            for(col = 0; col < 6; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        row = 0;
        col = 0;
        System.out.println(hourglass(arr, row, col, maxSum));
    }
}
