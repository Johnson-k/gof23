package Singleton;

import sun.security.action.GetBooleanAction;
import sun.security.jca.GetInstance;

/**
 *  * 饿汉式。单例模式   效率高，不能延迟加载，线程安全
 * 
 *私有化构造器，静态，私有化对象
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton01 {
	private static Singleton01 instanse=new Singleton01();//类初始化时，立即加载这个对象
    private Singleton01(){};
    public static Singleton01 GetInstance(){
    	return  instanse;
    }
}
