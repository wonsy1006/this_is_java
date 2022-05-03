package thisIsJava;

public class PrinterExample1 {

	public static void main(String[] args) {
		// 인스턴스 객체 생성
		/* Printer printer = new Printer(); 
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동"); */
		
		// 인스턴스 객체 생성하지 않음
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");

	}

}
