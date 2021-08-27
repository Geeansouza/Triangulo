package novoProjeto;

import java.util.Scanner;

public class novoProjeto {


	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double x,y,z;
		System.out.println("Valor do primeiro lado");
		x = leitor.nextInt();
		System.out.println("Valor do segundo lado");
		y = leitor.nextInt();
		System.out.println("Valor do terceiro lado");
		z = leitor.nextInt();
		leitor.close();
		
		if (x < y + z || y < x + z || z < x+y){
			System.out.println("Trata-se de um triangulo");
		}



		if (x == y && x == z){
			System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
		}else if(x == y || x == z){
			System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
			}else
			System.out.println("Três lados diferentes. Trata-se de um Triangulo Escaleno");
		


	}
		
}		
		
		
	


