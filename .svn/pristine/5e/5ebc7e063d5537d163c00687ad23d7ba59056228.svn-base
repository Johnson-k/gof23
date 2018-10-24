package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *测试发射和反序列化破解单例模式
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
          testSingleton06();
	}
    public static void testSingleton06() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
    	System.out.println("__________正常的测试____地址相同，是同一个______");
    	Singleton06 singleton01=Singleton06.getinstance();
    	Singleton06 singleton02=Singleton06.getinstance();
        System.out.println(singleton01);
        System.out.println(singleton02);
        
/*        System.out.println("__________反射的测试____地址不同，创建了新对象______");
       Class<Singleton06> clazz=(Class<Singleton06>) Class.forName("Singleton.Singleton06");
       Constructor<Singleton06> constructor=clazz.getDeclaredConstructor(null);
       constructor.setAccessible(true);//反射和反序列化的关键
       
       Singleton06 s3=constructor.newInstance();
       Singleton06 s4=constructor.newInstance();
       System.out.println(s3);
       System.out.println(s4);*/
    
    }
}
