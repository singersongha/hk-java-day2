package franchise;

public class Store implements StoreAction{
    private String name;
    private int openTime;
    private int closeTime;
    private Food[] menus = new Food[7];
    private double averagePrice;
    private int menuCount;
    private long totalPrice;

    public Store(String name, int openTime, int closeTime) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;

    }

    @Override
    public void print() {
        System.out.print("이름 : " + name + ", " + "오픈 시간은 "+ openTime + "시, " + "닫는 시간은 " + closeTime + "시,");
        for (int i = 0; i < menus.length; i++) {
            if(menus[i] == null) {continue;}
            System.out.print("메뉴로는 " + menus[i].menu + "가 있어요. ");
        }
    }

    @Override
    public boolean addMenu(Food f1) {
        for (int i = 0; i < menus.length; i++) {
            if(menus[i] == null) {
                menus[i] = f1;
            }
        }
        return false;
    }

    @Override
    public boolean removeMenu(String name) {
        return false;
    }

    @Override
    public String getMenuArr() {
        return "";
    }
}

