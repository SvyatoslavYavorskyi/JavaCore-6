package module3.DZ33;

/**
 * Created by Свят on 19.02.2017.
 */
public class CollegeStudent extends Student {
   private String collegeName;
    private int rating;
    private long id;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public CollegeStudent(String firstName, int coursesTaken, String lastName, int group, long id) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, int coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}
