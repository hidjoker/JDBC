package singleton;

public class SingletonEx {
	
	public static void main(String[] args) {
		
		Singleton_01 s1;
		
		s1 = Singleton_01.getInstance();
		
		Singleton_01 s2 = Singleton_01.getInstance();
		
//		private 생성자로 추가 객체 생성 막힘
//		Singleton_01 s3 = new SingletonEx();
		
		System.out.println(s1.data);
		System.out.println(s2.data);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("--------------");
		
		System.out.println();
	}
}
