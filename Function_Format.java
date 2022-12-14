import java.awt.*;

public class Function_Format {
    GUI gui;
    Font arial, comicSansMs, timesNewRoman;
    String selectedFont;

    public Function_Format(GUI gui){
        this.gui = gui;
    }

    public void createFont(int fontSize){
        arial = new Font("Arial", Font.PLAIN, fontSize);
        comicSansMs = new Font("Comic Sans Ms", Font.PLAIN, fontSize);
        timesNewRoman = new Font("Times New Roman", Font.PLAIN, fontSize);
        setFont(selectedFont);
    }

    public void setFont(String font){
        selectedFont = font;
        switch (selectedFont){
        case "Arial":
            gui.textArea.setFont(arial);
            break;
        case "Comic Sans MS":
            gui.textArea.setFont(comicSansMs);
            break;
        case "Times New Roman":
            gui.textArea.setFont(timesNewRoman);
            break;
        }

    }
}
