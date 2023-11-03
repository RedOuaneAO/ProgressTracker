import entities.Objective;
import entities.State;
import entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.ObjectiveService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");




        User user = context.getBean("user" , User.class);
        user.setName("redone");
        user.setId(1);
        user.setAge(26);
        Objective objective =context.getBean("objective",Objective.class);
        objective.setDescription("testing the description");
        objective.setUser(user);
        objective.setId(1);
        objective.setState(State.TODO);
        ObjectiveService objectiveService  = context.getBean("objectiveService" , ObjectiveService.class);
        System.out.println(objectiveService.addObjective(objective));



    }
}
