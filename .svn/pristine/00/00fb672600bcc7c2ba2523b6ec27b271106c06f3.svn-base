package Mediator;

public class Finacial implements Department{
  private Mediator mediator;
	public Finacial(Mediator mediator) {
	super();
	this.mediator = mediator;
	mediator.register("devlopment", this);
}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("数钱");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("汇报工作，有钱");
	}

}
