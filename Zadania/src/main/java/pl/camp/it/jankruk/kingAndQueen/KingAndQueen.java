package pl.camp.it.jankruk.kingAndQueen;

public class KingAndQueen {
    public static void main(String[] args) {
        System.out.println(kingAndQueen("b4 b8"));
        System.out.println(kingAndQueen("b4 e7"));
        System.out.println(kingAndQueen("b4 d2"));
        System.out.println(kingAndQueen("b4 g4"));
        System.out.println(kingAndQueen("f2 b1"));
        System.out.println(kingAndQueen("f2 c4"));
        System.out.println(kingAndQueen("f2 d5"));
        System.out.println(kingAndQueen("f2 g7"));

    }
    public static String kingAndQueen(String input){
        String[] inputArr = input.split(" ");
        if (inputArr[0].charAt(0) == inputArr[1].charAt(0)){
            return "Y";
        }else if (inputArr[0].charAt(1) == inputArr[1].charAt(1)){
            return "Y";
        }
        int posK1 =changeToInt(inputArr[0].charAt(0));
        int posK2 = Integer.parseInt(Character.toString(inputArr[0].charAt(1)));
        int posQ1 = changeToInt(inputArr[1].charAt(0));
        int posQ2 = Integer.parseInt(Character.toString(inputArr[1].charAt(1)));
        int temp1 = Integer.parseInt(Integer.toString(posK1) + Integer.toString(posK2));
        int temp2 = Integer.parseInt(Integer.toString(posQ1) + Integer.toString(posQ2));
        int temp3 = temp1;
        while (temp1 <= 88 || temp3 <=88){
            if(temp1 == temp2 || temp3 == temp2) {
                return "Y";
            }
            temp1+=11;
            temp3+=9;
        }
        temp1 =Integer.parseInt(Integer.toString(posK1) + Integer.toString(posK2));
        temp3 =temp1;
        while(temp1 >= 0 || temp3 >= 0){
            if(temp1 == temp2 || temp3 == temp2) {
                return "Y";
            }
            temp1-=11;
            temp3-=9;
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
}
