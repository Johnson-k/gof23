package dynamic_proxy;
/**
 * 创建真实的明星对象，
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class RealStar implements Star{

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("confer");
		
	}

	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("signContract");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("bookTicket");
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("周杰伦");
	}

	@Override
	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("collectMoney");
		
	}

}
