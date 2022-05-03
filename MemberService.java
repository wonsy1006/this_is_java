package thisIsJava;

public class MemberService {
	// 필드
		String id;
		String password;
			
		// 생성자
		public MemberService(String id, String password) {
			this.id = id;
			this.password = password;
		}
			
		public MemberService() {
			
		}
			
		// 메소드
		boolean login(String id, String password) {
			if (id.equals("hong") && password.equals("12345")) { // 문자열 비교는 equals
				return true;
			} else {
				return false;
			}
		}
			
		void logout(String id) {
			System.out.println("로그아웃 되었습니다.");
		}
	
}
