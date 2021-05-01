package homework2.Business;

import homework2.Entities.User;

public class UserManager { // Base manager class

	public void sendPhoto(User user) {
		System.out.println(user.getId() + ". user sent photo ");
	}

	public void doComment(User user) {
		System.out.println(user.getId() + ". user commmented ");
	}

	public void showProfile(User user) {
		System.out.println("Profile of number " + user.getId() + " user showed ");
	}

	public void editComment() {
		System.out.println("Your comment edited :)");
	}
}
