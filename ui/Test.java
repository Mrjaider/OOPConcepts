package ui;

import domain.model.Rect;
import domain.model.Square;

public class Test {
    public static void main(String[] args) {

        /*
         * var shape1 = new Shape(-200, 10);
         * var shape2 = new Shape(20, 1500);
         */
        var Square = new Rect();
        Square.setWidth(65);
        System.out.println("Width" + Square.getWith());
        System.out.println("Height" + Square.getHeight());

        Square.setHeight(21);

    }
}
