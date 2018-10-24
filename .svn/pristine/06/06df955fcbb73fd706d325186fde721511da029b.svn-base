package prototype;

import java.io.FileInputStream;

import java.io.ObjectOutputStream;
import java.util.Date;


/**
 * 测试原型模式
 * 深克隆
 * 深克隆之后，被复制的对象属性再改变也不会影响新克隆出的对象的属性发生改变
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(12312456);
	    Sheep s1=new Sheep("少利",date);
        System.out.println(s1);
        System.out.println(s1.getName()+":"+s1.getBirthday());
        Sheep s2=(Sheep)s1.clone();
        s2.setName("多利");
        System.out.println(s2);
        System.out.println(s2.getName()+":"+s2.getBirthday());
        date.setDate(89898);
        System.out.println(s2.getName()+":"+s2.getBirthday());
        System.out.println("********************深复制之后原来的改变了，新的没改边*********");
        System.out.println(s1.getName()+":"+s1.getBirthday());
        
     
	}
}
