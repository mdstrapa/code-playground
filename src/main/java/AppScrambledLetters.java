import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AppScrambledLetters {

    static List<String> originalWordList = new ArrayList<>(List.of("BRAZIL","ITALY","NETHERLANDS","JAPAN","CHILE", "GERMANY"));
    static List<String> wordList = new ArrayList<>();
    static List<Integer> rowList = new ArrayList<>();
    static int squareSize = 25;

    public static void main(String[] args) {
        System.out.println("Scrambled Words ----------------------------------------------------------");
        System.out.println();

        buildWordList();

        defineRowsToWriteWords();

        writeBoard();
    }

    static void buildWordList(){
        Random random = new Random();
        while (!originalWordList.isEmpty()){
            int elementToGet = random.nextInt(originalWordList.size());
            wordList.add(originalWordList.get(elementToGet));
            originalWordList.remove(elementToGet);
        }
    }

    static void writeBoard(){

        int wordToPrint = 0;

        for(int row = 0;row < squareSize;row++){
            if(wordToPrint < wordList.size()){
                if(row == rowList.get(wordToPrint)) {
                    writeWordLine(wordList.get(wordToPrint));
                    wordToPrint++;
                }else writeNormalLine();
            }else writeNormalLine();

            System.out.println();
        }

    }

    static void writeWord(String name){
        for(int c = 0;c < name.length(); c++){
            System.out.print(" ");
            System.out.print(name.charAt(c));
            System.out.print(" ");
        }
    }

    static void writeWordLine(String word){

        Random random = new Random();

        // we have to generate the start position for the word
        // this number will be something in between 0 and squareSize - word size
        int startPosition = random.nextInt(squareSize - word.length());
        for(int col = 0;col < squareSize;col++) {
            if (col == startPosition) {
                writeWord(word);
                col = col + word.length() - 1;
            }
            else writeChar(generateChar());
        }
    }

    static void writeNormalLine(){
        for(int col = 0;col < squareSize;col++){
            writeChar(generateChar());
        }
    }

    static char generateChar(){
        Random random = new Random();
        int charCode;
        // we add 65 because we want the number to be between 65 and 90, to get upper case letters only
        charCode = random.nextInt(26) + 65;
        return (char) charCode;
    }

    static void writeChar(char theChar){
        System.out.print(" ");
        System.out.print(theChar);
        System.out.print(" ");
    }

    static void defineRowsToWriteWords(){
        Random random = new Random();
        Integer rowNumber;
        for(int count = 0; count < wordList.size();count++){
            rowNumber = random.nextInt(squareSize);
            if(!rowList.contains(rowNumber)) rowList.add(rowNumber);
            else count--;
        }
        Collections.sort(rowList);
    }

}