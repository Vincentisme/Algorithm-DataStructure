
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A aa = new A();

		A ab = new B();

		B b = new B();
//
		C c = new C(); 
//
		D d = new D();
		
		System.out.println(ab.run(b)); //B & A
		
	}

}
class A{
	
	public String run(D obj) {
		return ("A & D");
	}
	
	public String run(A obj) {
		return ("A & A");
	}
}

class B extends A{
	
	public String run(B obj) {
		return ("B & B");
	}
	
	public String run1(A obj) {
		return ("B & A");
	}
}

class C extends B {}

class D extends B {}
