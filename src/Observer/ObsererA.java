package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObsererA implements Observer{
   private int myState;
	@Override
	public void update(Observable arg0, Object arg1) {//arg0是主体对象，
		// TODO Auto-generated method stub
		myState=((COncreteSubject)arg0).getState();
	}
	public int getMyState() {
		return myState;
	}
	public void setMyState(int myState) {
		this.myState = myState;
	}
    
}
