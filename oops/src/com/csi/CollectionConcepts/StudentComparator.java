package com.csi.CollectionConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	int studId;
	String studName;
	double Percentage;
	String studaddress;
	
	
	public Student(int studId, String studName, double percentage, String studaddress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.Percentage = percentage;
		this.studaddress = studaddress;
	}


	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", Percentage=" + Percentage
				+ ", studaddress=" + studaddress + "]";
	}
	
}
class StudIdComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.studId==o2.studId)
		{
			return 0;
		}
		else if(o1.studId > o2.studId)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}/*
class StudNameComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studName.compareTo(o2.studName);
	}
	
} */

/*
class percentageComparator implements Comparator<Student>
{

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		if(arg0.Percentage == arg1.Percentage)
		{
		    return 0;
		}
		else if(arg0.Percentage > arg1.Percentage)
		{
			return 1;
		}else
		{
			return -1;
		}
	}
	
}*/
public class StudentComparator {
	public static void main(String[] args) {
		
		ArrayList<Student> StudList=new ArrayList<>();
		StudList.add(new Student(111, "Rohini", 75.23, "Pune"));
		StudList.add(new Student(125, "Neha", 78, "Nigdi"));

		StudList.add(new Student(101, "Divya", 68.45, "Solapur"));

		StudList.add(new Student(164, "Priya", 82.12, "Nilanga"));
		
		StudList.forEach(System.out::println);

		System.out.println("\n After Id Sorting : ");
		Collections.sort(StudList, new StudIdComparator());
		StudList.forEach(sl->System.out.println(sl));
		
	/*	
		System.out.println("\n After Student Name Sorting : ");
		Collections.sort(StudList, new StudNameComparator());
		StudList.forEach(sl->System.out.println(sl));
		
		
		*/
	}

}
