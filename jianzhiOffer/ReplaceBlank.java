package com.keller.jianzhiOffer;

public class ReplaceBlank {

    public static void main(String[] args) {
        String s = "2  A ";
        StringBuffer buffer = new StringBuffer(s);
        replace(buffer);
        System.out.println(buffer);
    }

    public static void replace(StringBuffer str){
        int length = str.length();
        int p1 = length-1;
        for(int i=0; i<=length-1; i++){
            //如果时空格则在后面增加两个空格，因为%20需要占3个位
            if(str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        //定义两个指针，p1指向原字符串的末尾，p2指向新的字符串的末尾
        int p2 = str.length() -1;
        //在原来的字符串从后往前遍历字符串，如果不是空格则将p1复制给p2，如果是的话则复制02%
        while(p2 > p1 && p1 > 0){
            if (str.charAt(p1) == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
                p1--;
            }else{
                str.setCharAt(p2--, str.charAt(p1--));
            }
        }
    }
}
