package service;

import model.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {
    static Map<String,Customer> customerMap=new HashMap<String,Customer>();
    public static void addCustomer(String email,String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName, email);
        customerMap.put(email,customer);
    }
    public static Customer getCustomer(String customerEmail){
        return customerMap.get(customerEmail);
    }

    public static Collection<Customer> getAllCustomers(){
        return (Collection<Customer>) customerMap;

    }
}
