package pl.camp.it.jankruk.kingAndQueen;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

public class KingAndQueen {

    public static void main(String[] args) {
//        System.out.println(kingAndQueen("b4 b8"));
//        System.out.println(kingAndQueen("b4 e7"));
//        System.out.println(kingAndQueen("b4 d2"));
//        System.out.println(kingAndQueen("b4 g4"));
//        System.out.println(kingAndQueen("f2 b1"));
//        System.out.println(kingAndQueen("f2 c4"));
//        System.out.println(kingAndQueen("f2 d5"));
//        System.out.println(kingAndQueen("f2 g7"));
//        System.out.println(kingAndQueen("b7 c8"));
        for (int i = 0; i <100; i++) {
            System.out.println(randomInput());
            System.out.println(kingAndQueen(randomInput()));
        }
        System.out.println(kingAndQueen("f6 b2"));
    }
    public static String randomInput(){

        return changeToString((int)Math.round(Math.random()*7))+Math.round(Math.random()*7+1) +
                " " + changeToString((int)Math.round(Math.random()*7))+Math.round(Math.random()*7+1);
    }
    public static String kingAndQueen(String input){
        String[] inputArr = input.split(" ");
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], "-");
        }
        int posK1 =changeToInt(inputArr[0].charAt(0));
        int posK2 = Integer.parseInt(Character.toString(inputArr[0].charAt(1)));
        int posQ1 = changeToInt(inputArr[1].charAt(0));
        int posQ2 = Integer.parseInt(Character.toString(inputArr[1].charAt(1)));
        board[board.length-posK2][posK1-1] = "K";
        board[board.length-posQ2][posQ1-1] = "Q";
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        if (inputArr[0].charAt(0) == inputArr[1].charAt(0)){
            return "Y";
        }else if (inputArr[0].charAt(1) == inputArr[1].charAt(1)){
            return "Y";
        }

        for (int j=board.length-posK2,f=posK1-1;  j<8 && f >= 0 ;j++,f--) {
            if (board[j][f].equals("Q")){
                return "Y";
            }
        }
        for (int j=board.length-posK2,f=posK1-1;  j<8 && f < 8 ;j++,f++) {
            if (board[j][f].equals("Q")){
                return "Y";
            }
        }
        for (int j=board.length-posK2,f=posK1-1;  j>=0 && f >= 0 ;j--,f--) {
            if (board[j][f].equals("Q")){
                return "Y";
            }
        }
        for (int j=board.length-posK2,f=posK1-1;  j>=0 && f < 8 ;j--,f++) {
            if (board[j][f].equals("Q")){
                return "Y";
            }
        }
        return "N";

    }
    public static int changeToInt(char input){
        switch (input){
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            default:
                return -1;
        }
    }
    public static String changeToString(int input){
        switch (input){
            case 0:
                return "a";
            case 1:
                return "b";
            case 2:
                return "c";
            case 3:
                return "d";
            case 4:
                return "e";
            case 5:
                return "f";
            case 6:
                return "g";
            case 7:
                return "h";
            default:
                return "ola senior";
        }
    }

}
