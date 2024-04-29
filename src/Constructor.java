
public class Constructor {
int l=1;
int be=2;
int h=3;

	public void Constructor(int a , int b , int c)
	{
		l=a;
		be=b;
		h=c;
		System.out.println(l+be+h);
		System.out.println(l);

	}
	public static void main(String[] args) {
		Constructor ch =new Constructor();   
		ch.l=5;
		System.out.println(ch.l);

		
	}
	
	

}
