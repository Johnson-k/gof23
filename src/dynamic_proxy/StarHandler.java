package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK自带的动态代理实现InvotationHandler
 * 
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class StarHandler implements InvocationHandler{
   Star realStar;
   
   public StarHandler(Star realStar){
	   super();
	   this.realStar=realStar;
   }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().equals("sing"))
	       method.invoke(realStar,args);
		return null;
	}

}
