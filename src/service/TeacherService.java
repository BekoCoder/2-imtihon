package service;

import model.Teacher;

import java.util.UUID;

public class TeacherService {
    Teacher [] teacherList=new Teacher[100];
    private int index=0;

    private Teacher checkTeacher(UUID id){
        for (Teacher teacher: teacherList) {
            if(teacher!=null){
                if(teacher.getTeacherId().equals(id)){
                    return teacher;
                }
            }
        }
        return null;
    }


    public boolean addTeacher(String name,int experience, int salary){
        for ( Teacher teacher: teacherList) {
            if(teacher!=null){
                if(teacher.getName().equals(name) && teacher.getExperience()==experience){
                    return false;
                }
            }
        }
        this.teacherList[index++]=new Teacher(name, experience,salary);
        return true;
    }



}
