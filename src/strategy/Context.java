package strategy;
/**
 * 负责和具体的策略交互
 * 具体的算法和直接的客户端分离了，
 * 
 * 
 * 如果使用spring 的依赖注入，还可以通过配置文件，动态注入不同的策略对象
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Context {
   private Strategy strategy;//当前采用的算法对象
   
   
   //可以通过构造器注入
   public Context(Strategy strategy){
	   this.strategy=strategy;
   }
   
   //可以通过set方法来注入
   public void setStrategy(Strategy strategy){
	   this.strategy=strategy;
   }
   
   public void printPrice(double s){
	   System.out.println("您该报价："+strategy.getPrice(s));
   }
}
