package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean resultMernis = kpsPublicSoapProxy.TCKimlikNoDogrula(
				Long.parseLong("25712344648"), //Tc
				"FAHRİ", //name
				"ÖZER", //surname
				1996); //year of birth
		System.err.println("Result of query: " + (resultMernis ? "Person is a real " : "Not a real person"));
	}

}
