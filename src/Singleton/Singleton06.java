package Singleton;
 
/**
 * 懒汉式加载 效率高，可以延迟加载（真正用的时候再创建）
 * 类初始化时，不初始化这个对象
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton06 {
private static Singleton06 instance;


/**
 * 防止反射漏洞的关键，判断instance是否存在，如果存在，创建时抛出运行时异常
 */
private  Singleton06() {
	if (instance!=null) {
		throw new RuntimeException();
	}
	
}

public static synchronized Singleton06 getinstance() {
	if(instance==null){
		instance=new Singleton06();
	}
	return instance;
}
}
