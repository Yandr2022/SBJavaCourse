package Part1.module7_OOP.lesson9_defaultAndStaticMethsToIF;

public interface Figure2D {

    static Figure2D createFigure(){
        return null;
    }

    default double getSquare(){
        return 0.0;
    }
}
