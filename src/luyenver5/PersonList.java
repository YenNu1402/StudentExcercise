package luyenver5;

import java.util.ArrayList;

public class PersonList {
    public ArrayList<Person> personList;
    public PersonList(){
        personList = new ArrayList<>();
    }
    public PersonList(ArrayList<Person> personList){
        this.personList = personList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public void addPerson(Person person){
        personList.add(person);
    }
    public void updatePerson(String id){
        for(Person person : personList){
            if(person instanceof Student && person.getId().equals(id)){
                Student personUpdate = (Student) person;
                personUpdate.updatePerson(id);
                return;
            } else if(person instanceof Teacher && person.getId().equals(id)){
                Teacher personUpdate = (Teacher) person;
                personUpdate.updatePerson(id);
                return;
            }
        }
    }
    public void deletePersonById(String id){
        for(Person person : personList){
            if(person.getId().equals(id)){
                personList.remove(person);
                System.out.println("Delete success.");
                return;
            }
            System.out.println("No Information.");
        }
    }
    public Person findPersonById(String id){
        for(Person person : personList){
            if(person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }
    public void displayEveryone(){
        for(Person person : personList){
            person.displayInfo();
        }
    }
    public Student findTopStudent(){
        Student topStu = null;
        for(Person person : personList){
            if(person instanceof Student){
                Student student = (Student) person;
                if(topStu == null || student.getGpa()>topStu.getGpa()){
                    topStu = student;
                }
            }
        }
        return topStu;
    }
    public Teacher findTeacherByDepartment(String department){
        for(Person person : personList){
            if(person instanceof Teacher){
                Teacher teacher = (Teacher) person;
                if(teacher.getDepartment().equals(department)){
                    return teacher;
                }
            }
        }
        return null;
    }
    public void checkBookBorrowing(String id){
        boolean found = false;

    for (Person person : personList) {
        if (person.getId().equals(id)) {
            found = true;  // Đánh dấu đã tìm thấy
            if (person.isBookOverdue()) {
                System.out.println("Overdue");
            } else {
                System.out.println("Not Overdue");
            }
            person.displayInfo();
            break;
        }
    }

    if (!found) {
        System.out.println("Can't find Information for ID: " + id);
    }
    }
}