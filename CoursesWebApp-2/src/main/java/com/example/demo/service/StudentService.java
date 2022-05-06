package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentInfo;
@Service
public class StudentService {
	
	
	public List<StudentInfo> getshowinfo(){
		ArrayList<StudentInfo> al = new ArrayList<StudentInfo>();
		al.add(new StudentInfo(1,"Anant","awb"));
		al.add(new StudentInfo(2,"Tushar","Pune"));
		al.add(new StudentInfo(3,"Ravindra","Bangluru"));
		al.add(new StudentInfo(4,"Error","Kerla"));
		al.add(new StudentInfo(5,"Narendra","Bajajnagar"));
		al.add(new StudentInfo(6,"Avinash","Mumbai"));
		return al;
		
	}

}
