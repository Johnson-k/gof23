package Observer;

import java.util.Observable;

public class COncreteSubject extends Observable{

	private int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public void set(int s){
		state=s;
		setChanged();//表示目标对象已经做了更改
		notifyObservers(state);//通知所有的观察者，这个参数发生改变了
	}
}
