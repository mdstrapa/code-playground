public class AppHexadecimal {

    public static void main(String[] args){
        sumHexa();
        sumBinary();
    }

    public static void sumHexa(){
        int a = 0x10;
        int b = 0x11;
        System.out.println("Hexa: " + (a + b));
    }

    public static void sumBinary(){
        int a = 0b10;
        int b = 0b11;
        System.out.println("Binary: " + (a + b));
    }

}
