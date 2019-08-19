package day8;

public class Exam1 {

	public static void main(String[] args) {
		// 싱글톤이 @Autowired, @Inject와 관련됨
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		if(t1 == t2) {
			System.out.println("두 객체는 같습니다.");
		}else {
			System.out.println("두 객체는 다릅니다.");
		}
	}

}
//싱글톤 클래스 Test
class Test{
	private static Test st = new Test();
	//생성자가 private이기 때문에 외부에서 객체를 만들 수 없다 => 내부에서만 객체
	//생성이 가능 => static을 통해 생성 가능
	private Test() {}

	/*
	 * public void test() { this(); }
	 */
	public static Test getInstance() {
		return st;
	}
}