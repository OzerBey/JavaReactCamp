package homework4.core.githubEmail;

import homework4.core.EmailService;
import homework4.githubMail.GithubMailManager;

public class GithubMailManagerAdapter implements EmailService {

	private GithubMailManager githubMailManager;

	public GithubMailManagerAdapter() {
		super();
		this.githubMailManager = new GithubMailManager();
	}

	@Override
	public void send(String email, String message) {
		githubMailManager.send(email, message);

	}

}
