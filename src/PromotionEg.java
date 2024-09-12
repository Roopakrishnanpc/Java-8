class Promotion{
	//overloading
	void add()
	{
		System.out.println("Summa add");
	}
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, Long b)
	{
		//(2,3) -> 3 wll be typepromoted and considered as Long
		System.out.println(a+b);
	}
	void add(int a, Long b,int c)
	{
		System.out.println(a+b+c);
	}
	void add(Long a, int b,int c)
	{
		//(1,2,3)
		System.out.println(a+b+c);
	}
	void add(Long a, int b,int c,int d)
	{
		//(1,2,3,3)
		System.out.println(a+b+c+d);
	}
	void add(int e, Long a, Long b,Long c,Long d, Long f)
	{
		//(1,2,3,3)
		System.out.println(e+a+b+c+d+f);
	}
	void add(int a, int b, int c, int d, int e) {
	    System.out.println(a + b + c + d + e);
	}

}
public class PromotionEg {
public static void main(String[] args) {
	Promotion prom=new Promotion();
	prom.add();
	prom.add(1, 2);
	prom.add(23, 767888L);
	prom.add(1, 2);//it will type promotote 2 to long int a, long b 
	prom.add(1, 56789876L, 906);
	prom.add(1l,2,4);
	//prom.add(1,2,3);//compile time error because copile will not not know which to protote because we already have int a, log b and int c and again when you give long a, int b, int c
	//prom.add(1,2,3,4);//The method add(int, Long, int) in the type Promotion is not applicable for the arguments (int, int, int, int)
	//WHICH MEANS WHEN YOU INT IT WILL DO TYPE PROMOTION BUT NOW IT WONT KNOW becase you have int, int,int again
	prom.add(1L,2,3,4);
	prom.add(1,2,3,4,5);
	prom.add(1,2l,3l,4l,5l,6l);
}
}
