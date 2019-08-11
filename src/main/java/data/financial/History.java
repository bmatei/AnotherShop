package data.financial;

import java.util.ArrayList;

public class History {
    private ArrayList<Purchase> data;

    public History(){
    }

    public History(ArrayList<Purchase> data) {
        this.data = data;
    }

    public ArrayList<Purchase> getData() {
        return data;
    }

    public void setData(ArrayList<Purchase> data) {
        this.data = data;
    }
}