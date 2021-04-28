package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] flowerbad = {1, 0, 0, 0, 0, 0};
	    int n = 3;
	    Solution s = new Solution();
	    System.out.println(s.canPlaceFlowers(flowerbad, n));
    }
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1)
        {
            if((flowerbed[0]==0&&n<2)||(flowerbed[0]==1&&n==0))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        int count = 0;
        for(int i = 0;i<flowerbed.length;i++) {
            if(i==0) {
                if(flowerbed[i]==0 && flowerbed[i+1]==0) {
                    count++;
                    i++;
                }
                continue;
            }
            if(i==flowerbed.length-1)
            {
                if(flowerbed[i]==0 && flowerbed[i-1]==0) {
                    count++;
                    i++;
                }
                continue;
            }
            if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0) {
                count++;
                i++;
            }
        }
        return n<=count;
    }
}
