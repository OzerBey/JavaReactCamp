package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	// mernis check system url :
	// https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		boolean resultMernis;
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		resultMernis = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong("01234567890"), // Tc
				"YASİN", // name
				"ÖZER", // surname
				1998); // year of birth
		System.err.println("Result of query: " + (resultMernis ? "Person is a real " : "Not a real person"));
	}
}