package Lista2;

public class Q6
{
	public static void main(String[] args) {
		int raio=5;
		double area= Math.PI*Math.pow(raio,2);
        String formatarea = String.format("%.2f", area);
		System.out.println("A área do círculo é aproximadamente "+formatarea);

	}
}
