package interfaces02;

public class OracleCustomerDal implements CustomerDal, Repository {

	
	@Override
	public void add() {
		System.out.println("added to Oracle");
	}
}
