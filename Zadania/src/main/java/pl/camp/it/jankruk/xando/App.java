package pl.camp.it.jankruk.xando;

import pl.camp.it.jankruk.xando.core.Core;

public class App {
    static Core core = Core.getCore();
    public static void main(String[] args) {
        core.start();
    }
}
