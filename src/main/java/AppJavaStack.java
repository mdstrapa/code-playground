import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class AppJavaStack {

    Stack<Operation> operationStack = new Stack<>();

    public void clearOperationStack(){
        operationStack.clear();
    }

    public void addOperation(Operation op){
        operationStack.add(op);
    }

    public int getOperationStackSize(){
        return operationStack.size();
    }

    public void executeLastOperation(){
        operationStack.pop();
    }

    public void showOperationExpression(){
        System.out.println(operationStack.get(operationStack.size() - 1).getExpression());
    }


    void buildStack(String expression){

        for(char c:expression.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                addOperation(new Operation(String.valueOf(c)));
            }else{

                String updatedOperation = operationStack.get(operationStack.size() - 1).getExpression();

                updatedOperation = updatedOperation + c;

                operationStack.get(operationStack.size() - 1).setExpression(updatedOperation);

                showOperationExpression();

                executeLastOperation();

            }
        }
    }
}


class Operation{
    private String expression;

    public Operation(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
