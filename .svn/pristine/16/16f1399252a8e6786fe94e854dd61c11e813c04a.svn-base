package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


/**
 * ����ԭ��ģʽ
 * ʹ�����л��ͷ����л��ķ�ʽʵ��ǳ��¡�����¡
 * ���¡֮�󣬱����ƵĶ��������ٸı�Ҳ����Ӱ���¿�¡���Ķ�������Է���ı�
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public class Client3 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws  Exception {
		Date date=new Date(12312456);
	    Sheep s1=new Sheep("����",date);
        System.out.println(s1);
        System.out.println(s1.getName()+":"+s1.getBirthday());
        
        
        
        
     //   Sheep s2=(Sheep)s1.clone();
       //ʹ�����л��ͷ����л�ʵ�����
        ByteArrayOutputStream boStream=new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(boStream);
        byte[] bytes=boStream.toByteArray();
        
        objectOutputStream.writeObject(s1);
        
        
        ByteArrayInputStream aInputStream=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=new ObjectInputStream(aInputStream);
        Sheep s2=(Sheep)ois.readObject();
        
        
        s2.setName("����");
        System.out.println(s2);
        System.out.println(s2.getName()+":"+s2.getBirthday());
        date.setDate(89898);
        System.out.println(s2.getName()+":"+s2.getBirthday());
        System.out.println("********************���֮��ԭ���ĸı��ˣ��µ�û�ı�*********");
        System.out.println(s1.getName()+":"+s1.getBirthday());
        
     
	}
}
