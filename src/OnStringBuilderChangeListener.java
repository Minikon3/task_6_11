/**
 Слушатель.
 Каждый раз, когда меняется связанный с ним UndoStringBuilder,
 вызывается метод onChange().
 */
interface OnStringBuilderChangeListener {
    public void onChange(UndoStringBuilder stringBuilder);
}