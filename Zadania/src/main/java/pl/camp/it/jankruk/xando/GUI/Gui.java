package pl.camp.it.jankruk.xando.GUI;

import pl.camp.it.jankruk.xando.DB.EntryDB;

import java.util.Scanner;

public class Gui {
    EntryDB entryDB = EntryDB.getEntryDB();
    Scanner scanner = new Scanner(System.in);
  private   static Gui gui = new Gui();

    private Gui(){

    }
    public String whoseRound(String player){
        return "Runda -> " +player;
    }

    public void showStartMessage(){
        System.out.println("Grę będzie zaczynać player1, zapraszam do rozgrywki");
        System.out.println("Player1 -> x");
        System.out.println("Player2 -> o");
        System.out.println("Aby grać należy używać cyfr od 1 do 9 zgodnie z tabelą poniżej");
        System.out.println("1 | 2 | 3");
        System.out.println("----------");
        System.out.println("4 | 5 | 6");
        System.out.println("----------");
        System.out.println("7 | 8 | 9");
    }
    public int scanInput(String player){
        System.out.println( player + " proszę podaj które pole chcesz wypełnić:");
        int scanned = scanner.nextInt();
        if (scanned<1 || scanned >9){
            System.out.println("Proszę wprowadzić liczbę pomiędzy 1 a 9");
            scanned = scanInput(player);
        }
        if (!entryDB.checkIfPlaceTaken(scanned)){
            System.out.println("Pole zostało już wypełnione");
            scanned = scanInput(player);
        }
        return scanned;

    }

    public void addNewElement(int num,String player){
        entryDB.addToBoard(num,player);
    }
    public boolean checkWinner(String player){
        return entryDB.checkIfWon(player);
    }
    public void showBoard(){
        entryDB.toString();
    }

    public static Gui getGui() {
        return gui;
    }
}
