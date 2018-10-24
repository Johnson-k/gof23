package adapter;
/**
 * ÊÊÅäÆ÷£¬¸ù¾İ¼Ì³ĞÊÊÅä
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
/*
 * 
 * public class AdapteImpl2 extends Adaptee implements Target{
    
	
	@Override
	public void handlereq() {
		// TODO Auto-generated method stub
		super.request();
	}

}*/
/**
 * ÊÊÅäÆ÷£¬¸ù¾İ×éºÏÊÊÅä
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class AdapteImpl2 implements Target{
    
	private Adaptee adaptee;
	@Override
	public void handlereq() {
		// TODO Auto-generated method stub
		adaptee.request();
	}
	public AdapteImpl2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

}