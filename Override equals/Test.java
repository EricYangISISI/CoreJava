import java.util.Map;
import java.util.HashMap;

class Test{
	public static void main(String args []){
		User u1 = new User("Tom", 12);
    	User u2 = new User("Darren", 12);
    	User u3 = new User("Tom", 12);

    	boolean b1 = u1.equals(u2);
   		boolean b2 = u1.equals(u3);

   		//test equals(Object obj)
   		System.out.println("The result of using equals to compare u1,u2,u3:");
   		System.out.println("Does U1 equals U2: " + b1 + "; U1 equals U3: " + b2);

   		//test hashCode()
		HashMap<User,String> hm = new HashMap<User,String>();


		hm.put(u1, "123abc");
		String s = hm.get(u3);
		//System.out.println(s);
	}
}