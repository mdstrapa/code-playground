import java.util.Scanner;

public class AppTurnName {

    public String turnName(String originalName){
        StringBuilder newName = new StringBuilder();

        String originalNameLowerCase = originalName.toLowerCase();

        for(int i = 0; i < originalNameLowerCase.length(); i++){
            char c = originalNameLowerCase.charAt(i);
            switch (c){
                case 'f': newName.append("ph");
                    break;
                case 'l': {
                    if(i > 0) newName.append("ll");
                    else newName.append("l");
                }
                    break;
                case 'i' : newName.append("y");
                    break;
                case 'e' : {
                    if (i == originalNameLowerCase.length() - 1) newName.append("eh");
                    else newName.append("e");
                }
                    break;
                case 'o' : {
                    if (i == originalNameLowerCase.length() - 1) newName.append("oh");
                    else newName.append("o");
                }
                    break;
                case 'a' : {
                    if (i == originalNameLowerCase.length() - 1) newName.append("ah");
                    else newName.append("a");
                }
                break;
                case 'u' : {
                    if (i == originalNameLowerCase.length() - 1) newName.append("uh");
                    else newName.append("u");
                }
                break;
                case 'v' : newName.append("w");
                    break;
                case 'c' : {
                    if (originalNameLowerCase.charAt(i + 1) == 'o') newName.append("k");
                    else newName.append("c");
                }
                    break;
                default: newName.append(c);
            }
        }

        String extravagantName = newName.substring(0, 1).toUpperCase() + newName.substring(1);

        return !extravagantName.equals(originalName) ? extravagantName : "You don't have an extravagant name!";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AppTurnName appTurnName = new AppTurnName();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Make your name extravagant!!");
        System.out.println();
        System.out.print("Type your name or EXIT to leave: ");
        String name = scanner.nextLine();
        while (!name.equals("exit")) {
            System.out.println();
            System.out.println("Your extravagant name is " + appTurnName.turnName(name));
            System.out.println();
            System.out.print("Type your name or EXIT to leave: ");
            name = scanner.nextLine();
        }
        System.out.println("------------------------------------------------------------------");
    }


}
