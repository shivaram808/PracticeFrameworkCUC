package interface_abstract;


//class temp
//{
//	void add(int i, int j)
//	{
//		System.out.println("addition of i & j : : " +i+j );
//	}
//	
//	void add(String a,String b)
//	{
//		System.out.println("addition a & b: : " +a+b );
//	}
//}

class temp
{
	void add(Object i, Object j)
	{
		
		System.out.println("addition of i & j : : " +i+j );
	}

}
public class overloading {

	public static void main(String[] args) {
		
		temp obj = new temp();
		obj.add("a", "b");
		obj.add(10, 20);
	}

}
