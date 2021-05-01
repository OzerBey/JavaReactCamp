package homework2.Business;

import homework2.Entities.User;

public class UserManager { // Base manager class

	public void sendPhoto(User user) {
		System.out.println(user.getFirstName() + " sent photo");
	}

	public void doComment(User user) {
		System.out.println(user.getFirstName() + " commmented");
	}

	public void showProfile(User user) {
		System.out.println("Profile of " + user.getFirstName() + " showed");
	}

	public void editComment() {
		System.out.println("Your comment edited :)");
	}
}
