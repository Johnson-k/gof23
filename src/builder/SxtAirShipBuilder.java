package builder;
/**
 * uilder结尾的都是构建者模式
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class SxtAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		// TODO Auto-generated method stub
		System.out.println("构建发动机");
		return new Engine("尚学堂发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		// TODO Auto-generated method stub
		System.out.println("轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower builEscapeTower() {
		// TODO Auto-generated method stub
		System.out.println("逃逸仓");
		return new EscapeTower("逃逸仓");
	} 
   
}
