package Collections;
class DoSum<A,B>{
	public A getSum(A t,B s,Sums<A,B> r) {
		return r.summed(t, s);
	}
}
interface Sums<A,B>{
	A summed(A t,B s);
}
public class ArithemeticOperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a1='9',b2='9';
		int b1=1;
		DoSum<Character,Character> d2=new DoSum<>();
		Character t1=d2.getSum(a1,b2,(x,y)->(char)(x+y));
		System.out.println(t1);
	}

}
