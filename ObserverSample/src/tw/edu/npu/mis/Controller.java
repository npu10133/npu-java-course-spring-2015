
package tw.edu.npu.mis;

import java.util.Scanner;

public class Controller {

    private final Model mModel;

    public Controller(Model model) {
        mModel = model;
    }

    public void readInput() {
        System.out.print("Controller: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        if (!input.isEmpty()) {
            mModel.setData(input);
            
        }
    }

}
