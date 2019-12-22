package com.keller.jianzhiOffer;

public class FindTargetFromTwoDimentionArray {

    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,13},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,29}};
        Boolean b = find(20, arr);
        System.out.println(b);
    }

    public static Boolean find(int target, int[][] arr){
        if(arr.length == 0 || arr == null){
            return false;
        }
        int row = arr.length-1;
        int col = arr[0].length-1;
        int r = 0;  int c = arr[0].length-1;
        while(r < row && c > 0){
            if(arr[r][c] > target){
                c--;
            }else if (arr[r][c] < target){
                r++;
            }else {
                return true;
            }
        }
        return false;
    }
}
