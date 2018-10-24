package composite;
/**
 * 抽象组件
 * @author Johnsonk
 * @date   Aug 7, 2018
 */
public interface Component {
    void operation();
}
interface Leaf extends Component{
	
}
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	/**
	 * 
	 * @param index  根据索引获取子节点组件
	 * @return
	 */
	Component getChild(int index);
}