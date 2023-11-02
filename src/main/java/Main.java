import entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");
            User user = context.getBean("user" , User.class);
            user.setName("redone");
            System.out.println(user.getName());
    }
}
