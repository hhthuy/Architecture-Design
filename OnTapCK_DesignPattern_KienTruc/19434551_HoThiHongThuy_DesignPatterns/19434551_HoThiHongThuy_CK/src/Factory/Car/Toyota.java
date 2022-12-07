package Factory.Car;

public class Toyota implements Car{
	private String maxe;
	private String cauHinh;
	private String nhaSX;
	private String tinhNang;

	@Override
	public void getInfo(String maxe, String cauHinh, String nhaSX, String tinhNang) {
		this.maxe = maxe;
		this.cauHinh = cauHinh;
		this.nhaSX = nhaSX;
		this.tinhNang = tinhNang;
		System.out.println(toString());
		
	}
	
	@Override
	public String toString() {
		return "Toyota [maxe=" + maxe + ", cauHinh=" + cauHinh + ", nhaSX=" + nhaSX + ", tinhNang=" + tinhNang + "]";
	}

	//Contructor
	public Toyota(String maxe, String cauHinh, String nhaSX, String tinhNang) {
		super();
		this.maxe = maxe;
		this.cauHinh = cauHinh;
		this.nhaSX = nhaSX;
		this.tinhNang = tinhNang;
	}
	public Toyota() {
		super();
	}
	//get/set
	public String getXe() {
		return maxe;
	}
	public void setXe(String maxe) {
		this.maxe = maxe;
	}
	public String getCauHinh() {
		return cauHinh;
	}
	public void setCauHinh(String cauHinh) {
		this.cauHinh = cauHinh;
	}
	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}
	public String getTinhNang() {
		return tinhNang;
	}
	public void setTinhNang(String tinhNang) {
		this.tinhNang = tinhNang;
	}
}
