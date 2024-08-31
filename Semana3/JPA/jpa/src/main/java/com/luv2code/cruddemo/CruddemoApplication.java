package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.UsersDAO;
import com.luv2code.cruddemo.entity.Users;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UsersDAO usersDAO) {

		return runner -> {
			createUser(usersDAO);

			createMultipleUser(usersDAO);

			readUser(usersDAO);

			queryForUser(usersDAO);

			queryForUserByLastName(usersDAO);
			
			queryForUserCellphone(usersDAO);

			updateUser(usersDAO);

			deleteUser(usersDAO);

			deleteAllUser(usersDAO);
		};
	}

	private void queryForUserCellphone(UsersDAO usersDAO) {
		// get a list of students
		List<Users> theUsers = usersDAO.findByCellphone("8181759375");

		// display list of students
		for (Users tempStudent : theUsers) {
			System.out.println(tempStudent);
		}
		
	}

	private void deleteAllUser(UsersDAO usersDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = usersDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}

	private void deleteUser(UsersDAO usersDAO) {

		int studentId = 2;
		System.out.println("Deleting student id: " + studentId);
		usersDAO.delete(studentId);
	}

	private void updateUser(UsersDAO usersDAO) {

		// retrieve student based on the id: primary key
		int studentId = 9;
		System.out.println("Getting student with id: " + studentId);
		Users myStudent = usersDAO.findById(studentId);

		// change first name to "John"
		System.out.println("Updating student ...");
		myStudent.setFirstName("John");

		// update the student
		usersDAO.update(myStudent);

		// display the updated student
		System.out.println("Updated student: " + myStudent);
	}

	private void queryForUserByLastName(UsersDAO usersDAO) {

		// get a list of students
		List<Users> theUsers = usersDAO.findByLastName("Doe");

		// display list of students
		for (Users tempStudent : theUsers) {
			System.out.println(tempStudent);
		}
	}

	private void queryForUser(UsersDAO usersDAO) {

		// get a list of students
		List<Users> theUsers = usersDAO.findAll();

		// display list of students
		for (Users newUser : theUsers) {
			System.out.println(newUser);
		}
	}

	private void readUser(UsersDAO usersDAO) {

		// create  a user object
		System.out.println("Creating new user object ...");
		Users newUser = new Users("Karen", "Valdez", "daffy@luv2code.com", "8181764890");

		// save the user
		System.out.println("Saving the student ...");
		usersDAO.save(newUser);

		// display id of the saved user
		int theId = newUser.getId();
		System.out.println("Saved student. Generated id: " + theId);

		// retrieve user based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Users newUser1 = usersDAO.findById(theId);

		// display user
		System.out.println("Found the user: " + newUser1);
	}

	private void createMultipleUser(UsersDAO usersDAO) {

		// create multiple users
		System.out.println("Creating 3 student objects ...");
		Users newUser1 = new Users("Pablo", "Muñoz", "correo@luv2code.com", "8181744890");
		Users newUser2 = new Users("Luis", "Escobedo", "email@luv2code.com", "8483764890");
		Users newUser3 = new Users("Ana", "Peña", "contra@luv2code.com", "8281764890");

		// save the users objects
		System.out.println("Saving the users ...");
		usersDAO.save(newUser1);
		usersDAO.save(newUser2);
		usersDAO.save(newUser3);
	}

	private void createUser(UsersDAO usersDAO) {

		// create the user object
		System.out.println("Creating new student object ...");
		Users newUser = new Users("Juan", "Perez", "pedro@luv2code.com", "123456789");

		// save the user object
		System.out.println("Saving the user ...");
		usersDAO.save(newUser);

		// display id of the saved user
		System.out.println("Saved user. Generated id: " + newUser.getId());
	}
}







