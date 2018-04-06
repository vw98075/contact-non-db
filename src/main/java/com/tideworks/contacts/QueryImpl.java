package com.tideworks.contacts;

import javax.swing.text.html.Option;
import java.util.Optional;

public class QueryImpl implements Query {

    private Optional<String> firstName;
    private Optional<String> lastName;
    private Optional<String> phone;
    private Optional<String> email;
    private Optional<String> address;

    public QueryImpl(String firstName, String lastName, String phone, String email, String address) {
        this.firstName = (firstName == null) ? Optional.empty() : Optional.of(firstName);
        this.lastName = (lastName == null) ? Optional.empty() : Optional.of(lastName);
        this.phone = (phone == null) ? Optional.empty() : Optional.of(phone);
        this.email = (email == null) ? Optional.empty() : Optional.of(email);
        this.address = (address == null) ? Optional.empty() : Optional.of(address);
    }

    public Optional<String> getFirstName() {
        return firstName;
    }

    public Optional<String> getLastName() {
        return lastName;
    }

    public Optional<String> getPhone() {
        return phone;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getAddress() {
        return address;
    }
}
