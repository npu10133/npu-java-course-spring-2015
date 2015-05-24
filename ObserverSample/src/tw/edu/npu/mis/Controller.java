
package tw.edu.npu.mis;

import java.util.Scanner;
/**
 * {@link Controller} retrieves inputs from the user.
 *
 * @author Samael Wang <freesamael@gmail.com>
 */
public class Controller {

    private final Model mModel;

    public Controller(Model model) {
        mModel = model;
    }
 /**
     * Read input and update model accordingly.
     */
    public void readInput() {
        System.out.print("Controller: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        if (!input.isEmpty()) {
            mModel.setData(input);
            
        }
    }

}
