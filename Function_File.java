import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Function_File {
    GUI gui;
    String fileName;
    String fileAddress;
    static final int MAX_CHAR = 256;
    public  Function_File(GUI gui){
        this.gui = gui;
    }
    public void newFile(){
        gui.textArea.setText("");
        gui.window.setTitle("New");
        fileName = null;
        fileAddress = null;
    }

    public void open(){
        FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);
        if(fd.getFile() != null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
            gui.textArea.setText((""));
            String line = null;
            while ((line = br.readLine()) != null){
                gui.textArea.append(line + "\n");
            }
            br.close();
        }
        catch (Exception e){
            System.out.println("FILE NOT OPENED!");
        }
    }

    public void save(){
        if(fileName == null){
            saveAs();
        }
        else{
            try{
                FileWriter fw = new FileWriter(fileAddress + fileName);
                fw.write(gui.textArea.getText());
                gui.window.setTitle(fileName);
                fw.close();
            }
            catch (Exception e){
                System.out.println("SOMETHING WENT WRONG!");
            }
        }

    }

    public void saveAs(){
        FileDialog fd = new FileDialog(gui.window, "SaveAs", FileDialog.SAVE);
        fd.setVisible(true);
        if(fd.getFile() != null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        try{
            FileWriter fw = new FileWriter(fileAddress + fileName);
            fw.write(gui.textArea.getText());
            fw.close();
        }
        catch (Exception e){
            System.out.println("SOMETHING WENT WRONG!");
        }
    }

    public void Option1(){
        int alph, spl;
        alph = spl = 0;
        char ch;
        FileDialog fd = new FileDialog(gui.window, "Lower and Special character", FileDialog.LOAD);
        fd.setVisible(true);
        if(fd.getFile() != null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
            String line = null;
            while ((line = br.readLine()) != null){
                for(int i = 0; i < line.length(); i++)
                {
                    ch = line.charAt(i);
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')  {
                        alph++;
                    }
                    else if (!Character.isAlphabetic(ch) & !Character.isDigit(ch)){
                        spl++;
                    }
                }
            }
            br.close();
            FileWriter myWriter = new FileWriter("result_option1.txt");
            myWriter.write("Number of Lowel Characters  =  " + alph );
            myWriter.write("\nNumber of Special Characters   =  " + spl);
            myWriter.close();
        }
        catch (Exception e){
            System.out.println("FILE NOT OPENED!");
        }
    }

    public void Option2(){
        FileDialog fd = new FileDialog(gui.window, "Number of occurrence words", FileDialog.LOAD);
        fd.setVisible(true);
        if(fd.getFile() != null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        try {
            Scanner scanner = new Scanner(new File(fileAddress + fileName)).useDelimiter("[^a-zA-Z]+");
            Map<String, Integer> map = new HashMap<String, Integer>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
            List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
            Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                    return a.getValue().compareTo(b.getValue());
                }
            });
            FileWriter myWriter = new FileWriter("result_option2.txt");
            for (int i = 0; i < map.size(); i++) {
                myWriter.write(entries.get(entries.size() - i - 1).getKey() + " " + entries.get(entries.size() - i - 1).getValue());
                myWriter.write("\n");
            }
            myWriter.close();
        }
        catch (Exception e){
            System.out.println("FILE NOT OPENED!");
        }

    }

    public void Option3(){
        FileDialog fd = new FileDialog(gui.window, "Number of occurrence chars", FileDialog.LOAD);
        fd.setVisible(true);
        if(fd.getFile() != null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        try {
            FileWriter myWriter = new FileWriter("result_option3.txt");
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
            String line = null;
            while ((line = br.readLine()) != null){
                int count[] = new int[MAX_CHAR];
                int len = line.length();
                for (int i = 0; i < len; i++)
                    count[line.charAt(i)]++;
                char ch[] = new char[line.length()];
                for (int i = 0; i < len; i++) {
                    ch[i] = line.charAt(i);
                    int find = 0;
                    for (int j = 0; j <= i; j++) {
                        if (line.charAt(i) == ch[j])
                            find++;
                    }
                    if (find == 1) {
                        myWriter.write(line.charAt(i) + " " + count[line.charAt(i)] + "\n");
                    }
                }
                myWriter.close();
            }
            br.close();
        }
        catch (Exception e){
            System.out.println("FILE NOT OPENED!");
        }
    }
    public void exit(){
        System.exit(0);
    }
}
