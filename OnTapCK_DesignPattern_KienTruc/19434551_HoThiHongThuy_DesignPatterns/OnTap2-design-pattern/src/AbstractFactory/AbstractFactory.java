package AbstractFactory;

import AbstractFactory.ChatLieu.ChatLieu;
import AbstractFactory.SanPham.SanPham;

public abstract class AbstractFactory {
	abstract ChatLieu getChatLieu(String chatlieu, String loai);
	abstract SanPham getSanPham(String sanpham,String loai);
}
