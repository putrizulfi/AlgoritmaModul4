package Sorting;
public class No3_Selection {
    public static void selectionSort(int[] A){
        int smallIndex;
        int pass, j, n = A.length;
        int temp;
    
    for (pass=0; pass<n-1; pass++) {
        smallIndex = pass;
        for (j = pass + 1; j<n; j++){
            if (A[j]<A[smallIndex]) {
                smallIndex = j;
            }
        }
        
        temp = A[pass];
        A[pass] = A[smallIndex];
        A[smallIndex] = temp;
    }
}
    
public static void tampil (int data[]) {
    for (int i=0; i<data.length; i++){
        System.out.print(data[i] + " ");
    }
    System.out.println();
}

public static void main (String[] args) {
    int A[] = {25, 7, 9, 13, 3};
    No3_Selection.tampil(A);
    No3_Selection.selectionSort(A);
    No3_Selection.tampil(A);
    
    System.out.println("Putri Zulfiaturrizki");
    }
}
