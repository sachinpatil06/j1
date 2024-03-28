public class Student_Info extends Course{

String name="Sachin patil";

String department="BCA";

String program="BCA";

public String RegistertedCourse[]={" ", "C#", "Applied statistics", "Java"};

public void display(){

System.out.println("--Student Details----");

System.out.println("Name:"+name);

System.out.println("Department: "+department);

System.out.println("Program: "+program);

System.out.print( "Registered Courses:\n");

for(int i=1;i<=3;i++){

System.out.println(i+":"+RegistertedCourse[i]);

}

}


public static void main(String[] args){

Student_Info s = new Student_Info();

s.display();
s.DisplayMarks();

s.displaylessthanfourty();

}
}


