package dynamic_proxy;

import java.lang.reflect.Proxy;
/**
 * ≤‚ ‘∂ØÃ¨¥˙¿Ì
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RealStar realStar=new RealStar();
         StarHandler handler=new StarHandler(realStar);
         Star proxy=(Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
	
	     proxy.bookTicket();
         proxy.sing();
	}

}
