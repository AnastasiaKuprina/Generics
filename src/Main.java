public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<Integer>(4);

        // демонстрация для int
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Коробка свободна, элемент сохранен: " + magicBox.add(i));
        }

        System.out.println("Случайный элемент int-массива: " + magicBox.pick());


        // демонстрация для String
        MagicBox<String> magicBoxS = new MagicBox<String>(4);
        System.out.println("\n" + "Коробка свободна, элемент сохранен: " + magicBoxS.add("Иван"));
        System.out.println("Коробка свободна, элемент сохранен: " + magicBoxS.add("Петр"));
        System.out.println("Коробка свободна, элемент сохранен: " + magicBoxS.add("Федор"));
        System.out.println("Коробка свободна, элемент сохранен: " + magicBoxS.add("Мария"));
        System.out.println("Коробка свободна, элемент сохранен: " + magicBoxS.add("Анна"));

       System.out.println("Случайный элемент String-массива: " + magicBoxS.pick());
    }
}