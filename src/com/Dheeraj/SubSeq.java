package com.Dheeraj;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        //subseq("","abc");
        //System.out.println(subseqRet("","abc"));
        //subSeqWithAscii("", "abc");
        System.out.println(subSeqWithAsciiRet("", "abc"));
    }
    // abc divided in all possible sequence
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    // sequence in arrau(list)
    static ArrayList<String>subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String>left = subseqRet(p+ch,up.substring(1));
        ArrayList<String>right = subseqRet(p,up.substring(1));
        left.addAll(right);
        return left;

    }
    // with ascii value;
    static void subSeqWithAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqWithAscii(p,up.substring(1));
        subSeqWithAscii(p+ch,up.substring(1));
        subSeqWithAscii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String>subSeqWithAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String>first = subSeqWithAsciiRet(p,up.substring(1));
        ArrayList<String>second = subSeqWithAsciiRet(p+ch,up.substring(1));
        ArrayList<String>third = subSeqWithAsciiRet(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
