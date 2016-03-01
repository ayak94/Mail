
public class Test {
	public static void main(String[] args) {
		
		Mail mail = new Mail();
		Sizes sizes = new Sizes();
		sizes.Sizewithattachment = 2.4;
		sizes.Sizewithoutattachment = 1.1;
		Input input = new Input();
		input.Sumwithattachment = 10;
		input.Sumwithoutattachment = 23;
		Send send = new Send();
		send.Size = 120;
		send.Sum = 12;
		Delete delete = new Delete();
		delete.Size = 9;
		delete.Sum = 15;
		mail.delete = delete;
		mail.input = input;
		mail.send = send;
		mail.sizes = sizes;
		
		System.out.println(mail.getDescription());
	}
		
	}

