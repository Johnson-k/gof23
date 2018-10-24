package builder;
/**
 * 建造者模式用来处理类关系比较复杂，还有很多组件
 * 要组装时，为了便于创建对象，，采用建造者模式
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AirShipDirector director=new SxtAirShipDirector(new SxtAirShipBuilder());
       AirShip ship=director.directAirShip();
       
       System.out.println(ship.getEngine().getName());
       ship.launch();
	}

}
