package bridge;
/**
 * 在这里加类和在Brand里加品牌，互不影响
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class Computer2 {
    protected Brand brand;
     public Computer2(Brand b){
    	this.brand=b; 
    	 
     }
    public void sale(){
    	brand.sale();
    }
}
class Desktop2 extends Computer2{

	public Desktop2(Brand b) {
		super(b);
	}
	@Override
	public void sale(){
		super.sale();
		System.out.println("销售"+brand+"台式机");
	}
}
class Laptop2 extends Computer2{

	public Laptop2(Brand b) {
		super(b);
	}
	@Override
	public void sale(){
		super.sale();
		System.out.println("销售"+brand+"笔记本");
	}
}