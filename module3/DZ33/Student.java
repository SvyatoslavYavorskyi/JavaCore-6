package module3.DZ33;

/**
 * Created by Свят on 19.02.2017.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private int coursesTaken;
    private int age;
   int[] Course = new int[]{1, 2, 3, 4, 5};

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(int coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, int coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }
}
