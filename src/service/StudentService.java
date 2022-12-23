package service;

import model.Student;

public class StudentService {


    Student [] studentList=new Student[200];
    private int index=0;


   public boolean addStudent(String fullname, String phoneNumber){
        for (Student student: studentList) {
            if(student!=null){
                if(student.getFullName().equals(fullname) && student.getPhoneNumber().equals(phoneNumber)){
                    return false;
                }
            }
        }
        this.studentList[index++]=new Student(fullname, phoneNumber);
        return true;
    }



    public Student checkStudent(String phoneNumber){
        for (Student student: studentList) {
            if(student!=null){
                if(student.getPhoneNumber().equals(phoneNumber)){
                    return student;
                }
            }
        }
        return null;
    }


    public Student StudentList(String  name, String phoneNumber){
        for (Student student1: studentList) {
            if(student1!=null){
                if(student1.getFullName().equals(name) && student1.getPhoneNumber().equals(phoneNumber)){
                    return student1;
                }
            }

        }
        return null;
    }



}
