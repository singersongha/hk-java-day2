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
            System.out.println("평균 가격: " + averagePrice);
            System.out.println("메뉴 개수: " + menuCount);
            System.out.println("총 가격: " + totalPrice);
        }

    }

    @Override
    public boolean addMenu(Food f1) {
        for (int i = 0; i < menus.length; i++) {
            if(menus[i] == null) {
                menus[i] = f1;
                totalPrice += f1.price;
                menuCount++;
                if(menuCount > 0) {
                    averagePrice += (double) totalPrice /menuCount;
                }else {
                    averagePrice = 0;
                }
                break;
            }

        }
        return false;
    }

    @Override
    public boolean removeMenu(String menu) {
        for (int i = 0; i < menus.length; i++) {
            if(menus[i] != null && menu.equals(menus[i].menu) ) {
                totalPrice -= menus[i].price;
                menus[i] = null;
                menuCount--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String getMenuArr() {

        return "";
    }
}

