package simpleFactory;

import javax.smartcardio.Card;

/**
 * 
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client02 {
   public static void main(String[] args) {
	Car c1=CarFactory.createCar("奥迪");//简单工厂方法
	Car c2=new Byd();//没有用简单工厂模式
	c1.run();
	c2.run();
   }
}
