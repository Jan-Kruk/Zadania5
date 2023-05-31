package pl.camp.it.jankruk.xando.DB;

import java.util.Arrays;

public class EntryDB {
    private String[][] board = new String[][]{{"-","-","-"},{"-","-","-"},{"-","-","-"}};

    private static EntryDB entryDB = new EntryDB();
    private EntryDB(){

    }
    public void addToBoard(int num, String player) {
        String entry = whichPlayer(player);
        switch (num) {
            case 1:
                board[0][0] = entry;
                break;
            case 2:
                board[0][1] = entry;
                break;
            case 3:
                board[0][2] = entry;
                break;
            case 4:
                board[1][0] = entry;
                break;
            case 5:
                board[1][1] = entry;
                break;
            case 6:
                board[1][2] = entry;
                break;
            case 7:
                board[2][0] = entry;
                break;
            case 8:
                board[2][1] = entry;
                break;
            case 9:
                board[2][2] = entry;
                break;
        }
    }
    public boolean checkIfWon(String player){
        String entry = whichPlayer(player);
        for (int i = 0; i < board.length; i++) {
            if (board[i][1].equals(board[i][0]) && board[i][1].equals(board[i][2]) && board[i][1].equals(entry)) {
                System.out.println(player + " won, Congratulations!!");
                return false;
            }else if (board[1][i].equals(board[0][i]) && board[1][i].equals(board[2][i]) && board[1][i].equals(entry)) {
                    System.out.println(player + " won, Congratulations!!");
                return false;
            }

        }
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[2][2].equals(entry)){
            System.out.println(player + " won, Congratulations!!");
            return false;
        }else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && board[2][0].equals(entry)){
            System.out.println(player + " won, Congratulations!!");
            return false;
        }
        return true;
    }
  private String whichPlayer(String player){
        if (player.equals("player1")) {
           return  "x";
        } else {
            return  "o";
        }
    }
    public boolean checkIfPlaceTaken(int num){
        String entry = "-";
        switch (num) {
            case 1 -> {
                return board[0][0].equals(entry);
            }
            case 2 -> {
                return board[0][1].equals(entry);
            }
            case 3 -> {
                return board[0][2].equals(entry);
            }
            case 4 -> {
                return board[1][0].equals(entry);
            }
            case 5 -> {
                return board[1][1].equals(entry);
            }
            case 6 -> {
                return board[1][2].equals(entry);
            }
            case 7 -> {
                return board[2][0].equals(entry);
            }
            case 8 -> {
                return board[2][1].equals(entry);
            }
            case 9 -> {
                return board[2][2].equals(entry);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if (j==0){
                    System.out.print(board[i][j]);
                }else {
                System.out.print( " | " +board[i][j]);
                }
            }
            if(i==board.length-1){
                continue;
            }
            System.out.println();
            System.out.println("---------");
        }
        System.out.println();
        System.out.println();
        return "";
    }

    public static EntryDB getEntryDB() {
        return entryDB;
    }
}
