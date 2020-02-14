import data_structure.Solution4;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A aa = new A();
//
//		A ab = new B();
//
//		B b = new B();
////
//		C c = new C(); 
////
//		D d = new D();
//		
//		System.out.println(ab.run(b)); //B & A
		Solution4 s4 =new Solution4();
		int [] a = {1,2,3,0,0,0};
		int [] b = {2,5,6};
		s4.merge(a, 3, b, 3);
		for(int i :  a) {
			System.out.println(i);
		}
		
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
