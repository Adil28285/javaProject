
public class EMP {
	String name;
	String address;
	int salary;
	int regno;
	public void setname()

	{
		System.out.println(name);
	}
	public void setaddress(String i)

	{
		System.out.println(i);
	}
	public void setsalary()

	{
		System.out.println(salary);
	}
	public void setregno()

	{
		System.out.println(regno);
	}
	public void getname()
	{
		System.out.println(name);
	}
	public void getaddress()
	{
		System.out.println(address);
	}
	public void getsalary()
	{
		System.out.println(salary);
	}
	public void getregno()
	{
		System.out.println(regno);
	}

	public static void main(String[] args) {
		
		EMP e1=new EMP();
		EMP e2=new EMP();
		e1.name="Adil";
		e1.address="ameerpet";
		e1.salary=2000;
		e1.regno=101;
		e2.name="muneer";
		e2.address="begumet";
		e2.salary=5000;
		e2.regno=102;
		e1.getaddress();
		e2.getsalary();
		e1.setaddress("malakpet");
		

	}

}
