package arrays;

import java.util.Arrays;

public class Flipping_Image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        print(image);
        System.out.println("==================================");
        int[][] imageFlipped  = flipAndInvertImage(image);
        print(imageFlipped);

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int[] col = image[i];
            int n = col.length;
            for (int j = 0; j < n/2; j++) {
                int temp = col[j];
                col[j] = col[n-j-1];
                col[n-j-1] = temp;

                if(col[n-j-1] == 0){
                    col[n-j-1] = 1;
                }else{
                    col[n-j-1] = 0;
                }
                if(col[j] == 0){
                    col[j] = 1;
                }else{
                    col[j] = 0;
                }

//                int temp = (col[j])==0?1:0;
//                col[j] = (col[n-j-1])==0?1:0;
            }
        }
        return image;
    }

    public static void print(int[][] image){
        for (int[] col: image) {
            System.out.print("[");
            for (int n: col) {
                System.out.print(n);
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
