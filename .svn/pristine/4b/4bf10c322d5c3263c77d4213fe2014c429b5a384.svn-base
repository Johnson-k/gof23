package Singleton;

/**
 * 双重检测锁实现
 * 效率低，基于jvm 底层，会出现问题
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton03 {
private static Singleton03 instance=null;
public static Singleton03 getInstance(){
	if(instance==null){
		Singleton03 sc;
		synchronized (Singleton03.class) {
			sc=instance;
			if(sc==null){
				synchronized (Singleton03.class) {
					if(sc==null){
						sc=new Singleton03();
					}
				}
				instance=sc;
			}
		}
	}
	return instance;
}
}
