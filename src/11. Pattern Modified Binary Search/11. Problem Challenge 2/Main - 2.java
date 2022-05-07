import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public boolean search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return true;
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                start++;
                end--;
            } else if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target <= arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if(target >= arr[mid] && target <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[]args) {
    }
}