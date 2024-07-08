// 6. Design and implement a Java program that simulates the undo feature of a text editor using a stack. 
// The program should support adding text to the editor and undoing changes. The stack should store strings, each representing a version of the text. 
// Implement methods for:

// - adding text to the editor: addText(String text)
// - undoing changes: undo()
// - getting the current text: getCurrentText()



package Week14;

import java.util.Stack;
 
public class P6 {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Adding text to the editor
        editor.addText("Hello, ");
        System.out.println("Current Text: " + editor.getCurrentText());

        editor.addText("World!");
        System.out.println("Current Text: " + editor.getCurrentText());

        // Undoing the last change
        editor.undo();
        System.out.println("After undo, Current Text: " + editor.getCurrentText());

        // Undoing another change
        editor.undo();
        System.out.println("After undo, Current Text: " + editor.getCurrentText());

        // Attempting to undo when no more changes are available
        editor.undo();
    }
}

// TextEditor class to simulate a text editor with undo feature
class TextEditor {
    private Stack<String> textStack;
    private String currentText;

    // Constructor to initialize the text stack and current text
    public TextEditor() {
        textStack = new Stack<>();
        currentText = "";
    }

    // Method to add text to the editor
    public void addText(String text) {
        textStack.push(currentText);
        currentText += text;
    }

    // Method to undo the last change
    public void undo() {
        if (!textStack.isEmpty()) {
            currentText = textStack.pop();
        } else {
            System.out.println("No more actions to undo.");
        }
    }

    // Method to get the current text in the editor
    public String getCurrentText() {
        return currentText;
    }
}
