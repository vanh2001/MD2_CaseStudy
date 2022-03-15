package controller;

import model.Goods;
import storage.GoodsFromFileBinary;
import storage.IGoodsData;

import java.io.IOException;
import java.util.ArrayList;

public class GoodsManager {
    public static IGoodsData goodsData = new GoodsFromFileBinary();
    public static ArrayList<Goods> goodsList = new ArrayList<>();

    //Hiển thị danh sách:
    public static void displayAllGoods() {
        for (Goods g : goodsList) {
            System.out.println(g);
        }
    }

    //Thêm mới khách hàng
    public static void addGoods(Goods goods) {
        goodsList.add(goods);
        try {
            goodsData.writeFile(goodsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Lấy ra chuỗi id thành số
    public static int getGoodsById(String goodsId) {
        for (int i = 0; i < goodsList.size(); i++) {
            Goods goods = goodsList.get(i);
            if (goods.getGoodsId().equals(goodsId)) {
                return i;
            }
        }
        return -1;
    }

    //Sửa khách hàng
    public static void editGoodsByIndex(int index, Goods goods) {
        goodsList.set(index, goods);
        try {
            goodsData.writeFile(goodsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Xóa khách hàng
    public static void deleteGoodsByIndex(int index) {
        goodsList.remove(index);
        try {
            goodsData.writeFile(goodsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
