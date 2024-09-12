package com.Dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDao {

	public List<Student> GetAllStudent() {

		List<Student> db = new ArrayList<Student>();

		db.add(new Student(2, "parag", "nsk",55));
		db.add(new Student(6, "abhi", "pune",86));
		db.add(new Student(4, "Om", "mumbai",66));
		db.add(new Student(3, "akash", "chennai",88));
		db.add(new Student(8, "chetan", "nsk",87));

		return db;   

	}
}
