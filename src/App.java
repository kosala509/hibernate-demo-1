import com.mysql.cj.Session;

import util.SessionFactoryConfiguration;

public class App {
    public static void main(String[] args) throws Exception {
        org.hibernate.Session s = SessionFactoryConfiguration.getInstance().getSession();
    }
}
