package Java_20191122;

public class Customer {
	public String name; // line 4-9 : instance, line 10 : static, line 11 : static final (사실상 두가지인 거)
	public String email;
	public String phone;
	public int age;
	public double balance;
	public boolean isReleased; // 탈퇴여부
	public static double interestRate;
	public static final String BANKNAME="신한은행"; // final 변수명은 관례 상 대문자로 쓰는 것을 원칙으로 함
}
