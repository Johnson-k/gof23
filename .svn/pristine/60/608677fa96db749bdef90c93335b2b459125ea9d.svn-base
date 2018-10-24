package Mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator{
  private Map<String,Department> map=new HashMap<String, Department>();
  
	@Override
	public void register(String name, Department d) {
		// TODO Auto-generated method stub
		map.put(name, d);
	}

	@Override
	public void command(String dname) {
		// TODO Auto-generated method stub
		
		map.get(dname).selfAction();
	}

}
