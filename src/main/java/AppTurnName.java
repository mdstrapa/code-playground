import java.util.Scanner;

public class AppTurnName {

    public ExtravagantName turnName(String originalName){
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
                    if (originalNameLowerCase.charAt(i + 1) == 'o' || originalNameLowerCase.charAt(i + 1) == 'a') newName.append("k");
                    else newName.append("c");
                }
                    break;
                default: newName.append(c);
            }
        }

        String newNameCapitalized = newName.substring(0, 1).toUpperCase() + newName.substring(1);

        //TODO: fix the 'exit' case
        //TODO: change everything to Upper Case so the user can not break the rule
        //TODO: implement a new rule for the 'n' character. it must be double if it's not the first neither the last character
        //if the name already has a double n so we don't change anything
        //TODO: implement an extravagant level so the program can tell how much extravagant the name is

        return new ExtravagantName(!newNameCapitalized.equals(originalName),newNameCapitalized);
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
            ExtravagantName extravagantName = appTurnName.turnName(name);
            if(extravagantName.isExtravagant()) System.out.println("Your extravagant name is " + extravagantName.getExtravagantName());
            else System.out.println("You don't have an extravagant name!");
            System.out.println();
            System.out.print("Type your name or EXIT to leave: ");
            name = scanner.nextLine();
        }
        System.out.println("------------------------------------------------------------------");
    }

}


class ExtravagantName {
    boolean isExtravagant;
    String extravagantName;

    public ExtravagantName(boolean isExtravagant, String extravagantName) {
        this.isExtravagant = isExtravagant;
        this.extravagantName = extravagantName;
    }

    public boolean isExtravagant() {
        return isExtravagant;
    }

    public void setExtravagant(boolean extravagant) {
        isExtravagant = extravagant;
    }

    public String getExtravagantName() {
        return extravagantName;
    }

    public void setExtravagantName(String extravagantName) {
        this.extravagantName = extravagantName;
    }
}
