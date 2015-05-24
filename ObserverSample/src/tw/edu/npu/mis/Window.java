
package tw.edu.npu.mis;

import java.util.ArrayList;
import java.util.List;
/**
 * Simulate Window objects in GUI toolkits.
 *
 * @author Samael Wang <freesamael@gmail.com>
 */

public class Window {

    private Controller mController;
    private List<View> mInvalidViews;
 /**
     * Start the event loop.
     *
     * @param c The controller.
     * @param views The views to draw on the first loop.
     */
  
    public void startEventLoop(Controller c, List<View> views) {
        mController = c;
        mInvalidViews = new ArrayList<>(views);

        // Simulate how an event loop works.
        while (true) {
            mController.readInput();
            for (View v : mInvalidViews) {
                v.onDraw();
            }
            //mInvalidViews.clear();
        }
    }
  /**
     * Add a view to a queue for redraw on screen later.
     *
     * @param v View to redraw.
     */
    
    public void schduleRedraw(View v) {
        mInvalidViews.add(v);
    }
}
