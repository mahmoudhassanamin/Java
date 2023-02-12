public class ArrayProgram{
    public static void main (String[] args){
        // data must not contains number (-273) beacause i use this num in binary search method.
        int arr[]=new int[]{523,643,354,443,625,674,432,523,643,354,443,625,674,432}; 
        ArrayAlgorithms int_array=new ArrayAlgorithms(arr);
        System.out.println(int_array.min());
        System.out.println(int_array.max());
        int num;
        int_array.arr=new int[]{34,45,56,57,78,98,100,101};
        num = int_array.binarySearch(57);
        if(num != -273){
            System.out.println("number is founded : "+ num);
        }
        else{
            System.out.println("number not found");
        }
        num = int_array.binarySearch(5);
        if(num != -273){
            System.out.println("number is founded : "+ num);
        }
        else{
            System.out.println("number not found");
        }
    }
}