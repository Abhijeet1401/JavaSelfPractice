class base{
	public void M1(){
		System.out.println("Base class extends method");
	}
}
  class Derived extends base{
	  public void M2(){
		  System.out.println("derived class methods");
	  }
  }
   class test{
	public  static void main(String[] args){
	Derived d = new Derived();
	  d.M1();//call base class methods
		d.M2();//call derived class methods
   }
}