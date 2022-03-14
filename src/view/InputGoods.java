package view;

import controller.GoodsManager;
import model.Goods;

import java.util.List;
import java.util.Scanner;

public class InputGoods {
    private static List<Goods> goodsListClient = GoodsManager.goodsList;

    public static Goods createNewGoods(){
        ValidateGoods valid = new ValidateGoods();

        System.out.println("Input the id goods: ");
        String id = valid.checkNullString();

        System.out.println("Input the name goods: ");
        String name = valid.checkNullString();

        System.out.println("Input the price goods: ");
        double price = valid.checkDouble();

        Scanner inputAmount = new Scanner(System.in);
        System.out.println("Input the amount goods: ");
        int amount = inputAmount.nextInt();

        Goods g = new Goods(id, name, price, amount);
        return g;
    }

    public static void editGoodsById(){
        ValidateGoods valid = new ValidateGoods();
        System.out.println("Input Goods's need edit: ");
        String id = valid.checkNullString();
        int check = -1;
        if (GoodsManager.getGoodsById(id) == check) {
            System.err.println("Can't find the id!");
        }else {
            int index = GoodsManager.getGoodsById(id);
            if(goodsListClient.get(index) instanceof Goods){
                System.out.println("Editing Goods...");
                System.out.println("Edit id goods: " + "(" + goodsListClient.get(index).getGoodsId() + ")");
                String editId = valid.checkNullString();

                System.out.println("Edit name goods: " + "(" + goodsListClient.get(index).getProductName() + ")");
                String editName = valid.checkNullString();

                System.out.println("Edit price goods: " + "(" + goodsListClient.get(index).getPrice() + ")");
                double editPrice = valid.checkDouble();

                Scanner edit = new Scanner(System.in);
                System.out.println("Edit amount goods: " + "(" + goodsListClient.get(index).getAmount() + ")");
                int editAmount = edit.nextInt();

                Goods g = new Goods(editId, editName, editPrice, editAmount);
                GoodsManager.editGoodsByIndex(index, g);
            }
        }
    }

    public static void deleteGoodsByIndex(){
        ValidateGoods valid = new ValidateGoods();
        System.out.println("Input Goods's id need remove: ");
        String id = valid.checkNullString();
        int index = GoodsManager.getGoodsById(id);
        GoodsManager.deleteGoodsByIndex(index);
    }
}
