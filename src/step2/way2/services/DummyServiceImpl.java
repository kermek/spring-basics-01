package step2.way2.services;

import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {
  @Override
  public String test() {
    return "Ok";
  }
}
