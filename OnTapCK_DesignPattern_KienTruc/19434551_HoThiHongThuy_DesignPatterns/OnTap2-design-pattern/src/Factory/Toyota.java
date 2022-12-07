package Factory;

public class Toyota implements Car{
	 private String thongTinXe;
	 private String cauHinh;
	 private String nsx;
	 private String tinhNang;
	
	public String getThongTinXe() {
		return thongTinXe;
	}
	public void setThongTinXe(String thongTinXe) {
		this.thongTinXe = thongTinXe;
	}
	public String getCauHinh() {
		return cauHinh;
	}
	public void setCauHinh(String cauHinh) {
		this.cauHinh = cauHinh;
	}
	public String getNsx() {
		return nsx;
	}
	public void setNsx(String nsx) {
		this.nsx = nsx;
	}
	public String getTinhNang() {
		return tinhNang;
	}
	public void setTinhNang(String tinhNang) {
		this.tinhNang = tinhNang;
	}
	@Override
	public void getInfo(String thongTinXe, String cauHinh, String nsx, String tinhNang) {
		// TODO Auto-generated method stub
		this.thongTinXe = thongTinXe;
		this.cauHinh = cauHinh;
		this.nsx = nsx;
		this.tinhNang = tinhNang;
	}
	 

}
