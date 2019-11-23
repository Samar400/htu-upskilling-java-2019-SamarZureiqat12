package WierTransfer;

public class WireTransfer {
	
		
	public String purpes;
	public  static double orginalIAmount;
	public static double finalAmount;
	public static double feez;

	Sender sender;
	Resever reciver;
	Curance curance;
	@Override
	public String toString() {
		String output=" Purpose "+ purpes +"sender name "+ sender.getName();
		return output;
	}
	public static double getFeez() {
		return feez;
	}
	public static void setFeez(double feez) {
		WireTransfer.feez = feez;
	}
	
	public String getPurpes() {
		return purpes;
	}
	public void setPurpes(String purpes) {
		this.purpes = purpes;
	}
	public double getOrginalIAmount() {
		return orginalIAmount;
	}
	public void setOrginalIAmount(double orginalIAmount) {
		this.orginalIAmount = orginalIAmount;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
		public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public Resever getReciver() {
		return reciver;
	}
	public void setReciver(Resever reciver) {
		this.reciver = reciver;
	}
	public Curance getCurance() {
		return curance;
	}
	public void setCurance(Curance curance) {
		this.curance = curance;
	}
	
}
