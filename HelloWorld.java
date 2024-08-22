public class HelloWorld{
	public static void main(String[] args){
		System.out.print("Hello world!\n輸入年齡:");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int age=s.nextInt();//不吃\n
		System.out.print("年齡="+age+"\n輸入名字:");
		s.nextLine();
		String name=s.nextLine();//吃\n但不回傳\n
		System.out.print("你好,"+name);
		System.out.print("---\n");
		int i=2,j=0;
		if(i>0||(i++)>0)System.out.println("||");
		System.out.println("i="+i);
		if(1>0|(i++)>0)System.out.println("|");
		System.out.println("i="+i);
	}
}
