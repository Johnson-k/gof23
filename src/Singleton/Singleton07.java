package Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;
 
/**
 * 懒汉式加载 效率高，可以延迟加载（真正用的时候再创建）
 * 类初始化时，不初始化这个对象
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton07 implements Serializable{
  private static Singleton07 instance;


/**
 * 防止反射漏洞的关键，判断instance是否存在，如果存在，创建时抛出运行时异常
 */
  private  Singleton07() {
	if (instance!=null) {
		throw new RuntimeException();
	}
	
}

   public static synchronized Singleton07 getinstance() {
	if(instance==null){
		instance=new Singleton07();
	}
	return instance;
  }
   
   //加上这个方法，可以防止反序列化破解，返回的时候直接返回此方法指定的对象，而不需要再单独创建新的对象
   private Object readResolve() throws ObjectStreamException{
	return instance;
  }
}
