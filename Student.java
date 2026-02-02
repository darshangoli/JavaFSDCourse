class Student{
    int rollno;
    String name;
    String location;
    String department;

    public Student(){

    }

    public Student(int roll, String n, String loc, String dept){
        this.rollno = roll;
        this.name = n;
        this.location = loc;
        this.department = dept;
    }

    void display(){
        System.out.println("roll no : "+ rollno);
        System.out.println("name : "+name);
        System.out.println("location : "+location);
        System.out.println("department : "+department);
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.display();

        Student std2 = new Student(3001,"Vishnu","bangalore","CSE");
        std2.display();

        Student std3 = new Student(3002,"lakshmi","surat","ECE");
        std3.display();
    }
}