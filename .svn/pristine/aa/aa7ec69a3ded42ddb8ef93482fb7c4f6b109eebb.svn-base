package simpleFactory;

/**
 * 简单工厂模式
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class CarFactory {
 public static Car createCar(String type){
	 if("奥迪".equals(type)){
		 return new Audi();
	 }else if("比亚迪".equals(type)){
		 return new Byd();
	 }else {
		return null;
	}
 }
 /**
  * 以下是另外一种简单工厂模式的编写方法(也称之为静态工厂模式)
  * @return
  */
 public static Car createAudi(){
	 return new Audi();
 }
 public static Car createByd(){
	 return new Byd();
 }
}
