package com.birthdayblow.candles;

public class BlowCandleApplication {


    public static void main(String[] args) {
        // Test Case 1
        int[] arrayOfCandles = {8, 7, 7, 5, 3, 8, 8, 3, 5, 3, 7};
        System.out.println("No of blows required : " + getBlowsCount(arrayOfCandles));

        // Test Case 2

        int[] arrayOfCandles1 = {};
        System.out.println("No of blows required : " + getBlowsCount(arrayOfCandles1));

        // Test Case 3

        int[] arrayOfCandles2 = {1};
        System.out.println("No of blows required : " + getBlowsCount(arrayOfCandles2));

        // Test Case 4

        int[] arrayOfCandles3 = {1,2,3,3,6,6,7,8,9,10,11,12,13};
        System.out.println("No of blows required : " + getBlowsCount(arrayOfCandles3));
    }

    /**
     *
     * @param input
     * @return int as count of minimym blows required.
     */
    public static int getBlowsCount(int[] input) {
        if (input.length == 0) {
            return 0;
        }

        if (input.length == 1) {
            return 1;
        }

        // Sort the array so that all the same size candles come together

        QuickSort.sort(input, 0, input.length -1);

        int uniqueCandleSizeCount = 1;

        for (int i = 0; i < input.length -1; i++) {

            if (input[i] != input[i+1]) {
                uniqueCandleSizeCount++;
            }
        }
        return uniqueCandleSizeCount;
    }


}
