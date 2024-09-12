package com.client;

import java.util.ArrayList;
import java.util.List;

import com.Controller.StudentController;
import com.entity.Student;
import com.service.StudentService;

public class TestStudent {

	public static void main(String[] args) {

		StudentController sc = new StudentController();
	
		

		List db1 = sc.getAllStudentsController();
		System.out.println("\n*****************************************************************\n");
		System.err.println("\n\t   List Of All Students ");

		for (Object object : db1) {
			System.out.println(object);

		}
//
		List<Student> db2 = sc.GetStudentstartnameWith("a");
		System.out.println("\n*****************************************************************\n");
		System.out.println("\n\tStudent Start Name With: \n");
		for (Student name : db2) {
			System.out.println(name);
//
		}
		List<Student> db3 = sc.StudentbyId(3);
		System.out.println("\n*****************************************************************\n");
		System.err.println("\n\t   Get Student by ID: \n");
		System.out.println(db3);
		
		List<Student> db4 = sc.GetStudentmarksbelowController(75);
		System.out.println("\n*****************************************************************\n");
		System.err.println("\n\tStudents list whose less than 75\n");
		for (Student student : db4) {
//
			System.out.println("below: " + student);
//
		}
		List<Student> db5 = sc.GetStudentmarksaboveController(75);
		System.out.println("\n*****************************************************************\n");
		System.err.println("\n\tStudents list whose grater than 75\n");
		for (Student mm : db5) {
			System.out.println(mm);

		}
	}

}
