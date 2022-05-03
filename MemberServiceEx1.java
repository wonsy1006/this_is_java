package thisIsJava;

public class MemberServiceEx1 {

	public static void main(String[] args) {
				// Create object
				MemberService memberService = new MemberService();
				
				// Method
				
				boolean result = memberService.login("hong", "12345");
				
				if(result) {
					System.out.println("로그인되었습니다.");
					memberService.logout("hong");
				} else {
					System.out.println("ID 또는 패스워드가 올바르지 않습니다.");
				}
					
		}		
				
}


