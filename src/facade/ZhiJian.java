package facade;

public interface ZhiJian{
    void orgCodeCertificate();
}
class ZhiJianJu implements ZhiJian{

	@Override
	public void orgCodeCertificate() {
		System.out.println("质监局");
	}
	
}