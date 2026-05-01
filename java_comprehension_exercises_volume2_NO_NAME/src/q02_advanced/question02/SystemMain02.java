package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		System.out.println("===会員情報を表示します===");

		try {
			ConsoleReader reader = new ConsoleReader();

			Member miura = Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2);
			Member sato = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

			List<Member> members = new ArrayList<>();
			members.add(miura);
			members.add(sato);

			MemberManager.showAllMembers(members);

			System.out.println("===パスワードを変更します===");
			System.out.println("input target id>>");
			int targetId = reader.inputNumber();

			System.out.println("input new password>>");
			String newPassword = reader.inputString();

			MemberManager.updatePassword(members, targetId, newPassword);

			MemberManager.showAllMembers(members);

		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}
	}

}//
