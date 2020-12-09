package string.manipulation.pkg2;
public class StringManipulation2 {
    public static void main(String[] args) {
        toLowerCase();
        toUpperCase();
        equals();
        equalsIgnoreCase();
        trim();
        charAt();
        concat();
        length();
        
        
            }
    public static void toLowerCase(){
            String s1="UPPERCASE";
            String s2=s1.toLowerCase();
            System.out.println(s2);
           
        
    }
    public static void toUpperCase(){
	String s1 = "lowercase";
	String s2 = s1.toUpperCase();
        System.out.println(s2);
        
    }
    public static void equals(){
	String s1 = "password";
	
if (s1.equals("Password")) {
System.out.println("login successful");
} else {
System.out.println("login unsuccessful");
}
    }
    public static void equalsIgnoreCase(){
	String s1 = "Yes";
	String s2 = "No";
	
if (s1.equalsIgnoreCase("yes")) {
System.out.println("Selection successful");
} else if (s1.equalsIgnoreCase("no")) {
System.out.println("Selection unsuccessful");
} else {
System.out.println("Something went wrong");
}
    }
    public static void trim(){
	String s1 = "  Yes  ";
	String s2;
	
System.out.println(s1);
s2 = s1.trim();

System.out.println(s2);

    
    }
    public static void charAt(){
	String firstName = "Cole";
	String surname  = "Newton";
	char initial = firstName.charAt(0);

System.out.println("Hello, Mr " + initial + " "  + surname);
    }
    public static void concat(){
	String firstName = "John";
	String surname  = "Wayne";
String concat = firstName.concat(" "  + surname);

System.out.println(concat);
    }
    public static void length(){
	String password = "Special Password";
System.out.println("is your password long enough?");

if (password.length() > 20 ){
	System.out.println("yes, your password is long enough");
}
}
    
}
