public class TextEditor {
    public TextEditor openTextEditor() {
        TextEditor notePad = new TextEditor();
        return notePad;
    }
    public void writeIntoTextEditor(String enterText) {
        System.out.println(enterText);
    }
    public void closeTextEditor() {
        System.out.println("Text Editor Closed");
    }
}
