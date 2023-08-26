import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.Session;

import entity.StudentEntity;
import entity.embeded.StudentName;
import util.SessionFactoryConfiguration;
import repository.StudentRepository;

public class App {
    public static void main(String[] args) throws Exception {
        StudentRepository repo = new StudentRepository();
        StudentEntity entity = new StudentEntity();
        entity.setNic("891676789V");
        StudentName studentName = new StudentName("stu First 1","stu Last 1");
        entity.setName(studentName);
        List <String> mobiles = new ArrayList<>();
        mobiles.add("0775675567");
        mobiles.add("0715675567");
        entity.setMobiles(mobiles);

        repo.saveStudent(entity);
    }
}
