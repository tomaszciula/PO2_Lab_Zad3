package MultiplyTable;

import Underline.Underline;

import java.util.ArrayList;
import java.util.List;

public class MultiplyTable {
    List<String> stringRows = new ArrayList<>();

    public String  draw() {
        String s = "";
        Underline underline = new Underline();
        System.out.print(underline.underline());
        //
        stringRows.add(underline.underline() + "\n");
        //
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                System.out.print("| " + ' ' + "   ");
                s += ("| " + ' ' + "   ");
            }
            else if (i < 10) {
                System.out.print("| " + i + "   ");
                s += ("| " + i + "   ");
            } else {
                System.out.print("| " + i + "  ");
                s += ("| " + i + "  ");
            }
        }
        System.out.print('|');
        s += ('|');
        stringRows.add(s + "\n");
        System.out.println();
        System.out.print(underline.underline());
        //
        stringRows.add(underline.underline() + "\n");
        //
        System.out.println();
        s = "";
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.print("| " + i + "  ");
                s += ("| " + i + "  ");
            } else {
                System.out.print("| " + i + "   ");
                s += ("| " + i + "   ");
            }
            for (int j = 1; j <= 10; j++) {
                if ((i * j) == 100) {
                    System.out.print("| " + i * j + " ");
                    s += ("| " + i * j + " ");
                } else if (i * j >= 10) {
                    System.out.print("| " + i * j + "  ");
                    s += ("| " + i * j + "  ");
                } else {
                    System.out.print("| " + i * j + "   ");
                    s += ("| " + i * j + "   ");
                }

            }
            System.out.print('|');
            s += ('|');
            stringRows.add(s + "\n");
            s = "";
            System.out.println();
            System.out.print(underline.underline());
            //
            stringRows.add(underline.underline() + "\n");
            //
            System.out.println();
        }
        //System.out.println(stringRows);
        String mtable = "";
        for (int i = 0; i < stringRows.size(); i++) {
            mtable += stringRows.get(i);
        }

 //       JOptionPane.showMessageDialog(null, mtable);
        return mtable;
    }
}
