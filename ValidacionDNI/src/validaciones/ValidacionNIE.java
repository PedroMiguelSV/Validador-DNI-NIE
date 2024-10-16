package validaciones;

public class ValidacionNIE {

	public static boolean validar(String NIE) {
	    boolean correct = false;
	    if (NIE.length() == 10) {

	    	char firstChar = Character.toUpperCase(NIE.charAt(0));

	        if (firstChar == 'X' || firstChar == 'Y' || firstChar == 'Z') {

	            switch (firstChar) {
	                case 'X':
	                    correct = ValidacionDNI.validar("0" + NIE.substring(1));
	                    break;
	                case 'Y':
	                    correct = ValidacionDNI.validar("1" + NIE.substring(1));
	                    break;
	                case 'Z':
	                    correct = ValidacionDNI.validar("2" + NIE.substring(1));
	                    break;
	            }
	        }
	    }
	    return correct;
	}

}
