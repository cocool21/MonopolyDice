import java.util.Random;
public class MonopolyDice {

	public static void main(String[] args) {
		Random rnd=new Random();
		int num1=1+rnd.nextInt(6);
		int num2=1+rnd.nextInt(6);
		System.out.println("User rolls "+ num1+" & "+num2);
		if(num1==num2){
		System.out.println("DOUBLES!");	
		System.out.println("Move "+(num1+num2)+" Spaces and roll again getting...");
		int num3=1+rnd.nextInt(6);
		int num4=1+rnd.nextInt(6);
		System.out.println("User rolls "+ num3+" & "+num4);
		if(num3==num4){
			System.out.println("DOUBLES!");	
			System.out.println("Move "+(num3+num4)+" Spaces and roll again getting...");
			int num5=1+rnd.nextInt(6);
			int num6=1+rnd.nextInt(6);
			System.out.println("User rolls "+ num5+" & "+num6);
			if(num5==num6){
				System.out.println("DOUBLES!");	
				System.out.println("GO TO JAIL --->");
			}else{
				System.out.println("Move "+(num5+num6)+" Spaces and stop");
			}
		}else{
			System.out.println("Move "+(num3+num4)+" Spaces and stop");	
		}
		
		}else{
		System.out.println("Move "+(num1+num2)+" Spaces and stop");
		}

	}

}
