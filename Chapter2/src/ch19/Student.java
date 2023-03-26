package ch19;

import java.util.ArrayList;

public class Student {
	 int StudnetID;
	 String StudnetName;
	
	 ArrayList<Subject>subjectList;
	 
	
	 
	 public Student(int studnetID, String studnetName) {
		StudnetID = studnetID;
		StudnetName = studnetName;
		
		subjectList = new ArrayList<>();
	
	}
	 
	 public void addSubject(String name, int point) {
		 Subject subject = new Subject();
		 subject.setName(name);
		 subject.setScorePoint(point);
		 subjectList.add(subject);
		 
	 }
	 
	
	 

	 public void showStudentInfo() {
			int total = 0;
			for(Subject subject : subjectList) {
				total += subject.getScorePoint();
				System.out.println(StudnetName+"학생의 "+subject.getName() + "과목의 성적은"+subject.getScorePoint()+"입니다. ");
				System.out.println(StudnetName
						+"학생의총점은 "+total + "점입니다.");
			
			}
			
			
		} 

}
