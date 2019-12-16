package day09;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("start");

		String msg = "-5";
		int num = 0;
		int res = 0;

		try {
			num = Integer.parseInt(msg);
			res = 1000 / num;
			int[] number = new int[num];
			// 자원반납코드 X
		} catch (NumberFormatException e) {
			System.out.println("문제발생 : " + e);
			System.out.println("숫자로 입력해유ㅎㅎ");
		} catch (ArithmeticException e) {
			System.out.println("0빼고 딴거루 해유");
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("문제발생~" + e);
		}finally {
		System.out.println("자원반납코드 항상 수행");
		}

		System.out.println(num);
		System.out.println(res);
		System.out.println("end");
	}
}
