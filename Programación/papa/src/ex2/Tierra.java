package ex2;

public class  Tierra extends Transporte {
			private String matricula;
			private short tipoCombustible;
			
			
			public Tierra(double precio,int asientos,String destino,int distancia,String matricula, short tipoCombustible) {
				super(precio,asientos,destino,distancia);
				this.matricula = matricula;
				this.tipoCombustible = tipoCombustible;
			}


			public void setTipoCombustible(short tipoCombustible) {
				this.tipoCombustible = tipoCombustible;
			}

			

			public String getMatricula() {
				return matricula;
			}


			public String getTipoCombustible() {
				String tipo;
				if (this.tipoCombustible==0) {
					tipo="Diesel";
				}else if(this.tipoCombustible==1) {
					tipo="Gasolina95";
				}else if(this.tipoCombustible==2) {
					tipo="Gasolina98";
				}else {
					tipo="Combustible no identificado";
				}
				return tipo;
			}
			
			public boolean introducirMatricula(String matricula) {
				boolean valida=false;
				char[] a_mat=matricula.toCharArray();
				if (matricula.length()==7 && Character.isDigit(a_mat[0])==true && Character.isDigit(a_mat[1])==true && Character.isDigit(a_mat[2])==true && Character.isDigit(a_mat[3])==true && Character.isDigit(a_mat[4])==false && Character.isDigit(a_mat[5])==false && Character.isDigit(a_mat[6])==false) {
					
				valida=true;
				this.matricula=matricula;
				}
				return valida;
			}
			
}
