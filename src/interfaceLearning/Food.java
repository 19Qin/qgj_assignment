package interfaceLearning;

/**
 * @author Chin
 * @description
 * @date 2023/10/24 7:34 下午
 **/
public class Food {
        private String FoodName;
        private int price;

    public Food(String foodName, int price) {
        FoodName = foodName;
        this.price = price;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
