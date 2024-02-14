import java.util.Arrays;

public class Twosum {

    public static void main(String[] args) {
        class Solution {
            int[] A = {1,3,3,4};
            int target = 5;
            int[] twoSum(int[] A, int target) {
                // add your logic here
                int indicesSuma[] = new int[2];
                for (int i = 0; i < A.length; i++) {
                    for (int j = i + 1; j < A.length; j++) {
                        if (A[i] + A[j] == target) {
                            indicesSuma[0] = i;
                            indicesSuma[1] = j;
                            System.out.println(i + j);
                            return indicesSuma;
                            
                        }
                    }
                }
                
                return indicesSuma;
                
                
            }
            
        }
       
    }

}