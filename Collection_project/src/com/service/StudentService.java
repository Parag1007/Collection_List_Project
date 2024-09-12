
package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Dao.StudentDao;
import com.entity.Student;

public class StudentService {

	StudentDao Dao = null;

	public List<Student> GetAllSudentservice() {

		Dao = new StudentDao();
		List<Student> db1 = Dao.GetAllStudent();
		return db1;

	}

	public List<Student> GetStudentstartnameWith(String ch) {

		List<Student> db2 = new ArrayList<Student>();
		Dao = new StudentDao();

		List<Student> db = Dao.GetAllStudent();
		for (Student s : db) {
			if (s.getName().startsWith(ch))

				db2.add(s);

		}

		return db2;
	}

	public List<Student> StudentbyId(int id) {
		List<Student> db3 = new ArrayList<Student>();
		Dao = new StudentDao();

		List<Student> db = Dao.GetAllStudent();
		for (Student student : db) {
			if (student.getId() == id) {

				db3.add(student);
			}
		}
		return db3;

	}

	public List<Student> GetStudentmarksbelow(int m) {
		List<Student> db4 = new ArrayList<Student>();
		Dao = new StudentDao();
		List<Student> db = Dao.GetAllStudent();

		for (Student a : db) {
			if (a.getMarks() < m) {

				db4.add(a);

			}

		}

		return db4;

	}

	public List<Student> GetStudentmarksAbove(int m) {

		List<Student> db5 = new ArrayList<Student>();
		Dao = new StudentDao();

		List<Student> db = Dao.GetAllStudent();
		for (Student above : db) {
			if (above.getMarks() > m) {
				db5.add(above);
			}

		}

		return db5;
	}

	public List<Student> GetStudentByCityService(String city) {
		List<Student> db6 = new ArrayList<Student>();
		Dao = new StudentDao();
		List<Student> db = Dao.GetAllStudent();
		for (Student c : db) {
			if (c.getCity() == city) {

				db6.add(c);

			}

		}

		return db6;
	}

}