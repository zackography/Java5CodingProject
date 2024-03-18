package java5CodingProject;

public class App {

	public static void main(String[] args) {
		
		Logger asterisk = new AsteriskLogger();
		
		asterisk.log("Hola");
		asterisk.error("Hello");
		
		Logger spaced = new SpacedLogger();
		
		spaced.log("Hola");
		spaced.error("Hello");
	}

}
