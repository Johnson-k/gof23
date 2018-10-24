package FlyWeight;
/**
 * 享元类（抽象）
 * @author Johnsonk
 * @date   Aug 8, 2018
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void disPlay(Coordinate c);
}
class ConcreteChess implements ChessFlyWeight{
    private   String color;
    public ConcreteChess(String color){
    	super();
    	this.color=color;
    }
	@Override
	public void setColor(String color) {
	
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disPlay(Coordinate c) {
		// TODO Auto-generated method stub
		System.out.println("棋子颜色："+color);
		System.out.println("棋子位置"+"["+c.getX()+","+c.getY()+"]");
	}
	
}