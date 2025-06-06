package xyz;
import java.util.ArrayList;
public class ArrayListCartoon {

	public static void main(String[] args) {
		ArrayList<String> alc =new ArrayList<String>();
		alc.add("Doraman");
		alc.add("Mickey mouse");
		alc.add("Dora");
		alc.add("Bujji");;
		alc.add("Bugs bunny");
		System.out.println(alc);
		alc.remove(1);
		System.out.println(alc);
		alc.set(3,"Scooby-Doo");
		System.out.println(alc);
		for(String cartoon:alc) {
			System.out.println(cartoon);
		}
		
		

	}

}
