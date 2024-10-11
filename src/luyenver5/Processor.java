package luyenver5;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        boolean runn = true;
        while(runn){
            System.out.println("1. Add new student."
            + "\n2. Add new teacher."
            + "\n3. Update person by id." 
            + "\n4. Delete person by id."
            + "\n5. Display all students and teachers."
            + "\n6. Find the student with the highest GPA."
            + "\n7. Find teachers by department."
            + "\n8. Notify whether the book's return due date has arrived or not."
            + "\n9. Exit.");
            System.out.println("Choose your opinion: ");
        int op = sc.nextInt();
        sc.nextLine();
        switch(op){
                case 1:
                    System.out.println("*****Add Student*****");
                    Student newStudent = new Student();
                    newStudent.addPerson();
                    personList.addPerson(newStudent);
                    break;
                case 2:
                    System.out.println("*****Add Teacher*****");
                    Teacher newTeacher = new Teacher();
                    newTeacher.addPerson();
                    personList.addPerson(newTeacher);
                    break;
                case 3:
                    System.out.println("*****Update person by ID*****");
                    System.out.println("Enter ID Want To Update: ");
                    String idUp = sc.nextLine();
                    Person personToUpdate = personList.findPersonById(idUp);
                    if (personToUpdate == null) {
                        System.out.println("Person with ID " + idUp + " not found.");
                    } else {
                        personList.updatePerson(idUp);
                    }
                    break;
                case 4:
                    System.out.println("*****Delete person by ID*****");
                    System.out.println("Enter ID Want To Delete: ");
                    String idDel = sc.nextLine();
                    Person personToDelete = personList.findPersonById(idDel);

                    if (personToDelete == null) {
                        System.out.println("Person with ID " + idDel + " not found.");
                    } else {
                        personList.deletePersonById(idDel);
                        System.out.println("Person with ID " + idDel + " has been deleted.");
                    }
                    break;
                case 5:
                    System.out.println("*****Display all Students and Teachers*****");
                    personList.displayEveryone();
                    break;
                case 6:
                    System.out.println("*****Find the student with the highest GPA*****");
                    Student topStu = personList.findTopStudent();
                    if (topStu != null) {
                        topStu.displayInfo();
                    } else {
                        System.out.println("No student found.");
                    }
                    break;
                case 7:
                    System.out.println("*****Find teachers by department*****");
                    System.out.println("Enter Department Want To Find: ");
                    String departmentF = sc.nextLine();
                    Teacher findT = personList.findTeacherByDepartment(departmentF);
                    if (findT != null) {
                        findT.displayInfo();
                    } else {
                        System.out.println("No teacher found in department " + departmentF);
                    }
                    break;
                case 8:
                    System.out.println("*****Notify whether the book's return due date has arrived or not*****");
                    System.out.println("Enter ID Want To Check Book: ");
                    String checkID = sc.nextLine();

                    if (checkID.isEmpty()) {
                        System.out.println("ID cannot be empty. Please enter a valid ID.");
                    } else {
                        personList.checkBookBorrowing(checkID);
}
                    break;

                case 9:
                    runn = false;
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }
        sc.close();
    }
}

