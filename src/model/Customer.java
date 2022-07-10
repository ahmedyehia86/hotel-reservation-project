package model;

import java.util.regex.Pattern;

public class Customer {
    public String firstName;
    public String lastName;
    public String email;
    public final String emailRegex = "^(.+)@(.+).(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email) {
        if (!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("error invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer Details \n" + "First Name: " + firstName + "\nLast Name: " + lastName + "\nemail: " + email;
    }
}

