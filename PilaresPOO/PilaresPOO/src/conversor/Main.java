package conversor;

import java.util.Scanner;

import conversor.Centimetro;
import conversor.Metro;

public class Main {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		Scanner op = new Scanner(System.in);
		
		System.out.println("Unidade para converter: ");
		
		System.out.println("1) Metro - Centimetro ");
		System.out.println("2) Centimetro - Metro ");
		int opc = op.nextInt();
		
		System.out.println("Valor a converter: ");
		float vlr = valor.nextFloat();
		
		switch(opc) {
			case 1:
				System.out.println("Metro -> Centimetro ");
				Metro mt = new Metro();
				mt.setNum1(vlr);
				System.out.println(mt.conversorUnidade() );
				break;
				
			case 2:
				System.out.println("Centimetro -> Metro ");
				Centimetro cm = new Centimetro();
				cm.setNum1(vlr);
				System.out.println(cm.conversorUnidade() );
				break;
				
				default: System.out.println("Opçao invalida!");
				
		}
		
		
	}

}
