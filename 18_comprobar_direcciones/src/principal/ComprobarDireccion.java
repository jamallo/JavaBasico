package principal;


public class ComprobarDireccion {

	public static void main(String[] args) {
		String direcciones [] = {
				"swer@gmail.com",
				"asqq@hotmail.com",
				"ddd@microsoft.es",
				"arbn@gmail.com",
				"nnnn@hotmail.es",
				"print@gmail.com"
		};
		
		// Indicar cuantas direcciones son de gmail y cuantas direcciones son de dominio.es
		int gmail = 0;
		int es = 0;
		
		for (String dir:direcciones) {
			if(dir.endsWith(".es")) {
				es++;
				
			} 
			if (dir.indexOf("gmail")!=-1) {
				gmail++;
			}
		}
		System.out.println("gmail está " + gmail);
		System.out.println(".es está " + es);

	}

}
