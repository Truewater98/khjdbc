package com.kh.jdbc.day01.student.controller;

import java.util.List;

import com.kh.jdbc.day01.student.model.dao.StudentDAO;
import com.kh.jdbc.day01.student.model.vo.Student;

public class StudentController {

	/**
	 * 학생 전체 목록 조회
	 * @return List<Student>
	 */	
	public List<Student> printAll() {
		StudentDAO sDao = new StudentDAO();
		List<Student> students = sDao.selectAll();
		return students;
	}
	/**
	 * 학생 이름으로 조회
	 * @param studentName
	 * @return List<Student>
	 */
	public List<Student> printAllByName(String studentName) {
		List<Student> sList = null;
		StudentDAO sDao = new StudentDAO();
		sList = sDao.selectAllByName(studentName);
		return sList;
	}
	/**
	 * 학생 아이디로 조회
	 * @param student
	 * @return
	 */
	public Student printOneById(String Id) {
		StudentDAO sDao = new StudentDAO();
		Student student = sDao.selectOneById(Id); 
		return student;
	}
	/**
	 * 
	 * @param student
	 * @return
	 */
	public int registerStudent(Student student) {
		StudentDAO sDao = new StudentDAO();
		int result = sDao.insertMember(student);
		return result;
	}
	/**
	 * 
	 * @param studentId
	 * @return
	 */
	public int removeStudent(String studentId) {
		StudentDAO sDao = new StudentDAO();
		int result = sDao.deleteMember(studentId);
		return result;
	}
	
	public int modifyStudent(Student student) {
		StudentDAO sDao = new StudentDAO();
		int result = sDao.updateStudent(student);
		return result;
	}
}
