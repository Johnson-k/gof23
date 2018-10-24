package static_proxy;
/**
 * 静态代理模式
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class ProxyStar implements Star{

	/*
	 * 
	 */
	private Star star;
	
	public ProxyStar(Star star) {
		super();
		this.star = star;
	}
    
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("代理confer");
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("代理signContract");

	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("代理bookTicket");

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("代理collectMoney");

	}

}
