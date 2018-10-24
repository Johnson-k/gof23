package factoryMethod;

import javax.crypto.Cipher;

public class Client01 {
   public static void main(String[] args) {
	Car c1=new AudiFactory().createCar();
	Car c2=new BydFactory().createCar();
    c1.run();
    c2.run();
    
    //增加奔驰类时只需要增加奔驰类和奔驰工厂，符合开闭原则
	Car c3=new BenzFactory().createCar();
    c3.run();
}
}
