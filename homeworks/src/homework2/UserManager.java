package homework2;

public class UserManager { // Base manager class

	public void sendPhoto(User user) {
		System.out.println(user.getFirstName() + " sent photo");
	}

	public void doComment(User user) {
		System.out.println(user.getFirstName() + " commmented");
	}

	public void showProfile(User user) {
		System.out.println("Profile of "+user.getFirstName()+" showed");
	}
}
