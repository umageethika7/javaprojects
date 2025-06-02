package xyz;
import java.util.HashMap;
public class HashMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hp = new HashMap<Integer,String>();
		hp.put(1,"uma");
		hp.put(2,"anu");
		hp.put(3,"banu");
		hp.put(4,"jushu");
		hp.put(5,"anamcara");
		System.out.println(hp);
		hp.remove(3);
		System.out.println(hp);
		hp.put(3,"honey");
		System.out.println(hp);
		if(hp.containsKey(1)) {
			System.out.println("key exists");
		} else {
			System.out.println("key not exists");
		}
		if(hp.containsValue("uma")) {
			System.out.println("value exists");
		} else {
			System.out.println("value not exists");
		}
		System.out.println("All the keys are:");
		for(Integer key:hp.keySet()) {
		System.out.println(key);
		}

		System.out.println("All the values are:");
		for(String value :hp.values()) {
		System.out.println(value);
		}
		for (Integer key : hp.keySet())
		{
            System.out.println("Key: " + key + ", Value: " + hp.get(key));
        }
 
	}

}
