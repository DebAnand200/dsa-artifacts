package neetcode.arrays_n_strings;

public class Can_Place_Flowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        canPlaceFlowers(flowerbed, n);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        if(n==0){
            return true;
        }
        for(int i=0; i<size; i++){
            //check if a flower can be put only if front and back has 0
            //flowerbed[i]==0  //If the pot is empty
            //(i==0 || flowerbed[i-1]==0) // either it is the start index || or the prev element is 0
            //(i==size-1 || flowerbed[i+1]==0) //if it is the end index || or the next index is 0

            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == size-1 || flowerbed[i+1] == 0)){
                n--;
                flowerbed[i] = 1;

                if(n==0) return true;
            }

        }
        return false;

    }
}
