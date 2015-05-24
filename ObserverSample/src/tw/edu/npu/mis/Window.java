
package tw.edu.npu.mis;

import java.util.ArrayList;
import java.util.List;


public class Window {

    private Controller mController;
    private List<View> mInvalidViews;

  
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

    
    public void schduleRedraw(View v) {
        mInvalidViews.add(v);
    }
}
