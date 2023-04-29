package state;

public class Canvas {
    private Tool toolType;

    public void mouseDown(){
        toolType.mouseDown();
    }

    public void mouseUp(){
        toolType.mouseUp();
    }

    public Tool getToolType() {
        return toolType;
    }

    public void setToolType(Tool toolType) {
        this.toolType = toolType;
    }
}
