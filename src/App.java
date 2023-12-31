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

        //Student Save
        // StudentEntity entity = new StudentEntity();
        // entity.setNic("921676790V");
        // StudentName studentName = new StudentName("stu First 3","stu Last 3");
        // entity.setName(studentName);
        // List <String> mobiles = new ArrayList<>();
        // mobiles.add("0723475588");
        // mobiles.add("0717537567");
        // entity.setMobiles(mobiles);
        // repo.saveStudent(entity);

        //Student Get
        StudentEntity studentEntity = repo.getStudent(3);
        System.out.println(studentEntity.toString());

        studentEntity.setNic("891676799V");
        studentEntity.getName().setFirstName("Updated First Name");

        repo.updateStudent(studentEntity);

        studentEntity = repo.getStudent(3);
        System.out.println(studentEntity.toString());

        repo.deleteStudent(studentEntity);
    }
}
