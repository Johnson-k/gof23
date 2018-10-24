package state;

import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 空闲状态
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public class CheckedState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println(new Date()+"房间已入住");
	}
  
}
