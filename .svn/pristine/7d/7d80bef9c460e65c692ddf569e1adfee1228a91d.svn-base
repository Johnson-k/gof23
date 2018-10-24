package Singleton;
 
/**
 * 懒汉式加载 效率高，可以延迟加载（真正用的时候再创建）
 * 类初始化时，不初始化这个对象
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton02 {
private static Singleton02 instance;
private  Singleton02() {}

public static synchronized Singleton02 getinstance() {
	if(instance==null){
		instance=new Singleton02();
	}
	return instance;
}
}
