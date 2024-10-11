package luyenver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person{
    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    
    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter ID Teacher: ");
            String id = sc.nextLine();
            setId(id);
            System.out.println("Enter Full Name Teacher: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.println("Enter Date Of Birth Teacher(dd/MM/yyyy):" );
            String dateOfBirth = sc.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirth));
            System.out.println("Enter Date Borrow Book(dd/MM/yyyy):");
            String bookBorrowDate = sc.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDate));
            System.out.println("Enter Date Return Book(dd/MM/yyyy):");
            String bookReturnDate = sc.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDate));
            System.out.println("Enter Department: ");
            sc.nextLine();
            String department = sc.nextLine();
            setDepartment(department);
            System.out.println("Enter Teaching Subject: ");
            String teachingSubject = sc.nextLine();
            setTeachingSubject(teachingSubject);
        } catch (Exception e){
            System.out.println("Invalid input.");
        }
    }

    @Override
    public void updatePerson(String id) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter ID Teacher: " + id);
            System.out.println("Enter New Full Name Teacher: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.println("Enter New Date Of Birth Teacher(dd/MM/yyyy):" );
            String dateOfBirth = sc.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirth));
            System.out.println("Enter New Date Borrow Book(dd/MM/yyyy):");
            String bookBorrowDate = sc.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDate));
            System.out.println("Enter New Date Return Book(dd/MM/yyyy):");
            String bookReturnDate = sc.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDate));
            System.out.println("Enter New Department: ");
            sc.nextLine();
            String department = sc.nextLine();
            setDepartment(department);
            System.out.println("Enter New Teaching Subject: ");
            String teachingSubject = sc.nextLine();
            setTeachingSubject(teachingSubject);
        } catch (Exception e){
            System.out.println("Invalid input.");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID Teacher: " + getId()
        + "\nFull Name Teacher: " + getFullName()
        + "\nDate Of Birth Teacher: " + sdf.format(getDateOfBirth())
        + "\nDate Borrow Book Teacher: " + sdf.format(getBookBorrowDate())
        + "\nDate Return Book Teacher: " + sdf.format(getBookReturnDate())
        + "\nDepartment: " + getDepartment()
        + "\nTeaching Subject: " + getTeachingSubject());
    }
    
}

