package builder;


public class SxtAirShipDirector implements AirShipDirector {
  private  AirShipBuilder builder;
  
  
  
	 public SxtAirShipDirector(AirShipBuilder builder) {
	     this.builder = builder;
     }



	@Override
	public AirShip directAirShip() {
		// TODO Auto-generated method stub
		Engine engine=builder.builderEngine();
		OrbitalModule orbitalModule=builder.builderOrbitalModule();
		EscapeTower escapeTower=builder.builEscapeTower();
		
		//进行组装
		AirShip ship=new AirShip();
		ship.setEngine(engine);
		ship.setEscapeTower(escapeTower);
		ship.setOrbitalModule(orbitalModule);
		return ship;
	}



}
