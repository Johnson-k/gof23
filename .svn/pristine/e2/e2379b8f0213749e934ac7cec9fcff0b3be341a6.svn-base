package decorator;

import java.util.Arrays;

/**
 * 装饰模式
 * 动态的为一个对象增加新的功能
 * 装饰模式是一种用于代替继承的技术，无需通过继承增加子类就能扩展对象的新功能，
 * 使用对象的关联关系代替继承关系，更加灵活，同时避免类型体系的快速膨胀
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class Client {
    
    public static void main(String[] args) {
    	System.out.println("***************普通");
    	Car car=new Car();
        car.move();
        
        System.out.println("***************增加新的功能，飞行");
        FlyCar fcar=new FlyCar(car);
        fcar.fly();
        
        System.out.println("***********增加新的功能,水里游");
        WaterCar wcar=new WaterCar(car);
        wcar.swim();;
        
        
        System.out.println("****************增加新的功能,水里游");
        WaterCar wcar2=new WaterCar(new FlyCar(new Car()));
        wcar2.move();
        System.out.println("---");
    	
    	
        
	}
}
