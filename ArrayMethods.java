import java.util.Arrays;
/**
 * ArrayMethods does the following
 * 1) makes an array called myArray
 * 2) counts how many elements are in the array
 * 3) computes the sum and average of all the elements of the array
 * 4) finds the largest element in the array and its index
 * 5) prints out all the elements in the array seperated by commas
 *
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.0
 * @since 4/19/2026
 */
public class ArrayMethods
{
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
    finds how many values are in the array

    @return the number of items in the array
     */
    public int count(){
        int counter=0;
        for(int i : myArray){
            counter ++;
        }
        return counter;
    }

    /**
    finds the sum of all the values in the array

    @return all the numbers in the array added up
     */
    public int sum(){
        int add=0;
        for(int i : myArray){
            add += i;
        }
        return add;

    }

    /**
    finds the average of all the values in the array

    @return the sum divided by the number of items which is the average
     */
    public double average(){
        return (double)sum()/count();
    }

    /**
    finds the largest value in the array

    @return the largest value in the array
     */
    public int findMax(){
        int max = myArray[0];
        for(int i : myArray){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    /**
    finds the index of the largest value of the in the array

    @return the index of the largest value in the array
     */
    public int findIndexOfMax(){
        int inMax = 0;
        int max = myArray[0];
        for(int i = 0; i < (myArray.length)-1; i++){
            if(myArray[i] > max){
                max = myArray[i];
                inMax = i;
            }
        }
        return inMax;
    }

    /**
    prints an int array, nicely formatted
    @param inArray int array to print
     */
    public void print(int[ ] inArray)
    {
        System.out.print("{");
        int i;
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
        if (inArray.length > 0)
            System.out.print(inArray[i]);
        System.out.println("}");

    }
}