package singleton_Teacher;

// 인스턴스 생성 시 추가 작업 할 수 있도록 static블록 적용

public class Singleton_02 {

	private static Singleton_02 instance;
	
	//static 초기화 블록 - 클래스 변수 초기화
	static {
		try {
			instance = new Singleton_02();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
	
	private Singleton_02() { } // private 생성자
	
	// 인스턴스 반환 메소드
	public static Singleton_02 getInstance() {
		return instance;
	}
	
}











