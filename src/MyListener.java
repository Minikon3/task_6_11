class MyListener implements OnStringBuilderChangeListener {
    /*
        Определяем метод onChange
        В него передаётся stringBuilder, который "прослушивается"
     */
    public void onChange(UndoStringBuilder stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}