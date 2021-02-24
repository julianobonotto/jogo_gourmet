package messages;

import java.util.*;

public class Food {
    private static Food INSTANCE = new Food();
    private List<String> list;
    private HashMap<String, String> hashMapNewFoodPair = new HashMap<>();

    private Food() {
        list = Arrays.asList("massa", "Bolo de Chocolate");
        hashMapNewFoodPair.put("massa", "Lasanha");
        hashMapNewFoodPair.put("Bolo de Chocolate", "Bolo de Chocolate");

    }

    public static Food getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Food();
        }
        return INSTANCE;
    }

        public void addItemToFoodList (String food){
            if (Objects.nonNull(food)) {
                List<String> list = new ArrayList<>();
                list.addAll(this.list);
                list.remove("Bolo de Chocolate");
                list.add(food);
                list.add("Bolo de Chocolate");
                this.setList(list);
            }
        }

        public void addItemTohashMapNewFoodPair(String newFood, String newFoodToList) {
            hashMapNewFoodPair.put(newFood, newFoodToList);
        }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getFoodItemFromList(Integer index) {
        return list.get(index);
    }

    public List<String> getList() {
        return list;
    }

    public HashMap<String, String> getHashMapNewFoodPair() {
        return hashMapNewFoodPair;
    }

    public void setHashMapNewFoodPair(HashMap<String, String> hashMapNewFoodPair) {
        this.hashMapNewFoodPair = hashMapNewFoodPair;
    }
}
