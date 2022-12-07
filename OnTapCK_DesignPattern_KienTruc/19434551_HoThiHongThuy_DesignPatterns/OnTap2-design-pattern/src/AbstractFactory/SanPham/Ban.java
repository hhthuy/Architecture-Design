package AbstractFactory.SanPham;

public class Ban implements SanPham{
	String loai;
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public String getLoai() {
		return loai;
	}
	
	public Ban(String loai) {
		super();
		this.loai = loai;
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Ban [loai=" + loai + "]";
	}
	

}
