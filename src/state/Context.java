package state;

public class Context {
	//相当于银行系统根据金额不同，切换不同的状态
   private State state;
   public State getState(){
	   return this.state;
   }
   public void setState(State s){
	   System.out.println("修改");
       state=s;
       state.handle();
   
   }
}
