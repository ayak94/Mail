
public class Mail {

public Input input;
public Send send;
public Delete delete;
public Sizes sizes;
	

public String getDescription() {
	return " ����� ��������� = " + (input.Sumwithattachment + input.Sumwithoutattachment + send.Sum + delete.Sum) + "  ����� ����� = " + (input.Sumwithattachment * sizes.Sizewithattachment + input.Sumwithattachment * sizes.Sizewithattachment + send.Size + delete.Size) + " Mb, �� ��� �������� � ���������� = "
			+ input.Sumwithattachment + " ����� " + input.Sumwithattachment * sizes.Sizewithattachment + " Mb, � ��� �������� = " + input.Sumwithoutattachment + " ����� " + input.Sumwithattachment * sizes.Sizewithattachment +
			" Mb. ��������� ��������� = " +  send.Sum + "  ����� �����  " + send.Size+ " Mb, ��������� ��������� =  " + delete.Sum + "   ����� �����  "
			+delete.Size+ "Mb";
}
}
