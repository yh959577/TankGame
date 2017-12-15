package Test.TestFrame;

import Test.TestComponent.GameComponent;
import Test.TestFrame.BaseFrame;

public class GameFrame extends BaseFrame {

    public GameFrame(){
      super();
      add(new GameComponent());
    }

}
