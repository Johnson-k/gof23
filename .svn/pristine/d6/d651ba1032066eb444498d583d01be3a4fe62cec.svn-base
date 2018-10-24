package state;




/**
 * 状态模式
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {
     public static void main(String[] args) {
          Context context=new Context();
          context.setState(new FreeState());
          context.setState(new BookedState());
          context.setState(new CheckedState());
          System.out.println("现在的房间状态是："+context.getState());
     }
}
