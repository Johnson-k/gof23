package prototype;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import sun.print.resources.serviceui;

/**
 * 测试原型模式
 * 浅克隆
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client {
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
        
        System.out.println("**************序列化和反序列化多利羊********start*********");
        try {
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("D:/obj.txt"));
		    objectOutputStream.writeObject(s1);
		    objectOutputStream.close();
		    
		    ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("D:/obj.txt"));
		    Sheep sheep=(Sheep)objectInputStream.readObject();
		    System.out.println(sheep.getName());
            objectOutputStream.close();
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("**************序列化和反序列化多利羊*******end**********");
     
	}
}
