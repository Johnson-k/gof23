package prototype;

import java.io.Serializable;
import java.util.Date;


public class Sheep implements Cloneable,Serializable{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private Date birthday;
    
    public Sheep(){}
    public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	@Override
    protected Object clone() throws CloneNotSupportedException {
    	Object object=super.clone();  //ֱ�ӵ���object�����clone ��¡
       //������´��룬ʵ�����
//    	Sheep s=(Sheep)object;
//    	s.birthday=(Date)this.birthday.clone();
    	
    	return object;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
