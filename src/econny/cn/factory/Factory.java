package econny.cn.factory;

public class Factory {

}
/*//抽象产品角色
public interface Moveable {
  void run();
}
//具体产品角色
public class Plane implements Moveable {
  @Override
  public void run() {
      System.out.println("plane....");
  }
}

public class Broom implements Moveable {
  @Override
  public void run() {
      System.out.println("broom.....");
  }
}

//抽象工厂
public abstract class VehicleFactory {
  abstract Moveable create();
}
//具体工厂
public class PlaneFactory extends VehicleFactory{
  public Moveable create() {
      return new Plane();
  }
}
public class BroomFactory extends VehicleFactory{
  public Moveable create() {
      return new Broom();
  }
}
//测试类
public class Test {
  public static void main(String[] args) {
      VehicleFactory factory = new BroomFactory();
      Moveable m = factory.create();
      m.run();
  }
}*/
