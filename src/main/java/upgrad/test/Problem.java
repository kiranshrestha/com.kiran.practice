package upgrad.test;

class Source {
    public static void main(String[] args) {

        // Create an object named 's1' and complete the code to print the desired output

        Student s1 = new Student(1056, "karan", 8.8f);

        s1.displayProfile();
        System.out.println(s1.findPercentage());
        //System.out.printf("%.1f",s1.findPercentage());
    }
}

class Student {
    public int rollno;
    public String name;
    public double cgpa;

// Declare constructor of 'Student' class here


    public Student(int rollno, String name, double cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
        //System.out.printf("%d %s %.1f\n",rollno, name, cgpa);
    }
    public double findPercentage() {
        return cgpa * 10;
    }
}
