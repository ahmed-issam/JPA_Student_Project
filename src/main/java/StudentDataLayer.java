
import javax.persistence.*;

@Entity
@Table(name = "student")

public class StudentDataLayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String full_name;
    private int grade;

    public StudentDataLayer() {
    }

    public StudentDataLayer( String full_name, int grade) {

        this.full_name = full_name;
        this.grade = grade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
