package iterator;

public class Client {
  public static void main(String[] args) {
	ConcreteMyAggregate concreteMyAggregate=new ConcreteMyAggregate();
	concreteMyAggregate.addobject("aaa");
	concreteMyAggregate.addobject("aada");
	concreteMyAggregate.addobject("aafaa");
	concreteMyAggregate.addobject("afhraa");
	concreteMyAggregate.addobject("arttraa");
	
	MyIerator ierator=concreteMyAggregate.createItIerator();
	while (ierator.hasNext()) {
		System.out.println(ierator.getCurrentObj());
		ierator.next();
	}
}
}
