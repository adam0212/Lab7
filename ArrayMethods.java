import java.util.Arrays;
/**
 * ArrayMethods does the following
 * 1) makes an array called myArray
 * 2) counts how many elements are in the array
 * 3) computes the sum and average of all the elements of the array
 * 4) finds the largest element in the array and its index
 * 5) prints out all the elements in the array seperated by commas
 * 6) finds the index of and lists all instances of a specific element
 * 7) gets the original array
 * 8) makes a copy of the original array
 * 9) makes a new array with the elements of the original in reverse order
 *
 * @author Adam Shaheen adamhshaheen@gmail.com
 * @version v1.1
 * @since 4/26/2026
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

    /**
    finds the index of the last time a specific integer is found in the array

    @param key the integer the user wants to find the last usage of
    @return the index of the last time key is found in the array 
     */
    public int findLast(int key)
    {
        int lastPlace = -1;
        for(int i = 0; i < (myArray.length)-1; i++){
            if(myArray[i] == key){
                lastPlace = i;
            }
        }
        return lastPlace;
    }

    /**
    finds the index of all instances of a specific integer in the array

    @param key the integer the user wants to find instances of
    @return an array with all the indices where the integer key occurs 
     */
    public int[] findAll(int key)
    {
        int a = 0, instances = 0;
        for(int i : myArray){
            if(i == key){
                instances++;
            }
        }
        int[] list = new int[instances];
        for(int i = 0; i < (myArray.length)-1; i++){
            if(myArray[i] == key){
                list[a] = i;
                a++;
            }
        }
        return list;
    }

    /**
    gets the original array

    @return the original array
     */
    public int[] getArray()
    {
        return myArray;
    }

    /**
    makes a copy of the original array

    @return the copy of the original array
     */
    public int[] copyArray()
    {
        int[] arrayCopy;
        return arrayCopy = Arrays.copyOf(myArray, myArray.length);  
    }

    /**
    puts the elements of the original array in reverse order

    @return an array with the elements in the original array in reverse order
     */
    public int[] reverseArray(int[] inArray)
    {
        int[] reverse = new int[myArray.length];
        for(int i = 0; i < (myArray.length); i++){
            reverse[i] = inArray[myArray.length-i-1];
        }
        return reverse;
    }

}