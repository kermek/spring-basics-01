package step1;

import step1.services.DummyService;
import step1.services.DummyServiceImpl;

public class HelloWorld {
  public static void main(String[] args) {
    DummyService dummyService = new DummyServiceImpl();
    System.out.println("DummyService returned: " + dummyService.test());
  }
}
