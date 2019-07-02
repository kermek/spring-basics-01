package step2.way3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import step2.way3.config.Config;
import step2.way3.services.DummyService;

public class HelloWorld {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//    DummyService dummyService = new DummyServiceImpl();
    DummyService dummyService = context.getBean(DummyService.class);
    System.out.println("DummyService returned: " + dummyService.test());
  }
}
