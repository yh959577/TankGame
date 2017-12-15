package Test.TestFrame;

import Test.TestComponent.WelcomeComponent;
import Test.TestFrame.BaseFrame;

public class WelcomeFrame extends BaseFrame {
  public WelcomeFrame(){
      super();
   add(new WelcomeComponent());
  }
}
