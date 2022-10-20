package seleccionFesac;

public class Medico extends SeleccionFESAC {
			private String titulacion;
			private int aniosExperiencia;		
			
			public Medico(String titulacion, int aniosExperiencia) {
				super();
				this.titulacion = titulacion;
				this.aniosExperiencia = aniosExperiencia;
			}

			public String getTitulacion() {
				return titulacion;
			}

			public void setTitulacion(String titulacion) {
				this.titulacion = titulacion;
			}

			public int getAniosExperiencia() {
				return aniosExperiencia;
			}

			public void setAniosExperiencia(int aniosExperiencia) {
				this.aniosExperiencia = aniosExperiencia;
			}	
}
