package pizza;

import java.util.List;

public abstract class Pizza {

    private double cost;
    private List<String> components;

    Pizza(double cost, List<String> components) {
        this.cost = cost;
        this.components = components;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }
}
