package hw;

public class Prob3 {
	public static void main(String[] args) {
		// String[] strData;
		// strData = new String[4]
		// strData[0] ="Java Programming"
		// strData[1] ="JDBC"
		// strData[2] ="Oracle10g"
		// strData[3] ="JSP/Servlet"

		String[] strData = { "Java Programming", "JDBC", "Oracle10g", "JSP/Servlet" };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < strData[i].length(); j++) {
				System.out.print(strData[i].charAt(strData[i].length() - j - 1));
			}
			System.out.println();
		}
	}

}

//Prob3. Prob3 클래스의 main() 에서
//주어진 문자열 배열을 생성하여 
//배열의 내용을 역순으로 출력하할 수 있도록 
//main 메서드를 작성하세요. 
//
//-	문자열 배열의 내용을 역순으로 출력하되 각 문자열 또한 역순으로 출력한다.
//-	입력으로 주어진 문자열 배열의 예 :
//{ "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" }
//
//처리 결과의 예 : 아래 참고.
//gnimmargorP avaJ
//CBDJ
//g01elcarO
//telvreS/PSJ