package step2.way1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import step2.way1.services.DummyService;

public class HelloWorld {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext("step2.way1");
//    DummyService dummyService = new DummyServiceImpl();
    DummyService dummyService = context.getBean("dummyServiceImpl", DummyService.class);
    System.out.println("DummyService returned: " + dummyService.test());
  }
}
