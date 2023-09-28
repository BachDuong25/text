package View;

import Common.Validate;
import common.Validate;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {

    protected String title;
    protected ArrayList<T> mChon;

    public Menu() {
    }

    public Menu(String tieuDe, String[] multichoice) {
        title = tieuDe;
        mChon = new ArrayList<>();
        for (String string : multichoice) {
            mChon.add((T) string);
        }
    }
//------------------------------------------------------------

    public void display() {
        System.out.println(title);
        System.out.println("---");
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println(i + ". " + mChon.get(i));
        }
//        System.out.println("Others. Exit");
        System.out.println("---");
    }
//------------------------------------------------------------

    public int getSelected() {
        display();
        Scanner sc = new Scanner(System.in);
        Validate v = new Validate();
        int num = -1;
        do {
            try {
               System.out.print("Enter choice: ");
               String strNum = sc.nextLine();
               num = v.checkNum(strNum);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (num < 0);
  //      return sc.nextInt();
        return num;
    }
//------------------------------------------------------------
    public abstract void execute(int n);
//------------------------------------------------------------
    public void run() {
        while (true) {            
            int n = getSelected();
            execute(n);
            if(n > mChon.size() || n == 0) break;
        }
    }
}
