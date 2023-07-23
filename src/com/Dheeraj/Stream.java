package com.Dheeraj;

public class Stream {
    public static void main(String[] args) {
        //skip("", "abcdaab");
        System.out.println(SkipApple("abcapplegoing"));
        System.out.println(skipAppNotApple("abcdappof"));
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p , up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    // Skip the apple in string
    static String SkipApple(String up){
        if(up.isEmpty()) {

            return " ";
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return SkipApple(up.substring(5));
        }
        else{
            return up.charAt(0)+SkipApple(up.substring(1));
        }
    }
    // skip app not apple
    static String skipAppNotApple(String up){
        if(up.isEmpty()) {
            return " ";
        }
        char ch = up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }

    }
}
