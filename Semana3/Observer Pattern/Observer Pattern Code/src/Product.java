import java.util.ArrayList;
import java.util.List;


public class Product {
	private String name;
    private int stock;
    private List<Observer> observers = new ArrayList<>();

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStock(int stock) {
        this.stock = stock;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, stock);
        }
    }
}
