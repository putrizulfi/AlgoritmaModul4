package Sorting;
import java.util.Scanner;
public class No7_SortingSearching {
    public static void insertionsort(int[] A) {
        for (int i =1 ; i < A.length; i++){
            int key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)){

                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }

    }

    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    private static String[] search;
    public static void sequential(String[] search) {
        int B[] = {25, 7, 9, 13, 3};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
        int cari = input.nextInt();
        int ketemu = 0;

        System.out.println("Isi Data A Adalah : ");
        for (int i = 0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i<B.length; i++){
            if (B[i] == cari){
                ketemu = 1;
                System.out.print("Data Yang Dicari " + cari);
            }
        }
        System.out.println("");
        System.out.println("");

        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan");
    }

    public static void main(String[] args){
        System.out.println("Putri Zulfiaturrizki");
        int A[] = {25, 7, 9, 13, 3};
        No7_SortingSearching.tampil(A);
        No7_SortingSearching.insertionsort(A);
        No7_SortingSearching.tampil(A);
        No7_SortingSearching.sequential(search);

    }
}