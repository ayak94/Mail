
public class Input {
public int Sumwithattachment;
public int Sumwithoutattachment;
public Sizes sizes;
public double Volumewith;
public double Volumewithout;



public double Volumewith() {
	return this.Sumwithattachment * sizes.Sizewithattachment;
}
	
public double Volumewithout() {
	return this.Sumwithoutattachment * sizes.Sizewithoutattachment;
}
}
	


