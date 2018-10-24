package static_proxy;

public class Client {
   public static void main(String[] args) {
	  RealStar realStar=new RealStar();
	  Star proxyStar=new ProxyStar(realStar);
	  
	  
	  proxyStar.confer();
	  proxyStar.signContract();
	  proxyStar.bookTicket();
	  proxyStar.sing();  //可以看出所有事都是代理做，只有唱歌不是
	  proxyStar.collectMoney();
   }
}
