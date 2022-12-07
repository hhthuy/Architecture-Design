package AbstractFactory.SanPham;

public class Ban implements SanPham{
	private float chieuDai;
	private float chieuRong;
	private float chieuCao;
	

	public Ban() {
		super();
	}


	public Ban(float chieuDai, float chieuRong, float chieuCao) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Ban [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", chieuCao=" + chieuCao + "]";

	}

	
	
	
}
