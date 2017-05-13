package es.pack.main;

public class Pagina {

	
	public void onLoad(){
		System.out.println("Hola caracola.");
		
		cargarDatos();
	}

	private void cargarDatos() {

		
		buscarDatosSesion();
		
		tratarDatosSesion();
	}

	private void tratarDatosSesion() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void buscarDatosSesion() {
		try {
			System.out.println("Buscamos datos de sesi�n.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
