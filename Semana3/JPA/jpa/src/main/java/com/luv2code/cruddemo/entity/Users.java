package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Users {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;
    
    @Column(name="cellphone")
    private String cellphone;

    // define constructors
    public Users() {

    }

    public Users(String firstName, String lastName, String email, String cellphone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cellphone = cellphone;
    }

    // define getters/setters

    public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // define toString() method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' + ", cellphone='" + cellphone +
                '}';
    }
}
