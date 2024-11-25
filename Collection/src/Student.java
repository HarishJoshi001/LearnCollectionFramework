import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    //student print garaaudaa toString() nai execute hune ho
    //yeta chaai hamile toString laai override gareko ho to print the output in the desired form
    @Override
    public String toString(){
        return "Student{" + "name=" + name + ", rollNo=" + rollNo + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
    }
}
