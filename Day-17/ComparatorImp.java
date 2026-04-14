import java.util.*;
public class ComparatorImp{
public static void main(String[]args){
    List<Student> s= new ArrayList<>();
    s.add(new Student(15,15,20.5F));
     s.add(new Student(16,15,21.5F));
    s.add(new Student(5,25,70.5F));
    s.add(new Student(2,5,100.0F));
     s.add(new Student(3,5,90.5F));
  //  Collections.sort(s,new AgeComparator());
     Collections.sort(s,new RollComparator());
      Collections.sort(s,new MarkComparator());
    for (Student stu : s ) {
       System.out.println(stu);
    }
    for (Student stu : s ) {
       System.out.println(stu);
    }
    }

}

class AgeComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return Integer.compare(s2.age,s1.age);
    }
}
class RollComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.rollno,s2.rollno);
    }
}
class MarkComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return Double.compare(s2.marks,s1.marks);
    }
}
class Student{
    int age;
    int rollno;
    double marks;
    Student(int rollno, int age, double marks){
        this.rollno = rollno;
        this.age = age;
        this.marks =marks;
    }
    public String toString(){
        return this.rollno+" "+this.age+" "+" "+this.marks;
    }


}