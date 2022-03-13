package controller;

import model.Goods;
import model.Person;
import model.Shipper;

import java.util.ArrayList;

public class GoodsManager {
    public static ArrayList<Goods> goodsList = new ArrayList<>();

    //Hiển thị danh sách:
    public static void displayAllGoods() {
        for (Goods g : goodsList) {
            System.out.println(g);
        }
    }

    //Thêm mới khách hàng
    public static void addPerson(Goods goods) {
        goodsList.add(goods);
    }

    //Lấy ra chuỗi id thành số
    public static int getPersonById(String goodsId) {
        for (int i = 0; i < goodsList.size(); i++) {
            Goods goods = goodsList.get(i);
            if (goods.getGoodsId().equals(goodsId)) {
                return i;
            }
        }
        return -1;
    }

    //Sửa khách hàng
    public static void getPersonByIndex(int index, Goods goods) {
        goodsList.set(index, goods);
    }

    //Xóa khách hàng
    public static void deletePersonByIndex(int index) {
        goodsList.remove(index);
    }
}
