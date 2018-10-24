package memento;

import org.ietf.jgss.Oid;

/**
 * 源发器类
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class Emp {
    private int age;
    private String name;
    private double salary;
	public Emp( String name,int age, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	//进行备忘操作，并返回备忘录对象
	public EmpMemento memento(){
		return new EmpMemento(this);
	}
	
	//进行数据恢复，回复成指定备忘录对象的值
	public void recovery(EmpMemento mmt){
		this.name=mmt.getName();
		this.age=mmt.getAge();
		this.salary=mmt.getSalary();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}
