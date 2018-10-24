package factoryMethod;
/**
 * 工厂模式
 * 实现了创建者和调用者的分离
 * 详细分类（简单工厂模式，工厂方法模式，抽象工厂模式）
 * 面向对象设计的基本原则：
 * ocp(开闭原则，open-close principle)：一个软件的实体应当对扩展开放，对修改关闭
 * DIP（依赖倒转原则 dependence inversion principle）：主要针对接口编程，不要针对实现编程
 * LOD （迪米特法则 law of Demeter）:只与你直接的朋友的朋友通信，而避免和陌生人通信
 * @author Johnsonk
 * @date   Aug 6, 2018
 */
public interface Car {
void run();
}
