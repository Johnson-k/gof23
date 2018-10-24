package template_method;

public abstract  class Father {
   public void play(){
	   System.out.println("¥Ú¿∫«Ú");
   }
   public void play2(){
	   System.out.println("¥Ú¿∫«Ú2");
   }
   public void play3(){
	   System.out.println("¥Ú¿∫«Ú3");
   }
   public abstract void play4();
   public void play5(){
	   System.out.println("¥Ú¿∫«Ú5");
   }
   public final void model(){
	   this.play();
	   this.play2();
	   this.play3();
	   this.play4();
	   this.play5();
   }
}
class Son extends Father{
   @Override
    public void play() {
	System.out.println("Ãﬂ◊„«Ú");
     }
	@Override
	public void play4() {
		// TODO Auto-generated method stub
		System.out.println("≥‘÷Ì»‚");
	}
	
}