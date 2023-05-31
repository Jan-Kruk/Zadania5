package pl.camp.it.jankruk.xando.core;

import pl.camp.it.jankruk.xando.DB.EntryDB;
import pl.camp.it.jankruk.xando.GUI.Gui;

public class Core {
    private static Core core = new Core();
    EntryDB entryDB = EntryDB.getEntryDB();
    Gui gui = Gui.getGui();
    private Core(){

    }
    public void start(){
        boolean run = true;
        String player = "player1";
        gui.showStartMessage();
        while(run){
            gui.whoseRound(player);
            gui.addNewElement(gui.scanInput(player),player);
            gui.showBoard();
            run = gui.checkWinner(player);
            if (player.equals("player1")){
                player = "player2";
            }else{
                player = "player1";
            }
        }


    }
    public static Core getCore() {
        return core;
    }
}
