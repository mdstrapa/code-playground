import java.util.Scanner;

public class AppMakeNameExtravagant {

    public ExtravagantName makeExtravagant(String originalName){
        StringBuilder newName = new StringBuilder();
        int extravagantLevel = 0;
        originalName = originalName.toUpperCase();

        for(int i = 0; i < originalName.length(); i++){
            char c = originalName.charAt(i);
            switch (c){
                case 'F': {
                    newName.append("PH");
                    extravagantLevel++;
                }
                    break;
                case 'L': {
                    if(i > 0) {
                        newName.append("LL");
                        extravagantLevel++;
                    }
                    else newName.append("L");
                }
                    break;
                case 'I' : {
                    newName.append("Y");
                    extravagantLevel++;
                }
                    break;
                case 'E' : {
                    if (i == originalName.length() - 1) {
                        newName.append("EH");
                        extravagantLevel++;
                    }
                    else newName.append("E");
                }
                    break;
                case 'O' : {
                    if (i == originalName.length() - 1) {
                        newName.append("OH");
                        extravagantLevel++;
                    }
                    else newName.append("O");
                }
                    break;
                case 'A' : {
                    if (i == originalName.length() - 1) {
                        newName.append("AH");
                        extravagantLevel++;
                    }
                    else newName.append("A");
                }
                break;
                case 'U' : {
                    if (i == originalName.length() - 1) {
                        newName.append("UH");
                        extravagantLevel++;
                    }
                    else newName.append("U");
                }
                break;
                case 'V' : {
                    newName.append("W");
                    extravagantLevel++;
                }
                break;
                case 'C' : {
                    if (originalName.charAt(i + 1) == 'O' || originalName.charAt(i + 1) == 'A') {
                        newName.append("K");
                        extravagantLevel++;
                    }
                    else newName.append("C");
                }
                break;
                case 'N' : {
                    if (i == originalName.length() - 1) newName.append("N");
                    else if (originalName.charAt(i + 1) == 'N' ) {}
                    else if (i != originalName.length() - 1 && i != 0) {
                        newName.append("NN");
                        extravagantLevel++;
                    }
                    else newName.append("N");
                }
                break;
                default: newName.append(c);
            }
        }

        return new ExtravagantName(extravagantLevel,newName.toString());
    }

    public ExtravagantLevel evaluateExtravagantLevel(ExtravagantName extravagantName){
        switch (extravagantName.getExtravagantLevel()){
            case 0: return ExtravagantLevel.NO_EXTRAVAGANT;
            case 1:
            case 2:
                return ExtravagantLevel.LOW_EXTRAVAGANT;
            case 3:
            case 4:
            case 5:
                return ExtravagantLevel.SOME_EXTRAVAGANT;
            default: return ExtravagantLevel.VERY_EXTRAVAGANT;

        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AppMakeNameExtravagant appMakeNameExtravagant = new AppMakeNameExtravagant();

        System.out.println("------------------------------------------------------------------");
        System.out.println("Make your name extravagant!!");
        System.out.println();
        System.out.print("Type your name or EXIT to leave: ");
        String name = scanner.nextLine().toUpperCase();
        while (!name.equals("EXIT")) {
            System.out.println();
            ExtravagantName extravagantName = appMakeNameExtravagant.makeExtravagant(name);

            if(appMakeNameExtravagant.evaluateExtravagantLevel(extravagantName) == ExtravagantLevel.NO_EXTRAVAGANT) System.out.println("You don't have an extravagant name!");
            else{
                System.out.println("Your extravagant name is " + extravagantName.getExtravagantName());
                System.out.println("The extravagant level of your name is " + appMakeNameExtravagant.evaluateExtravagantLevel(extravagantName).getExtravagantLevelLabel());
            }


            System.out.println();
            System.out.print("Type your name or EXIT to leave: ");
            name = scanner.nextLine().toUpperCase();
        }
        System.out.println("------------------------------------------------------------------");
    }

}


class ExtravagantName {
    int extravagantLevel;
    String extravagantName;

    public ExtravagantName(int extravagantLevel, String extravagantName) {
        this.extravagantLevel = extravagantLevel;
        this.extravagantName = extravagantName;
    }

    public int getExtravagantLevel() {
        return extravagantLevel;
    }

    public String getExtravagantName() {
        return extravagantName;
    }

}

enum ExtravagantLevel {
    NO_EXTRAVAGANT("No Extravagant"),
    LOW_EXTRAVAGANT ("Low Extravagant"),
    SOME_EXTRAVAGANT("Some Extravagant"),
    VERY_EXTRAVAGANT("Very Extravagant");;

    private final String extravagantLevel;

    ExtravagantLevel(String extravagantLevel) {
        this.extravagantLevel = extravagantLevel;
    }

    // Getter method to access the label
    public String getExtravagantLevelLabel() {
        return extravagantLevel;
    }
}