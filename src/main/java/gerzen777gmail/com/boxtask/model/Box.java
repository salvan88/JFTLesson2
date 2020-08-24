package gerzen777gmail.com.boxtask.model;

import java.util.ArrayList;

public class Box<V extends Fruit> {
    private final ArrayList <V> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    //Метод пересыпающий содержимое коробки
    public ArrayList<V> shifting(Box<?> other) {

        if (!box.get(0).getClass().equals(other.getBox().get(0).getClass())) {
            if (!box.isEmpty()) {
                box.clear();
            }
        }

        box.addAll((ArrayList<V>) other.getBox());
        other.getBox().clear();

        return box;
    }

    //Положить указанное количество объектов
    public ArrayList<V> putFruit (V typeOfFruit, int numberOfFruits) {
        for (int i = 0; i < numberOfFruits; i++) {
            box.add(typeOfFruit);
        }
        return box;
    }

    //Сравнение коробок
    public boolean compare(Box<?> other) {
        return getWeight() == other.getWeight();
    }

    //Взвешивание коробок
    public float getWeight() {
        float numberOfFruits = 0;

        for (V fruit : box) {
            numberOfFruits += fruit.getFruitWeight();
        }

        return numberOfFruits;
    }

    public ArrayList<V> getBox() {
        return box;
    }
}
