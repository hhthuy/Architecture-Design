package AbstractFactory;

import AbstractFactory.ChatLieu.ChatLieu;
import AbstractFactory.SanPham.Ban;
import AbstractFactory.SanPham.Ghe;
import AbstractFactory.SanPham.SanPham;

public class SanPhamFactory extends AbstractFactory{

	@Override
	ChatLieu getChatLieu(String chatLieu, String loai) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	SanPham getSanPham(String sanPham, float chieuDai, float chieuRong, float chieuCao) {
		// TODO Auto-generated method stub
		if (sanPham == null) {
			return null;
		}
		if (sanPham.equalsIgnoreCase("Ban")) {
			return new Ban(chieuDai,chieuRong,chieuCao);
		} else if (sanPham.equalsIgnoreCase("Ghe")) {
			return new Ghe(chieuDai,chieuRong,chieuCao);
		}
		return null;
	}

}
