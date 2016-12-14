package econny.cn.factory;

public class Factory {

}
/*//�����Ʒ��ɫ
public interface Moveable {
  void run();
}
//�����Ʒ��ɫ
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

//���󹤳�
public abstract class VehicleFactory {
  abstract Moveable create();
}
//���幤��
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
//������
public class Test {
  public static void main(String[] args) {
      VehicleFactory factory = new BroomFactory();
      Moveable m = factory.create();
      m.run();
  }
}*/
