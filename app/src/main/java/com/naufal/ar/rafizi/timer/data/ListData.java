package com.naufal.ar.rafizi.timer.data;

import java.util.ArrayList;

public class ListData {
    private static String[] heroNames = {
            "Ahmad Dahlan",
            "Ahmad Yani",
            "Sutomo",
            "Gatot Soebroto",
            "Ki Hadjar Dewantarai",
            "Mohammad Hatta",
            "Soedirman",
            "Soekarno",
            "Soepomo",
            "Tan Malaka"
    };
    static ArrayList<ModelList> getListData() {
        ArrayList<ModelList> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            ModelList listModel = new ModelList();
            listModel.setName(heroNames[position]);
            list.add(listModel);
        }
        return list;
    }
}
