package abstractFactory;

public interface Seat {
void massage();
}
class LuxurySeat implements Seat{

	@Override
	public void massage() {
		// TODO Auto-generated method stub
		System.out.println("可以自动按摩");
	}
	
}
class LowSeat implements Seat{

	@Override
	public void massage() {
		// TODO Auto-generated method stub
		System.out.println("不能按摩");
	}
	
}