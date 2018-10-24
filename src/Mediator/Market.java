package Mediator;

public class Market implements Department{
  private Mediator mediator;
	public Market(Mediator mediator) {
	super();
	this.mediator = mediator;
	mediator.register("devlopment", this);
}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("接项目");
	}

	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("汇报工作，项目进度，要钱");
		mediator.command("finacial");
	}

}
