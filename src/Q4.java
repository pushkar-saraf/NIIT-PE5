import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Pushkar Saraf", 21);
        Student s2 = new Student(2, "Harry Potter", 21);
        Student s3 = new Student(3, "Hermoine Granger", 22);
        Student s4 = new Student(4, "Ron Weasley", 20);
        Student s5 = new Student(5, "Pushkar Saraf", 19);
        List<Student> students = new ArrayList<Student>() {
        };
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println(students);
        students.sort(new CustomComparator());
        System.out.println(students);
    }
}

class CustomComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getAge()>s2.getAge()){
            return 1;
        } else if(s1.getAge()<s2.getAge()){
            return -1;
        } else{
            int comparison = s1.getName().compareTo(s2.getName());
            if(comparison > 0){
                return  1;
            } else if(comparison < 0) {
                return -1;
            } else{
                return Integer.compare(s1.getId(), s2.getId());
            }
        }
    }
}

class Student {
    private int id;
    private String name;
    private int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    int getId() {
        return id;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id+":"+name+":"+age;
    }
}
