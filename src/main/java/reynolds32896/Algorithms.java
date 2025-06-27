package reynolds32896;

public class Algorithms {

    public int SequentialSearch(int[] A, int k){
        int n = A.length;
        int i = 0;
        while(i < n && A[i] != k){
            i = i + 1;
        }
        if (i < n){
            return i;
        }else{
            return -1;
        }
    }

    public int MaxElement(int[] A){
        int maxVal = A[0];
        for (int i = 1; i < A.length; i++){
            if (A[i] > maxVal){
                maxVal = A[i];
            }
        }
        return maxVal;
    }

    public boolean UniqueElements(int[] A){
        int n = A.length;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (A[i] == A[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] MatrixMultiplication(int[][] A, int[][] B){
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++){
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public int[][] GaussianElimination(int[][] A){
        for (int i = 0; i < A.length - 1; i++){
            for (int j = i + 1; j < A.length; j++){
                for (int k = 0; k < A[0].length; k++){
                    A[j][k] = A[j][k] - A[i][k] * A[j][i] / A[i][i];
                }
            }
        }
        return A;
    }

    public int Binary(int n){
        int count = 1;
        while(n > 1){
            count = count + 1;
            n = n / 2;
        }
        return count;
    }

    public int Factorial(int n){
        if (n == 0){
            return 1;
        }else{
            return Factorial(n - 1) * n;
        }
    }

    public int BinRcc(int n){
        if (n == 1){
            return 1;
        }
        else{
            return BinRcc(n / 2) + 1;
        }
    }
}
