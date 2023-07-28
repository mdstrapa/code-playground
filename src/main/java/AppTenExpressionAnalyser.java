import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTenExpressionAnalyser {

    public static void main(String[] args) {
        System.out.println("Program start -----------------------");

        System.out.println();

        Scanner userInput = new Scanner(System.in);

        System.out.print("Type some expression: ");

        String expression = userInput.nextLine();

        System.out.println();

        System.out.println("The expression you typed is: '" + expression + "'");

        System.out.println();

        List<Element> elementList = createElementList(expression);

        while(expressionHasPendingOperation(elementList)){
            List<Operation> operationList = createOperationList(elementList);
            String expressionAfterOperation = executeOperationList(operationList);
            elementList = createElementList(expressionAfterOperation);
        }

        /*
        every time we execute an operation we generate a new expression string
        that must be re-evaluated submitted to the entire process until it
        doesn't have pending operations anymore
         */

        System.out.println();

        System.out.println("Program end   -----------------------");
    }

    private static List<Element> createElementList(String expression){
        List<Element> expressionElements = new ArrayList<>();

        String[] elementsAux = expression.split(" ");

        for(int c=0;c<elementsAux.length;c++){
            if(elementsAux[c].matches("[*/+-]")) expressionElements.add(new Element(elementsAux[c],ElementType.OPERATION));
            else expressionElements.add((new Element(elementsAux[c],ElementType.NUMBER)));
        }

        return  expressionElements;

    }

    private static boolean expressionHasPendingOperation(List<Element> elementList){
        for(Element element:elementList){
            if(element.getValue().matches("[*/+-]")) return true;
        }
        return false;
    }

    private static List<Operation> createOperationList(List<Element> elementList){

        List<Operation> operationList = new ArrayList<>();

        for(int e=0;e<elementList.size();e++){
            Element element = elementList.get(e);
            if(element.getType().equals(ElementType.OPERATION))
                operationList.add(new Operation(
                        Double.valueOf(elementList.get(e-1).getValue()),
                        String.valueOf(element.getValue()),
                        Double.valueOf(elementList.get(e+1).getValue())
                        ));
        }

        return operationList;

    }

    private static String executeOperationList(List<Operation> operationList){
        for(Operation o:operationList){
            if(o.getOperationType().equals("*")) o.setResult(o.getNumberOne() * o.getNumberTwo());
            else if (o.getOperationType().equals("/")) o.setResult(o.getNumberOne() / o.getNumberTwo());
            else if (o.getOperationType().equals("+")) o.setResult(o.getNumberOne() + o.getNumberTwo());
            else if (o.getOperationType().equals("-")) o.setResult(o.getNumberOne() - o.getNumberTwo());
        }
        return "";
    }

}

enum ElementType {
    NUMBER,VARIABLE,OPERATION
}

class Element {
    private String value;
    private ElementType type;

    public Element(String value, ElementType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ElementType getType() {
        return type;
    }

    public void setType(ElementType type) {
        this.type = type;
    }
}

class Operation{
    private Double numberOne;
    private String operationType;
    private Double numberTwo;
    private Double result;

    public Operation(Double numberOne, String operationType, Double numberTwo) {
        this.numberOne = numberOne;
        this.operationType = operationType;
        this.numberTwo = numberTwo;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }
}