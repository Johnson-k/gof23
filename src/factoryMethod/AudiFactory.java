package factoryMethod;
/**
 * 工厂方法模式
 * 符合开闭原则，弊端是新建的类比较多容易造成冗余，一般选用简单工厂模式
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class AudiFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
