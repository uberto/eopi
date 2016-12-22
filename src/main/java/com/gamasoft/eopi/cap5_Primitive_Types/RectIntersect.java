package com.gamasoft.eopi.cap5_Primitive_Types;

/**
 * Created by uberto on 22/12/16.
 */
public class RectIntersect {

    public static Rect findIntersect(Rect r1, Rect r2) {

        if (r1.x2 <= r2.x1 || r1.x1 >= r2.x2 ||
            r1.y2 <= r2.y1 || r1.y1 >= r2.y2 )
        return null;

        int x1 = Math.max(r1.x1, r2.x1);
        int y1 = Math.max(r1.y1, r2.y1);
        int x2 = Math.min(r1.x2, r2.x2);
        int y2 = Math.min(r1.y2, r2.y2);
        return new Rect(x1, y1, x2, y2);
    }

    public static class Rect {
        int x1, y1, x2, y2;

        public Rect(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

        @Override
        public String toString() {
            return x1 + "," + y1 + "," + x2 + "," + y2;
        }
    }
}
