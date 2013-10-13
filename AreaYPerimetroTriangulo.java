public class AreaYPerimetroTriangulo {
	public static void main(String[] args) {
		// Medidas representadas en centimetros.
		int lado = 15; 
		int base = 15;
		int altura = 40;

		int area = (base * altura) / 2;
		int perimetro = lado * 3;

		System.out.println("El area del triangulo es: " + area + "cm");
		System.out.println("El perimetro del triangulo es: " + perimetro + "cm");
	}
}

/*
Al ejecutar el progama, este imprime a la pantalla:

El area del triangulo es: 300cm
El perimetro del triangulo es: 45cm
*/
