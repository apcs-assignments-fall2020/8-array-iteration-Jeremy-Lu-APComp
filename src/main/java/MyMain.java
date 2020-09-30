import java.util.Arrays;
public class MyMain {

// Reverses an array
    public static int[] reverse(int[] arr) {
      int length = arr.length;
      int temp = 0;
      for(int i = 0; i<length/2; i++){
        temp = arr[i];
        arr[i] = arr[(arr.length-1)-i];
        arr[(arr.length-1)-i] = temp;
      }
      return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
      int arr_length = arr.length;
      for (int i = 0; i < arr_length; i++){
                  //nested
        for (int b = i+1; b < arr_length; b++){
          
          if (arr[i] > arr[b]){
            int index = arr[i];
            arr[i] = arr[b];
            arr[b] = index;
          }
          else {
            break;
          }
//
        }
        //
      }
      return arr[arr_length - 2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
      int c = 0;
      for (int i = 0; i < arr.length-2; i++){
      if(arr[i+1]/arr[i] == arr[i+2]/arr[i+1]){
        c++;
      }
      else{
        return false;
      }
      }
      if(c==arr.length-2){
          return true;
        }
        else{
          return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 100, 1000}; //this is a geometric sequence.
        System.out.println("Original: " + Arrays.toString(arr));
        int[] a = reverse(arr);
        System.out.println("Reverse: " + Arrays.toString(a));
        System.out.println("Second largest value in array: " + secondLargest(arr));
        System.out.println("Is geometric? " + isGeometric(arr));
    }
}
//QUESTIONS: Why isn't the reverse(arr) working?
//isGeometric is not working either - it just returns FALSE regardless of what I put.