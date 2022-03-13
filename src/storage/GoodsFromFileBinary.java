package storage;

import model.Goods;

import java.io.*;
import java.util.ArrayList;

public class GoodsFromFileBinary implements IGoodsData{
    @Override
    public ArrayList<Goods> readfile(ArrayList<Goods> goodsList) throws IOException {
        File file = new File("goods.txt");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            goodsList = (ArrayList<Goods>) result;
            return goodsList;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            ois.close();
            fis.close();
        }
        return new ArrayList<>();
    }

    @Override
    public void writeFile(ArrayList<Goods> goodsList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("goods.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(goodsList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
            fos.close();
        }
    }
}
