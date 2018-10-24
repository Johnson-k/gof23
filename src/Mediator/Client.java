package Mediator;
/**
 * 中介者模式
 * 
 *核心：把网状结构（多对多）解耦，变成一对多
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {
    static int aaa=100;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
          Mediator mediator=new President();
          Market market=new Market(mediator);
          Development development=new Development(mediator);
          Finacial finacial=new Finacial(mediator);
          
          
          market.selfAction();
          market.outAction();

	}


}
