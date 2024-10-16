package validaciones;

public class ValidacionDNI {
	

	public static boolean validar(String DNI) {
	    boolean correct = false;
	    try {
	        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	        if (DNI.length() == 10) {
	            String numStr = DNI.substring(0, 8);
	            int num = Integer.parseInt(numStr);
	            char letra = Character.toUpperCase(DNI.charAt(9));
	            int resto = num % 23;
	            if (resto >= 0 && resto < 23) {
	                if (letra == letrasDNI[resto]) {
	                    correct = true;
	                }
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    return correct;
	}

}
