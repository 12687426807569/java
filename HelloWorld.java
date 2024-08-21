public class HelloWorld{
	public static void main(String[] args){
		System.out.print("Hello world!\n輸入年齡:");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int age=s.nextInt();//不吃\n
		System.out.print("年齡="+age+"\n輸入名字:");
		s.nextLine();
		String name=s.nextLine();//吃\n但不回傳
		System.out.print("你好"+name);
		System.out.print("---");
	}
}
