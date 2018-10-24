package strategy;

public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		// TODO Auto-generated method stub
		
		System.out.println("普通用户打9折");
		return standardPrice*0.9;
	}

}
