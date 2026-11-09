package org.example;

public class Restaurant {
    //HAS-A Restaurant HAS-A menu
    private Menu menu;

    public Restaurant(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
