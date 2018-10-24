package FlyWeight;


/**
 * 享元模式
 * 场景：内存属于稀缺资源，不要随便浪费，如果有很多个完全相同的或相似的对象，
 * 我们可以通过享元模式，节省内存
 * 
 * 核心：
 * a).享元模式以共享的方式高效的支持大量细粒度对象的重用
 * b).享元对象能做到共享的关键是区分了内部状态和外部状态
 *   内部状态：可以共享，不会随环境变化而改变
 *   外部状态：不可以共享，会随环境变化而改变
 *   
 *   
 *   缺点：
 *   逻辑复杂
 *  为了节省内存，共享了内部状态，分离出外部状态，而读取外部状态是
 * 使运行时间较长。用时间换取空间
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {

	public static void main(String[] args) {
		ChessFlyWeight c=FlyWeightFactory.getChessFlyWeight("黑色");
		ChessFlyWeight c1=FlyWeightFactory.getChessFlyWeight("黑色");
		System.out.println(c1==c);//取了两次，但是同一对象
		
		
		System.out.println("增加外部状态的处理*************");
		c.disPlay(new Coordinate(10,10));
		c1.disPlay(new Coordinate(100,120));
	}

}
