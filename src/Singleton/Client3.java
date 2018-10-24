package Singleton;

import java.util.concurrent.CountDownLatch;

/**
 *测试多线程环境下五种创建单例模式的效率
 *
 *CountDownLatch  同步辅助类，，相当于计数器
 *  countDown() 
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();
		int ThreadNum=10;
		final CountDownLatch countDownLatch=new CountDownLatch(ThreadNum);
		for (int i = 0; i < 10; i++) {
		    new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int i = 0; i <1000000; i++) {
					//	Object object=Singleton01.getInstance();
						Object object=Singleton05.INSTANCE;//枚举式
					}
					countDownLatch.countDown();
				}
			}).start();
		}
        countDownLatch.await();//main线程阻塞，直到计数器变为0，才会往下执行
        long end=System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
	}
}
