//this code generates a name for the new child basead on the mother's and the father's name

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppEightNameGenerator {

    public static void main(String[] args) {
        System.out.println("Program start ---------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the mother name: ");
        String motherName = scanner.nextLine();
        System.out.print("Type the father name: ");
        String fatherName = scanner.nextLine();

        generateName(motherName,fatherName).forEach(n -> System.out.println("Baby name: " + n));
        System.out.println("Program end   ---------------------------");

    }


    /*
    bussines rule: splits both names into to equal parts and the make all the four combinations:
    1 - first part of mother name + first part of father name
    2 - first part of mother name + second part of father name
    3 - second part of mother name + first part of father name
    4 - second part of mother name + second part of father name

    if the name has an odd number of chars the second part must hold the extra char

     */
    public static List<String> generateName(String motherName, String fatherName){

        String firstPartMotherName = motherName.substring(0,motherName.length()/2);

        String secondPartMotherName = motherName.substring(motherName.length()/2);

        String firstPartFatherName = fatherName.substring(0,fatherName.length()/2);

        String secondPartFatherName = fatherName.substring(fatherName.length()/2);

        List<String> babyNameList = new ArrayList<>();

        secondPartMotherName = secondPartMotherName.replaceFirst(secondPartMotherName.substring(0,1), secondPartMotherName.substring(0,1).toUpperCase());
        secondPartFatherName = secondPartFatherName.replaceFirst(secondPartFatherName.substring(0,1), secondPartFatherName.substring(0,1).toUpperCase());

        babyNameList.add(firstPartMotherName + firstPartFatherName.toLowerCase());
        babyNameList.add(firstPartMotherName + secondPartFatherName.toLowerCase());
        babyNameList.add(secondPartMotherName + firstPartFatherName.toLowerCase());
        babyNameList.add(secondPartMotherName + secondPartFatherName.toLowerCase());
        babyNameList.add(firstPartFatherName + firstPartMotherName.toLowerCase());
        babyNameList.add(firstPartFatherName + secondPartMotherName.toLowerCase());
        babyNameList.add(secondPartFatherName + firstPartMotherName.toLowerCase());
        babyNameList.add(secondPartFatherName + secondPartMotherName.toLowerCase());


        return babyNameList;
    }

}
