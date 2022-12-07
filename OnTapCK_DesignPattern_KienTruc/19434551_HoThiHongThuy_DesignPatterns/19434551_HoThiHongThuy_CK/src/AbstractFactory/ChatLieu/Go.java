package AbstractFactory.ChatLieu;

public class Go implements ChatLieu{
	private String loai;
	
	
	
	public Go() {
		super();
	}



	public Go(String loai) {
		super();
		this.loai = loai;
	}



	public String getLoai() {
		return loai;
	}



	public void setLoai(String loai) {
		this.loai = loai;
	}
	


	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Go [loai=" + loai + "]";
	}
	

}
