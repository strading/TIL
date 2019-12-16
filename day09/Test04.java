package day09;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {
		Controller cmd = null;

		Controller insert =() ->System.out.println("inser 수행");
		Controller update =() ->System.out.println("update 수행");
		Controller delete =() ->System.out.println("delete 수행");
		
		String msg = JOptionPane.showInputDialog("명령을 입력하세요.	1.Delete 2.Insert 3.Update ");
		switch (msg) {
		case "1":
		case "insert":
			cmd = insert;
			break;
		case "2":
		case "update":
			cmd = update;
			break;
		case "3":
		case "delete":
			cmd = delete;
			break;
		default:
			System.out.println("명령 선택을 다시하세요.");
			break;
		}
		if(cmd != null) {
			cmd.exec();
		}
	}
}

