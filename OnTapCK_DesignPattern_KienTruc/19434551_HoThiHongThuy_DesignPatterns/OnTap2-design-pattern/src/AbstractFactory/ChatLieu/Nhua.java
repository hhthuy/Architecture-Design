package AbstractFactory.ChatLieu;

public class Nhua implements ChatLieu{
	String loai;
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String getLoai() {
		return loai;
	}
	
	public Nhua(String loai) {
		super();
		this.loai = loai;
	}
	
//	@Override
//	public String toString() {
//		return "Nhua [loai=" + loai + "]";
//	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Nhua [loai=" + loai + "]";
	}
	

}
