package com.Controller;

import java.util.List;
import java.util.Scanner;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {

	StudentService service = null;

	public List<Student> getAllStudentsController() {

		service = new StudentService();

		List<Student> db = service.GetAllSudentservice();

		return db;

	}

	public List<Student> GetStudentstartnameWith(String h) {
		System.out.println("Enter the word for search student: ");
		service = new StudentService();
		List<Student> db = service.GetStudentstartnameWith(h);
		return db;

	}

	public List<Student> StudentbyId(int i) {

		service = new StudentService();
		List<Student> db = service.StudentbyId(i);
		return db;

	}

	public List<Student> GetStudentmarksbelowController(int m) {
		service = new StudentService();
		List<Student> db3 = service.GetStudentmarksbelow(m);
		return db3;
	}

	public List<Student> GetStudentmarksaboveController(int m) {
		service = new StudentService();
		List<Student> db3 = service.GetStudentmarksAbove(m);
		return db3;
	}

	public List<Student> GetStudentByCityController(String city) {
		service = new StudentService();
		List<Student> db4 = service.GetStudentByCityService(city);
		return db4;

	}

}
