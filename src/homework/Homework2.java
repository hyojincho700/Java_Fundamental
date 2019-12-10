package homework;

public class Homework2 {
	public static void main(String[] args) {
		//first. 문자 reverse 하기
		//1. input "abcd"  =>  "dcba"
		//2. input "abcde" =>  "edcba"
		
		String input = "abcd"; // 이거 다 한 다음에 두번째는 "abcde"로 입력하면 됨
		char[] ch = input.toCharArray(); // 문자열을 캐릭터 배열로 바꾸는 거
		
		for(int i=0;i<ch.length/2;i++){
			char temp = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i] = temp;
		}
		
		System.out.println(new String(ch)); //for루프로 문자 하나씩 하나씩 출력해도 됨
		//홀수, 짝수-(for문 두 번 돌리기: 전체 length / 2 해서 두개를 스위치 하면 끝나요) 
		//배열 스위치 이용해서
		//for문 돌리면 됨
		
		
		
		//second. 1-100까지 소수를 구하시오.
		//2, 3, 5, 7, 11, ...
		//for(i=2;i<=100;i++){
		//1하고 자기 자신을 뺀, i보다 작거나 같은 놈이 나눠지면 얼른 빠져나와야 함
		//소수가 아니니까.
	    //로또하고 똑같은거여.다만 이건 중복체크가 아니고 나눈 나머지가 없으면 출력 안함, 있으면 출력함
		for(int i=2;i<=100;i++){
			int count = 0;
			for(int j=2;j<i;j++){ // 1하고 자기 자신은 뺀거에요. (이것 저것 여러가지 해봐요)
				if(i % j == 0){
					count++; // 하나라도 나눠져서 count가 1이 증가하는 순간 소수가 아닌거임. 더 이상 연산할 필요 없음.
					break;
				}
			}
			if(count == 0){
				System.out.print(i + " ");
			}
		}
		
		
		//third. 캘린더..........
	}
	
}
