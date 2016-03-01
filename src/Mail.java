
public class Mail {

public Input input;
public Send send;
public Delete delete;
public Sizes sizes;
	

public String getDescription() {
	return " Всего сообщений = " + (input.Sumwithattachment + input.Sumwithoutattachment + send.Sum + delete.Sum) + "  общим весом = " + (input.Sumwithattachment * sizes.Sizewithattachment + input.Sumwithattachment * sizes.Sizewithattachment + send.Size + delete.Size) + " Mb, из них входящих с вложениями = "
			+ input.Sumwithattachment + " весом " + input.Sumwithattachment * sizes.Sizewithattachment + " Mb, а без вложений = " + input.Sumwithoutattachment + " весом " + input.Sumwithattachment * sizes.Sizewithattachment +
			" Mb. Исходящих сообщений = " +  send.Sum + "  общим весом  " + send.Size+ " Mb, удаленных сообщений =  " + delete.Sum + "   общим весом  "
			+delete.Size+ "Mb";
}
}
