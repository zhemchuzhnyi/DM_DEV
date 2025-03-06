public class BooleanExample {

    public static void main(String[] args) {
        int value = - 10;
        boolean test = value > 0; // == - это операция сравнения = - присваивания
        System.out.println(test);

        // инверсия - !
        int value1 = - 10;
        boolean test1 = value1 > 0;
        System.out.println(!test); // делает обратное - было фалсе с инверсией станет тру

        // и или
        int val = 0;
        int val1 = 10;
        boolean test2 = val != 0;
        boolean test3 = val1 > 0;
        System.out.println(test2 && test3);

    }
}
