package designing;

public class Mailer {
	
	public void from(final String address) {}
	
	public void to(final String address) {}
	
	public void subject(final String line) {}
	
	public void body(final String message) {}
	
	public void send() {
		System.out.println("Sending ...");
	}

	public static void main(String[] args) {
		Mailer mailer = new Mailer();
		mailer.from("test@domn.cc");
		mailer.to("test@fee.sd");
		mailer.subject("test");
		mailer.body("dfee");
		mailer.send();

	}

}
