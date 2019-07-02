package step2.way4;

import static org.testng.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import step2.way4.config.Config;
import step2.way4.services.DummyService;

@ContextConfiguration(classes = Config.class)
public class HelloWorld extends AbstractTestNGSpringContextTests {

  @Autowired
  private DummyService dummyService;

  @Test
  public void test() {
    assertEquals(dummyService.test(), "Ok");
  }
}
