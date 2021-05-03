package interfaces02;

public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("added to MySql");
	}

}
