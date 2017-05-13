package es.pack.main;

public class Pagina {

	
	public void onLoad(){
		System.out.println("Hola caracola.");
		
		cargarDatos();
	}

	private void cargarDatos() {

		
		buscarDatosSesion();
		
	}

	private void buscarDatosSesion() {
		try {
			System.out.println("Buscamos datos de sesión.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
