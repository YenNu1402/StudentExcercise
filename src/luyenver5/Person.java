package luyenver5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public abstract class Person implements IPerson{
    private String id;
    private String fullName;
    private Date dateOfBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate;

    public Person() {
    }
    

    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public abstract void addPerson();
    public abstract void updatePerson(String id);
    public abstract void displayInfo();
    public boolean isBookOverdue(){
        long differentInMillies = bookReturnDate.getTime()-bookBorrowDate.getTime();
        long differentInDays = differentInMillies/(1000*60*60*24);
        return differentInDays>=30;
    }
}

