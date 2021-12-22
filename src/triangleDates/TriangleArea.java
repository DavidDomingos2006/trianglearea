package triangleDates;

import java.util.Scanner;

import entities.Triangle;

public class TriangleArea {
	
	public static void main (String[] args) {
		
		Triangle x,y;
		double p, areaX, areaY;
		x = new Triangle();
		y = new Triangle();
		
		//o x e o y são objetos da classe Triangle. funcionam muito parecidos com ponteiros
		//que apontam para um atributo ou metodo.
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Enter the meansure of triangle X");
		x.a = tec.nextDouble();
		x.b = tec.nextDouble();
		x.c = tec.nextDouble();
		System.out.println("Enter the meansure of triangle Y");
		y.a = tec.nextDouble();
		y.b = tec.nextDouble();
		y.c = tec.nextDouble();
		
		
		areaX = x.area();
		
		
		areaY = y.area();
		
		System.out.printf("Area x: %.4f \n", areaX);
		System.out.printf("Area y: %.4f \n", areaY);
		
		if(areaX>areaY) {
			System.out.printf("Larger area: %.2f \n", areaX);
		}else {
			System.out.printf("Larger area: %.2f \n", areaY);
		}
		
		tec.close();
			
	}

}
