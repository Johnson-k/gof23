package bridge;
/**
 * 桥接模式测试
 * 用于多维度，
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public class Client {
    public static void main(String[] args) {
    	
		Computer2 computer2=new Laptop2(new lenovo());
		computer2.sale();
		
		//新加神州电脑，只需要加电脑品牌就行了，不需要再加类型
		Computer2 comp=new Desktop2(new Shenzhou());
		comp.sale();
	}
}
