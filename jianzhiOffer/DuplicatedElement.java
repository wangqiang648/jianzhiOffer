package com.keller.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

public class DuplicatedElement {

    public static void main(String[] args) {
        int[] elements = {2,3,1,0,2,5};
        List list = new ArrayList();
        getDuplicated(elements, elements.length, list);
        System.out.println(list);
    }
    
    public static void getDuplicated(int[] elements, int length, List list){
        if(elements == null || length == 0){
            return;
        }
        for(int i=0; i<length; i++){
            while(elements[i] != i){
                if(elements[i] == elements[elements[i]]){
                    list.add(elements[i]);
                    break;
                }
                //elements[i]为当前这个索引位置上的值，elements[elements[i]]当前值作为索引时它上面的元素
                swap(elements, elements[i], elements[elements[i]]);
            }
        }
    }
    
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
