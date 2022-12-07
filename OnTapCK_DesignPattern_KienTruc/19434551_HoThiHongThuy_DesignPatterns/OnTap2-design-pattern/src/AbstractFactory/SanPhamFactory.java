package AbstractFactory;

import AbstractFactory.ChatLieu.ChatLieu;
import AbstractFactory.ChatLieu.Go;
import AbstractFactory.ChatLieu.Nhua;
import AbstractFactory.SanPham.Ban;
import AbstractFactory.SanPham.Ghe;
import AbstractFactory.SanPham.SanPham;

public class SanPhamFactory extends AbstractFactory {

	@Override
	ChatLieu getChatLieu(String chatlieu, String loai) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	SanPham getSanPham(String sanpham, String loai) {
		// TODO Auto-generated method stub
		if (sanpham == null) {
			return null;
		}
		if (sanpham.equalsIgnoreCase("Ban")) {
			return new Ban(loai);
		} else if (sanpham.equalsIgnoreCase("Ghe")) {
			return new Ghe(loai);
		}
		return null;
	}

}
