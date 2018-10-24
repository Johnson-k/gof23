package memento;

/**
 * 备忘录模式
 * 
 * 
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Client {
    
   public static void main(String[] args){
	   CareTaker careTaker=new CareTaker();
	    Emp emp=new Emp("高企",18,900);//员工
	    System.out.println("第一次打印对象："+emp.getName()+"--"+emp.getAge()+"--"+emp.getSalary());
    
       careTaker.setMemento(emp.memento());//备忘一次
       
       emp.setName("lala");
       emp.setAge(25);
       emp.setSalary(9565);
	    System.out.println("第二次打印对象："+emp.getName()+"--"+emp.getAge()+"--"+emp.getSalary());
        emp.recovery(careTaker.getMemento());//恢复备忘录对象
	    System.out.println("第三次打印对象："+emp.getName()+"--"+emp.getAge()+"--"+emp.getSalary());

	    
	    
   }
}
