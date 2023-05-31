package pl.camp.it.jankruk.digarr;

public class Digarr {
    public static void main(String[] args) {
        System.out.println(digarr(32141232));
    }
    public static boolean digarr(int num){
        String dig = Integer.toString(num);
        return (dig.contains("0") || dig.contains("5"));
    }
}
