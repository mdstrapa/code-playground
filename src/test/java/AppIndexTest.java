import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppIndexTest {

    AppIndex appIndex = new AppIndex();

    static List<Customer> customerListList = new ArrayList<>();

    @BeforeAll
    static void setUpCustomerList(){
        customerListList.add(new Customer(1,"Jose"));
        customerListList.add(new Customer(2,"Paulo"));
        customerListList.add(new Customer(3,"Patricia"));
        customerListList.add(new Customer(4,"Amanda"));
        customerListList.add(new Customer(5,"Ricardo"));
        customerListList.add(new Customer(6,"Pedro"));
        customerListList.add(new Customer(7,"Robson"));
        customerListList.add(new Customer(8,"Daniela"));
        customerListList.add(new Customer(9,"Daniel"));
        customerListList.add(new Customer(10,"Alfredo"));
        customerListList.add(new Customer(11,"Afonso"));
        customerListList.add(new Customer(12,"Cristiano"));
        customerListList.add(new Customer(13,"Rafaela"));
        customerListList.add(new Customer(14,"Mauricio"));
        customerListList.add(new Customer(15,"Heitor"));
        customerListList.add(new Customer(16,"Enzo"));
        customerListList.add(new Customer(17,"Tiffany"));
        customerListList.add(new Customer(18,"Jennifer"));
        customerListList.add(new Customer(19,"Maria"));
        customerListList.add(new Customer(20,"Claudia"));
        customerListList.add(new Customer(21,"Andrea"));
        customerListList.add(new Customer(22,"Andre"));
        customerListList.add(new Customer(23,"Giovanna"));
        customerListList.add(new Customer(24,"Nicolas"));
        customerListList.add(new Customer(25,"Zuleide"));
        customerListList.add(new Customer(26,"Tamara"));
        customerListList.add(new Customer(27,"Eduarda"));
        customerListList.add(new Customer(28,"Bruna"));
        customerListList.add(new Customer(29,"Antonio"));
        customerListList.add(new Customer(30,"Nicolau"));
        customerListList.add(new Customer(31,"Roberval"));
        customerListList.add(new Customer(32,"Ursula"));
        customerListList.add(new Customer(33,"Olivia"));
        customerListList.add(new Customer(34,"Rayane"));
        customerListList.add(new Customer(35,"Graziela"));
        customerListList.add(new Customer(36,"Charles"));
        customerListList.add(new Customer(37,"Josefina"));
        customerListList.add(new Customer(38,"Leticia"));
        customerListList.add(new Customer(39,"Lauren"));
        customerListList.add(new Customer(40,"Julia"));
    }

    @Test
    void shouldFindCorrectCustomerName1() {
        int idToFind = 28;
        String expectedName = "Bruna";
        String actualName = appIndex.findCustomerName(customerListList,idToFind);
        assertEquals(expectedName,actualName);
    }

    @Test
    void shouldFindCorrectCustomerName2() {
        int idToFind = 27;
        String expectedName = "Eduarda";
        String actualName = appIndex.findCustomerName(customerListList,idToFind);
        assertEquals(expectedName,actualName);
    }

    @Test
    void shouldFindCorrectCustomerName3() {
        int idToFind = 29;
        String expectedName = "Antonio";
        String actualName = appIndex.findCustomerName(customerListList,idToFind);
        assertEquals(expectedName,actualName);
    }

    @Test
    void shouldFindCorrectCustomerName4() {
        int idToFind = 1;
        String expectedName = "Jose";
        String actualName = appIndex.findCustomerName(customerListList,idToFind);
        assertEquals(expectedName,actualName);
    }

    @Test
    void shouldFindCorrectCustomerName5() {
        int idToFind = 40;
        String expectedName = "Julia";
        String actualName = appIndex.findCustomerName(customerListList,idToFind);
        assertEquals(expectedName,actualName);
    }

    @Test
    void shouldFindCorrectCustomerName6() {
        int idToFind = 2;
        String expectedName = "Paulo";
        String actualName = appIndex.findCustomerName(customerListList,idToFind);
        assertEquals(expectedName,actualName);
    }

    @Test
    void shouldFindCorrectCustomerName7() {
        int idToFind = 39;
        String expectedName = "Lauren";
        String actualName = appIndex.findCustomerName(customerListList,idToFind);
        assertEquals(expectedName,actualName);
    }

    @Test
    void shouldFindCorrectCustomerName8() {
        int idToFind = 51;
        String expectedName = "";
        String actualName = appIndex.findCustomerName(customerListList,idToFind);
        assertEquals(expectedName,actualName);
    }

}