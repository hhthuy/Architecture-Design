package AbstractFactory;

import AbstractFactory.ChatLieu.ChatLieu;
import AbstractFactory.ChatLieu.Go;
import AbstractFactory.ChatLieu.Nhua;
import AbstractFactory.SanPham.Ban;
import AbstractFactory.SanPham.Ghe;
import AbstractFactory.SanPham.SanPham;

public class ChatLieuFactory extends AbstractFactory {

	@Override
	ChatLieu getChatLieu(String chatLieu, String loai) {
		// TODO Auto-generated method stub
		if (chatLieu == null) {
			return null;
		}
		if (chatLieu.equalsIgnoreCase("Nhua")) {
			return new Nhua(loai);
		} else if (chatLieu.equalsIgnoreCase("Go")) {
			return new Go(loai);
		}
		return null;
	}

	@Override
	SanPham getSanPham(String sanPham, float chieuDai, float chieuRong, float chieuCao) {
		// TODO Auto-generated method stub
		return null;
	}

}
