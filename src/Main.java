public class Main {
    public static void main(String[] args) {
        UndoStringBuilder undoStringBuilder = new UndoStringBuilder("qwerty");
        undoStringBuilder.setOnChangeListener(new MyListener());
        System.out.println("======= Команда Append(до/после) =======");

        System.out.print("Char: " + undoStringBuilder.append('C')); //добавление С
        System.out.println(" " + undoStringBuilder.undo()); //отмена

        char[] c = "asdfgh".toCharArray();
        System.out.print("CharArray: " + undoStringBuilder.append(c)); //добавление CHAR
        System.out.println(" " + undoStringBuilder.undo()); //отмена

        System.out.print("CharArray с командой offset: " + undoStringBuilder.append(c, 2, 2)); //добавление двух символов из массива
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("String: " + undoStringBuilder.append("ХаХа")); //добавление надписи
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("Int: " + undoStringBuilder.append(322)); //добавление числа
        System.out.println(" " + undoStringBuilder.undo());

        System.out.print("Double: " + undoStringBuilder.append(322.123)); //добавление double числа
        System.out.println(" " + undoStringBuilder.undo());
        System.out.println();
        System.out.println("======= Команда Insert =======");
        System.out.println("До применения undo:");
        System.out.println("Изначальная строчка: " + undoStringBuilder);
        System.out.println("Boolean: " + undoStringBuilder.insert(2,true));
        System.out.println("Char: " + undoStringBuilder.insert(0, 'З'));
        System.out.println("CharArray: " + undoStringBuilder.insert(undoStringBuilder.lenght(), c));
        System.out.println("CharArray whit offset: " + undoStringBuilder.insert(undoStringBuilder.lenght(), c, 2, 2));
        System.out.println("String: " + undoStringBuilder.insert(0, "ХеХе"));
        System.out.println("Int: " + undoStringBuilder.insert(3, 333));
        System.out.println("Long: " + undoStringBuilder.insert(9, 88005553535L));
        System.out.println("Float: " + undoStringBuilder.insert(undoStringBuilder.lenght(), 54.343f));
        System.out.println("Double: " + undoStringBuilder.insert(31, 231.322));

        System.out.println("Применяем команду undo:");
        System.out.println("Строчка в данный момент:"+undoStringBuilder);
        for (int i = 0; i < 9; i++) {
            if (i==8){
                System.out.println("Финальная строчка: ");
            }
            System.out.println(undoStringBuilder.undo());
        }

        System.out.println();
        System.out.println("======Наоборот и Замена======");
        System.out.println("Изначальная строчка: " + undoStringBuilder);
        System.out.println("Наоборот: " + undoStringBuilder.reverse());
        System.out.println("Замена: " + undoStringBuilder.replace(0, 2, "TEST"));
        undoStringBuilder.setCharAt(5, 'T');
        System.out.println("Вставка символа: " + undoStringBuilder);
    }
}