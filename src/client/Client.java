package client;


import app.controller.SportController;
import app.model.Sport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");

        SportController controller = context.getBean(SportController.class);

        Sport sport = controller.getById(3);

        System.out.println(sport);

    }
}
