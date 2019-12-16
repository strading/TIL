package hw;

public class Prob2 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		int A = 0;
		for (int T = 0 ; T < sourceString.length() ; T++) {
			A = sourceString.charAt(T)+ 3;
			if (A > 122) {
				A = A - 26;
				encodedString = encodedString + (char)A;
			}
			else if (A >= 97) {
				encodedString = encodedString + (char)A;
			}
			else {
				encodedString = encodedString + sourceString.charAt(T);
			}
		}
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	}
}



//프로그램을 구현부 시작.
// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

// 프로그램 구현부 끝.

//*****  실행시 출력예시 *****
//암호화할 문자열 : everyday we have is one more than we deserve
//암호화된 문자열 : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh