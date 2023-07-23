package com.Dheeraj;

import java.util.ArrayList;
// Dice prbm means ludo chhakka
public class DiceProblem {
    public static void main(String[] args) {
        //Dice("",4);
        //System.out.println(DiceRet("",4));
        DiceFace("", 4,6);
        System.out.println(DiceFaceRet("",4,6));
    }
    static void Dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target ; i++) {
            Dice(p+i, target-i);
        }

    }
    static ArrayList<String> DiceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            list.addAll(DiceRet(p+i, target-i));
        }
        return list;
    }
    static void DiceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target ; i++) {
            DiceFace(p+i, target-i, face);
        }

    }
    static ArrayList<String> DiceFaceRet(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target ; i++) {
            list.addAll(DiceFaceRet(p+i, target-i, face));
        }
        return list;
    }

}
