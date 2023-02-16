/*  FIND THE BEST, AVERAGE AND WORST CASES FOR ALL THE ALGORITHMS
    THERE SHOULD BE A DETAILED ANALYSIS OF EACH LINE */

public class Simple{
    public Simple(){
        System.out.println("python is better but whatever");
    }
    public int FIND1(int[] A, int v) {
        int i = 0;
        while (i < A.length && A[i] != v){
            i++;
        }
        if (i == A.length){
            return -1;
        }
        return i;
    }
    public int FIND2(int[] A, int v) {
        int i = 0;
        int j = A.length-1;
        while (i <= j){
            if (A[i] == v){
                return i;
            } else if (A[j] == v){
                return j;
            }
            i++;
            j--;
        }
        return -1;
    }
    public void INSERTION(int[] A, int idx, int val) {
        A[idx] = val;
    }

    public int MINIMUM(int[] A) {
        int m = A[0];
        for (int i = 1; i < A.length; i++){
            if (A[i] < m){
                m = A[i];
            }
        }
        return m;
    }
    public int MAXIMUM(int[] A) {
        int m = A[0];
        for (int i = 1; i < A.length; i++){
            if (A[i] > m){
                m = A[i];
            }
        }
        return m;
    }
}