import state.BrushTool;
import state.Canvas;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setToolType(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}