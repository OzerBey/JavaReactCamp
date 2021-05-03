package interfacesDemo;

public class Robot implements Workable, Maintainable {

	@Override
	public void work() {
		System.out.println("Our robots worked ");

	}

	@Override
	public void maintain() {
		System.out.println("The robots in maintanance");

	}

}
