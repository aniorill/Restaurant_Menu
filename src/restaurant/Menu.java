package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<String> menuItems = new ArrayList<>();
    public static Date lastUpdate;

    public ArrayList<String> getMenuItems(){
        return menuItems;
    }

    public void setMenuItems(ArrayList<String> aMenuItems) {
        menuItems = aMenuItems;
    }
}
