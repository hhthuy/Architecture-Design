package AbstractFactory;

import AbstractFactory.ChatLieu.ChatLieu;
import AbstractFactory.ChatLieu.Go;
import AbstractFactory.ChatLieu.Nhua;
import AbstractFactory.SanPham.SanPham;

public class ChatLieuFactory extends AbstractFactory {

	@Override
	ChatLieu getChatLieu(String chatlieu, String loai) {
		// TODO Auto-generated method stub
		if (chatlieu == null) {
			return null;
		}
		if (chatlieu.equalsIgnoreCase("Nhua")) {
			return new Nhua(loai);
		} else if (chatlieu.equalsIgnoreCase("Go")) {
			return new Go(loai);
		}
		return null;
	}

	@Override
	SanPham getSanPham(String sanpham, String loai) {
		// TODO Auto-generated method stub
		return null;
	}

}
