import model.Branch;
import model.Student;
import service.BranchService;
import service.GroupService;
import service.StudentService;
import service.TeacherService;

import java.util.Scanner;

public class Main {


    static Scanner scannerStr=new Scanner(System.in);
    static Scanner scannerInt=new Scanner(System.in);
    static  GroupService groupService=new GroupService();
    static BranchService branchService=new BranchService();
    static StudentService studentService=new StudentService();
    static TeacherService teacherService=new TeacherService();
    public static void main(String[] args) {
        System.out.println("Everest o'quv markaziga xush kelibsiz");
        int stepCode=100;
            while (stepCode!=0){
                System.out.println("1.Add Branch,  2.Branch List");

                stepCode=scannerInt.nextInt();

                switch (stepCode){
                    case 1->{
                        System.out.println("Enter Branch Name: ");
                        String branchname=scannerStr.nextLine();
                        Branch branch=new Branch(branchname);
                        System.out.println(branchService.AddBranch(branchname));

                        System.out.println("1.Add Group, 2.Group List");
                        stepCode=scannerInt.nextInt();
                        switch (stepCode){
                            case 1->{
                                System.out.println("Enter Group Name: ");
                                String groupname=scannerStr.nextLine();
                                System.out.println("Enter level: ");
                                String levelname=scannerStr.nextLine();
                                System.out.println(groupService.addGroup(groupname, levelname));
                                System.out.println("1.Add Student,  2.Student List,  3.Add Teacher, 4. TeacherList,  0.Exit");
                                stepCode=scannerInt.nextInt();
                                switch (stepCode){
                                    case 1->{

                                        System.out.println("Enter Student name: ");
                                        String studentName=scannerStr.nextLine();
                                        System.out.println("Enter phoneNumber: ");
                                        String phoneNumber=scannerStr.nextLine();
                                        System.out.println(studentService.addStudent(studentName, phoneNumber));


                                    }
                                    case 2->{

                                    }


                                    case 3->{
                                        System.out.println("Enter teacher Name: ");
                                            String  teacherName=scannerStr.nextLine();
                                        System.out.println("Enter Experience: ");
                                        int experience=scannerInt.nextInt();
                                        System.out.println("Enter salary: ");
                                        int salary=scannerInt.nextInt();
                                        System.out.println(teacherService.addTeacher(teacherName, experience, salary));
                                    }

                                    case 4->{

                                    }


                                }



                            }
                        }
                    }
                    case 2->{

                    }

                }
            }


            }
        }
