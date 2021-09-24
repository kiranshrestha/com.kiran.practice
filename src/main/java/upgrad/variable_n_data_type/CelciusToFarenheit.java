package upgrad.variable_n_data_type;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CelciusToFarenheit {

public static void main(String[]args) {
    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("Sujit", 1));
    studentList.add(new Student("Siddharth", 2));
    studentList.add(new Student("Karanpreet", 3));
    studentList.add(new Student("Hari", 5));

    ListIterator<Student> it = studentList.listIterator(studentList.size());
    System.out.println(it.previous().getDetails());
}


}


class Student{
    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
    public String getDetails(){
        return String.format("Student %s with roll no : %d", name, roll_no);
    }
}
