abstract class UIControl {
    public abstract void draw();
    public abstract void handleEvent(String event);
    public abstract String getName();
}

class Button extends UIControl {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Button with label \"" + label + "\"");
    }

    @Override
    public void handleEvent(String event) {
        if (event.equals("click")) {
            System.out.println("Button \"" + label + "\" clicked");
        }
    }

    @Override
    public String getName() {
        return "Button";
    }
}

class TextBox extends UIControl {
    private String text;

    public TextBox() {
        this.text = "";
    }

    @Override
    public void draw() {
        System.out.println("Drawing TextBox with current text \"" + text + "\"");
    }

    @Override
    public void handleEvent(String event) {
        if (event.startsWith("textChange:")) {
            text = event.substring(11);
            System.out.println("TextBox text changed to: \"" + text + "\"");
        }
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}

class ColorPicker extends UIControl {
    private String selectedColor;

    public ColorPicker() {
        this.selectedColor = "Black";
    }

    @Override
    public void draw() {
        System.out.println("Drawing ColorPicker with selected color \"" + selectedColor + "\"");
    }

    @Override
    public void handleEvent(String event) {
        if (event.startsWith("colorSelected:")) {
            selectedColor = event.substring(14);
            System.out.println("ColorPicker color changed to: \"" + selectedColor + "\"");
        }
    }

    @Override
    public String getName() {
        return "ColorPicker";
    }
}

class UIPanel {
    private UIControl[] controls;

    public UIPanel(UIControl[] controls) {
        this.controls = controls;
    }

    public void drawAll() {
        System.out.println("// Calling drawAll() on the UIPanel");
        for (UIControl control : controls) {
            control.draw();
        }
    }
}

public class UIFrameworkTest {
    public static void main(String[] args) {
        UIControl[] controls = {
                new Button("Draw"),
                new TextBox(),
                new ColorPicker()
        };

        UIPanel panel = new UIPanel(controls);
        panel.drawAll();
    }
}
