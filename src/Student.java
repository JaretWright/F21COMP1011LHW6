import java.util.TreeMap;

public class Student {
    private int stNum;
    private String firstName, lastName;

    //Map data structures "map" a key to a value
    //In some languages, this class is called "Dictionary"
    //TreeMap - sorts based on the key value
    //HashMap - is sorted based on the hash value and not easy to predict the order
    private TreeMap<String, Integer> courses = new TreeMap<>();

    public Student(int stNum, String firstName, String lastName) {
        this.stNum = stNum;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addCourse(String courseCode, int grade)
    {
        courses.put(courseCode, grade);
    }

    public int getStNum() {
        return stNum;
    }

    public void setStNum(int stNum) {
        this.stNum = stNum;
    }

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

    public TreeMap<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(TreeMap<String, Integer> courses) {
        this.courses = courses;
    }
}
