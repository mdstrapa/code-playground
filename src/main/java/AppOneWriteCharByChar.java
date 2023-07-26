//This example writes a string char by char until it gets the full string.

public class AppOneWriteCharByChar {
    public static void main(String[] args) {
        System.out.println("Start =========================");

        String word = "Paralelepípado";

        for(int c = 1;c <= word.length();c++){
            System.out.println(word.substring(0,c));
        }

        for(int c = word.length() - 1;c > 0;c--){
            System.out.println(word.substring(0,c));
        }

        System.out.println("End =========================");

    }
}
