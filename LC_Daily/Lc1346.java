package LC_Daily;

import java.util.Arrays;
import java.util.HashMap;

public class Lc1346 {
    
    public boolean checkIfExist(int[] arr) {
        
        // 2 3 5 10
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            int cv = arr[i];
            for(int j = arr.length - 1; j>=0; j--){
                if(arr[j] / 2 == cv && arr[j] % 2 == 0)
                    return true;
            }
        }
        return false;
    }   
}
