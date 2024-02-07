import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="Department")
public class DeptDataLayer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO , generator = "idGenerator")
    @SequenceGenerator(name = "idGenerator" , initialValue = 1 , allocationSize = 1 , sequenceName = "idSeq")
    private int Id;

    {
        Id = 0;
    }

    private int deptId;
    private String deptName;

    public DeptDataLayer(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return Id;
    }

    public void setDeptId(int deptId) {
        this.Id = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public DeptDataLayer() {
    }






}

