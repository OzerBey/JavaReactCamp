package homework4.core.googleEmail;

import homework4.core.EmailService;
import homework4.googleMail.GoogleMailManager;

public class GoogleMailManagerAdapter implements EmailService {

	private GoogleMailManager googleMailManager;

	public GoogleMailManagerAdapter() {
		super();
		this.googleMailManager = new GoogleMailManager();
	}

	@Override
	public void send(String email, String message) {
		googleMailManager.send(email, message);

	}

}
