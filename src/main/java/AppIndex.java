import java.util.List;

public class AppIndex {

    public String findCustomerName(List<Customer> customerList, int id){
        String customerName = "";

        //we first are going to test if the index is outside the boundaries
        //if so, we return an empty string
        if(id > customerList.size()) return "";
        //then we test if id happens to be the first or last position
        else if(id == 1) return customerList.get(0).getName();
        else if(customerList.size() == id) return customerList.get(id - 1).getName();
        else{
            boolean hasFound = false;

            int controlNumber = customerList.size() / 2;

            int indexToSearch = controlNumber;

            while (!hasFound){

                if(customerList.get(indexToSearch).getId() == id) {
                    hasFound = true;
                    customerName = customerList.get(indexToSearch).getName();
                }

                if(controlNumber % 2 == 0) controlNumber = controlNumber / 2;
                else controlNumber = (controlNumber / 2) + 1;

                if(customerList.get(indexToSearch).getId() < id){
                    indexToSearch = indexToSearch + (controlNumber);
                }else{
                    indexToSearch = indexToSearch - (controlNumber);
                }

            }
        }

        return customerName;
    }

}

class Customer {
    private int id;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}