package com.solvd.foodDelivery;

public   class Menu {
    private String menuName1;
    private String menuName2;



    public Menu(String menuName1, String menuName2) {
        this.menuName1 = menuName1;
        this.menuName2 = menuName2;

    }
    public String getMenuName1() {
        return menuName1;
    }
    public void setMenuName1(String menuName1) {
        this.menuName1 = menuName1;
    }
    public String getMenuName2() {
        return menuName2;
    }

    public void setMenuName2(String menuName2) {
        this.menuName2 = menuName2;
    }


    @Override
    public String toString() {
        return "Menu:" + menuName1 + '\'' + menuName2 + '\''  ;
    }
}

