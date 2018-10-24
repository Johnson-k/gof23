package Singleton;

/**
 * 静态内部类实现方式（也是一种懒加载方式）
 * 只有真正调用getInstance 才会加载内部静态类，加载
 * 类时是线程安全的，instance是static final 类型，
 * 保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而
 * 保证了线程安全性，兼备了并发高兴调用和延迟加载的优势
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Singleton04 {
    private  static class SingletonClassInstance{
	  private static final Singleton04 instance=new Singleton04();
    }
    public static Singleton04 getInstance(){
    	return SingletonClassInstance.instance;
    }
    private Singleton04(){}
}
