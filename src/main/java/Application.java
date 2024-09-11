import creator.Dialog;
import creator.HTMLDialog;
import creator.WindowsDialog;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String osSystem = sc.nextLine();;

        Dialog dialog;

        if(osSystem.equalsIgnoreCase("WINDOWS")){
            dialog = new WindowsDialog();
        } else if(osSystem.equalsIgnoreCase("HTML")){
            dialog = new HTMLDialog();
        } else
            throw new Exception("Error! Unknown operating system.");

        System.out.println("----------------Starting the APPLICATION----------------");
        dialog.render();
        System.out.println("----------------Ending the APPLICATION----------------");

    }
}
