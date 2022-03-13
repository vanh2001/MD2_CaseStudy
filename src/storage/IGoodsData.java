package storage;

import model.Goods;
import model.Person;

import java.io.IOException;
import java.util.ArrayList;

public interface IGoodsData {
    ArrayList<Goods> readfile(ArrayList<Goods> goodsList) throws IOException;

    void writeFile(ArrayList<Goods> goodsList) throws IOException;
}
