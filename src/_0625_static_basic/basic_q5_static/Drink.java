package _0625_static_basic.basic_q5_static;

class Drink {
    private String name;
    private int cost;
    private int count;

    public Drink(String name, int cost, int count) {
        this.name = name;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }

    public void purchase() {
        if (count > 0) {
            count--;
        }
    }
}

