package interfacesDemo;

public class Worker implements Workable, Eatable, Payable {

	@Override
	public void work() {
		System.out.println("Our worker worked ");
	}

	@Override
	public void eat() {
		System.out.println("Our worker ate ");

	}

	@Override
	public void pay() {
		System.out.println("We paid to our worker ");

	}

}
