public class ArrayAlgorithms{
    int arr[];
    public ArrayAlgorithms(int [] intArray){
        arr = intArray;
    }
    int min(){
        long start , end ;
        int min_value = arr[0] , i = 0;
        start=System.nanoTime();
        for(i=1;i<arr.length;i++){
            if(arr[i]<min_value){
                min_value=arr[i];
            }
        }
        end=System.nanoTime();
        System.out.println("Time : "+(end-start)+" nanoSec");
        return min_value;
    }
    int max(){
        long start , end ;
        int max_value = arr[0] , i = 0;
        start=System.nanoTime();
        for(i=1;i<arr.length;i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }
        }
        end=System.nanoTime();
        System.out.println("Time : "+(end-start)+" nanoSec");
        return max_value;
    }
    int binarySearch(int num){
        long start , end;
        start=System.nanoTime();
        int mid = arr.length/2;
        int min =0 ;
        int max = arr.length-1;
        while(min<=max ){
            System.out.println();
            if(arr[mid] == num){
                end=System.nanoTime();
                System.out.println("Time : "+(end-start)+" nanoSec");
                return arr[mid];
            }
            else if(arr[mid] < num){
                min=mid+1;
                mid=(max+min)/2;
            }
            else if(arr[mid] > num){
                max=mid-1;
                mid=(max+min)/2;
            }
        }
        end=System.nanoTime();
        System.out.println("Time : "+(end-start)+" nanoSec");
        return -273;
    }
}