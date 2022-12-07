package AbstractFactory;

import AbstractFactory.ChatLieu.ChatLieu;
import AbstractFactory.SanPham.SanPham;

public abstract class AbstractFactory {
//	abstract ChatLieu getChatLieu(String chatlieu, String loai);
//	abstract SanPham getSanPham(String sanpham,String loai);
	abstract ChatLieu getChatLieu(String chatLieu, String loai);
	abstract SanPham getSanPham(String sanPham, float chieuDai, float chieuRong,float chieuCao );
	
}
