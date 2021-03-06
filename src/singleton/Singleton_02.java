package singleton;

// + static 블록, 초기화 블록, Initialization Block
// - 클래스 코드가 처음 로드될 때 한번만 수행되는 코드 블록
// - 객체생성(인스턴스화)과는 무관하게 딱 한번만 수행한다
// - 클래스변수(정적변수, static변수) 초기화에 사용

// + 클래스로드 및 객체 생성 순서
// 1. 클래스 로드
// 2. 클래스 변수 생성
// 3. static 블록 수행
// 4. 이후 준비된 클래스로부터 생성자를 통해 인스턴스를 초기화하며 객체 생성
//
// + 클래스 로더의 수행 절차
// 0. 바이트 코드 분석
// 1. 프로그램에서 사용된 클래스를 JRE 라이브러리에서 .class 파일로 찾기
// 2. 없으면 CLASSPATH로 지정된 폴더에서 .class 찾기
// 3. 찾은 이후, 올바른 문법의 바이트 코드인지 검증
// 4. 올바른 문법이면, .class 파일을 메모리로 로딩
// 5. 클래스 블록(정적필드, 정적메소드) 처리
// 6. static 초기화 블록 수행


// 인스턴스 생성 시 추가 작업 할 수 있도록 static블록 적용

public class Singleton_02 {

	private static Singleton_02 instance;
	
	//static 초기화 블록
	static {
		try {
		instance = new Singleton_02();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Singleton_02() { } //private 생성자
	
	// 인스턴스 반환 메소드
	public static Singleton_02 getInstance() {
		return instance;
	}
}
