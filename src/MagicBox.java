import java.util.Random;

public class MagicBox<T> {
    public T[] items;
    private int quantity;

    public MagicBox(int quantity) {
        this.quantity = quantity;
        this.items = (T[]) new Object[quantity];
    }

    public boolean add(T item) {

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {

        int k = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
               k = items.length - i;
               break;
            }
        }

        if (k != 0 ) {
           throw new RuntimeException("Коробка не полна! Осталось заполнить " + k +  " ячеек!");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(quantity);
            return items[randomInt];
        }
    }
}


