package interfaces02;

public class SqlServerCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("added to SqlServer");

	}

}
