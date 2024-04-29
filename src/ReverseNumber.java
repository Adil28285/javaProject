
public class ReverseNumber {

	int a;    //directly we can't use it in static methods  , we need to create object
	public  void fun1()
	{
		ReverseNumber obj=new ReverseNumber();
		obj.a=20;
		System.out.println(obj.a);
	}
	public static void main(String[] args) {
		ReverseNumber obj=new ReverseNumber();
		obj.fun1();	
	 
     int n=121;         //original and reverse become same , palindrome
     int rev=0;
     int rem=0;
     while(n>0)
     {
    	rem=n%10;      //to get the last digit 
    	rev= rev*10+rem; //to store the previous digit  with new value
        n=n/10;          // to remove the last digit of number 
     }
     
     System.out.println(rev);
     

}
	
}
