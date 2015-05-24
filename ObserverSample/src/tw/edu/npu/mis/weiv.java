
package tw.edu.npu.mis;




public class weiv extends View{

    public weiv(String name, Window window, Model model) {
        super(name, window, model);
    }
    @Override
    public void onDraw() {
        if(x!=mModel.getData()){
            System.out.println("View (" + mName + "): " + new StringBuilder(mModel.getData()).reverse());
            x=mModel.getData();
        }
    }
}
