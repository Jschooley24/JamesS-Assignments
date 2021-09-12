//print 1-255
//print odd numbers btween 1-255
//sum to 255
//iterating through an array [1,3,5,7,9,13]
// find max
//array with odd numbers
import java.util.ArrayList;

public class Basics{
    public static void main(String [] args){
        //print255();
        //printodd();
        //printsum();
        int[] arr1 = {1,3,5,7,9,13};
        //myArray(arr1); //call the arr1 for the parameter. will print only 1 thing
        //findmax(arr1);
        findOdd(arr1);
    }
    public static void print255() {
        for(int i = 0; i <= 256; i++);
        System.out.println(i);
    }
    public static void printodd() {
        for(int i = 1; i <= 256; i = i + 2);
        System.out.println(i);
    }
    public static void printsum(){
        int sum = 0;// was i not 0 cant do i so needed to to sum at 0. also outside the forloop.
        for(int i = 0; i <= 256; i = i++); //for(int i = 0; i <= 256; i = i + sum);
        sum = i + sum;
        System.out.println("New number: " + i + " sum: " + sum);
    }
    public static void myArray(int[] x) {
        for(i = 0; i < x.length; i++ );//my code was i <=5. should use array length i < x.length-1 (x from my parameters)
        System.out.println(x[i]); //will print out 1 from array [1,3,5,7,9,13].to iterate the array use i for the forloop
    }
    public static void findMax(int [] arr) {
        int max = arr[0];//need to = to the other arr so that it will compare it self
        for (int i = 1; i < arr.length; i++){
            if (arr[1] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void findOdd(int [] arr) {
        ArrayList<object> y = new ArrayList<object>();
        for (int i = 1; i <= 255; i+=2){
            y.add(i);
        }
        System.out.println(y);
    }
        
}