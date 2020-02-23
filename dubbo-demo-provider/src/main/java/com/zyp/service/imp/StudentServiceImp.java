package com.zyp.service.imp;

import com.zyp.bean.Student;
import com.zyp.service.StudentService;

public class StudentServiceImp implements StudentService{

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(20);
		student.setId(id);
		student.setName("张三" + id);
		return student;
	}
	
	@Override
	public Student addAge(Student stu, int n) {
		// TODO Auto-generated method stub
		stu.setAge(stu.getAge()+n);
		return stu;
	}

}
