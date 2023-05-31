package pl.camp.it.jankruk.paireq;

public class Paireq {
    public static void main(String[] args) {
        System.out.println(paireq(new int[]{1,1,1,2}));
    }
    public static int paireq(int[] arr){
        int number= mostOccurence(arr);
        return arr.length-number;
    }
    public static int mostOccurence(int[] arr){
        int num =0;
        int occurences =0;

        for (int i = 0; i < arr.length ;i++) {
            int count =0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] ){
                    count++;
                }
            }
            if (count >occurences){
                occurences = count;
                num = arr[i];
            }
        }
        return occurences;
    }
}


