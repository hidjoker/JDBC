package singleton;

// + static ����, �ʱ�ȭ ����, Initialization Block
// - Ŭ���� �ڵ尡 ó�� �ε�� �� �ѹ��� ����Ǵ� �ڵ� ����
// - ��ü����(�ν��Ͻ�ȭ)���� �����ϰ� �� �ѹ��� �����Ѵ�
// - Ŭ��������(��������, static����) �ʱ�ȭ�� ���

// + Ŭ�����ε� �� ��ü ���� ����
// 1. Ŭ���� �ε�
// 2. Ŭ���� ���� ����
// 3. static ���� ����
// 4. ���� �غ�� Ŭ�����κ��� �����ڸ� ���� �ν��Ͻ��� �ʱ�ȭ�ϸ� ��ü ����
//
// + Ŭ���� �δ��� ���� ����
// 0. ����Ʈ �ڵ� �м�
// 1. ���α׷����� ���� Ŭ������ JRE ���̺귯������ .class ���Ϸ� ã��
// 2. ������ CLASSPATH�� ������ �������� .class ã��
// 3. ã�� ����, �ùٸ� ������ ����Ʈ �ڵ����� ����
// 4. �ùٸ� �����̸�, .class ������ �޸𸮷� �ε�
// 5. Ŭ���� ����(�����ʵ�, �����޼ҵ�) ó��
// 6. static �ʱ�ȭ ���� ����


// �ν��Ͻ� ���� �� �߰� �۾� �� �� �ֵ��� static���� ����

public class Singleton_02 {

	private static Singleton_02 instance;
	
	//static �ʱ�ȭ ����
	static {
		try {
		instance = new Singleton_02();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Singleton_02() { } //private ������
	
	// �ν��Ͻ� ��ȯ �޼ҵ�
	public static Singleton_02 getInstance() {
		return instance;
	}
}