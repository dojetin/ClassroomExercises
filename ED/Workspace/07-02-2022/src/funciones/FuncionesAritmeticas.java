package funciones;

public class FuncionesAritmeticas {
	private static Integer num1;
	private static Integer num2;

	
	public static int maximoComunDivisor() {
        int temporal;//Para no perder b
        int a=num1;
        int b=num2;
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
	
	public static int minimoComunMultiplo() {
        // Y ahora aplicamos la fórmula que dice:
        // MCM(a, b) = (a * b) / MCD(a, b)
        int a=num1;
        int b=num2;
        return (a * b) / maximoComunDivisor();
    }
	
	public FuncionesAritmeticas() {
		super();
	}

	public FuncionesAritmeticas(Integer num1, Integer num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "FuncionesAritmeticas [num1=" + num1 + ", num2=" + num2 + "]";
	}
}	
