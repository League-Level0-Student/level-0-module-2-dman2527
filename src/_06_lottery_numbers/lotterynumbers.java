package _06_lottery_numbers;
import java.util.Random;
public class lotterynumbers {
public static void main(String[] args) {
	
String lotterynumber = "";
	for (int i = 0; i < 5; i++) {
	

	Random randomMaker = new Random();
 lotterynumber = randomMaker.nextInt(100)+ lotterynumber;
System.out.println(lotterynumber);
}
}
}