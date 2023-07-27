public class hard135 {
    public int candy(int[] ratings) {

        int[] candyArray = new int[ratings.length];
        for (int i = 0; i < candyArray.length; i++) {
            candyArray[i] = 1;
        }
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                candyArray[i] = candyArray[i-1] + 1;
            }
        }

        for (int i = ratings.length - 1; i >= 1; i--) {
            if (ratings[i-1] > ratings[i]){
                candyArray[i-1] = Math.max(candyArray[i-1],candyArray[i] + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < candyArray.length; i++) {
            res += candyArray[i];
        }
        return res;
    }
}
