package Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *测试通过反序列化的方法构造多个对象
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client4 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		// TODO Auto-generated method stub
          testSingleton07();
	}
	/**
	 * 测试通过反序列化的方法构造多个对象
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
    public static void testSingleton07() throws IOException, ClassNotFoundException{
    	System.out.println("__________正常的测试____地址相同，是同一个______");
    	Singleton07 singleton01=Singleton07.getinstance();
    	Singleton07 singleton02=Singleton07.getinstance();
        System.out.println(singleton01);
        System.out.println(singleton02);
        
        //序列化
       try {
		FileOutputStream fos=new FileOutputStream("d:/testSingleton07.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(singleton01);
		oos.close();
		fos.close();
	    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	     }
       
       //反序列化
       System.out.println("__________通过序列化反序列化____地址不相同，创建了新对象__如果加了readResolve()方法，则不会创建新的对象____");
       ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:/testSingleton07.txt"));
       Singleton07 singleton03=(Singleton07)ois.readObject();
       System.out.println(singleton03);
    }
}
