package luyenver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Student extends Person{
    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }
    
    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter ID Student: ");
            String id = sc.nextLine();
            setId(id);
            System.out.println("Enter Full Name Student: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.println("Enter Date Of Birth Student(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirth));
            System.out.println("Enter Date Borrow Book(dd/MM/yyyy): ");
            String bookBorrowDate = sc.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDate));
            System.out.println("Enter Date Return Book(dd/MM/yyyy): ");
            String bookReturnDate = sc.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDate));
            System.out.println("Enter GPA: ");
            float gpa = sc.nextFloat();
            setGpa(gpa);
            System.out.println("Enter Major: ");
            sc.nextLine();
            String major = sc.nextLine();
            setMajor(major);
        }catch (Exception e){
            System.out.println("Invalid input");
        }
    }

    @Override
    public void updatePerson(String id) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System .in);
        try{
            System.out.println("Enter ID Student: " + id);
            System.out.println("Enter New Full Name Student: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.println("Enter New Date Of Birth Student(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirth));
            System.out.println("Enter New Date Borrow Book(dd/MM/yyyy): ");
            String bookBorrowDate = sc.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDate));
            System.out.println("Enter New Date Return Book(dd/MM/yyyy): ");
            String bookReturnDate = sc.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDate));
            System.out.println("Enter New GPA: ");
            float gpa = sc.nextFloat();
            setGpa(gpa);
            System.out.println("Enter New Major: ");
            sc.nextLine();
            String major = sc.nextLine();
            setMajor(major);
        }catch (Exception e){
            System.out.println("Invalid input");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID Student: " + getId()
                + "\nFull Name Student: " + getFullName()
                + "\nDate Of Birth Student: " + sdf.format(getDateOfBirth())
                + "\nDate Borrow Book: " + sdf.format(getBookBorrowDate())
                + "\nDate Return Book: " + sdf.format(getBookReturnDate())
                + "\nGPA: " + getGpa()
                + "\nMajor: " + getMajor());  
    }

}

