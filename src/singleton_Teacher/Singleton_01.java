package singleton_Teacher;

// 단점.
//	1. 인스턴화하면서 추가 작업을 할 수 없음
//		(예외처리 불가)
//	2. 인스턴스를 사용하지 않더라도 생성해 놓는다

public class Singleton_01 {
	
	public String data = "Apple";
	
	private static Singleton_01 instance
		= new Singleton_01();
	
	private Singleton_01() { } // 외부에서 객체 생성 불가
	
	public static Singleton_01 getInstance() {
		return instance;
	}
}









