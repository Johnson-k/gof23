package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class ConcreteMyAggregate {
  private List<Object> list=new ArrayList<Object>();

public ConcreteMyAggregate() {
	super();
}
  public void addobject(Object obj){
	  this.list.add(obj);
  }
  public void removeobject(Object obj){
	  this.list.remove(obj);
  }
  
  //获取迭代器
  public MyIerator createItIerator(){
	  return new ConcreteIteator();
  }
  
  //使用内部类定义迭代器，可以直接使用外部类的属性
  private class ConcreteIteator implements MyIerator{
   private int cursor;
	@Override
	public void first() {
		// TODO Auto-generated method stub
		cursor=0;
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
	    if (cursor<list.size()) {
			cursor++;
		}
	}

	@Override
	public boolean hasNext() {
		if (cursor<list.size()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFirst() {
		if (cursor==0) {
			return true;
		}
		return false;
	}

	@Override
	public Object getCurrentObj() {
		// TODO Auto-generated method stub
		return list.get(cursor);
	}
	  
  }
}
