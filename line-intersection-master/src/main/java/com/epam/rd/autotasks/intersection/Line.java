package com.epam.rd.autotasks.intersection;

public class Line {
    int k1;
    int b1;
    int k2;
    int b2;

    public Line(int k, int b) {
        this.k1 = k;
        this.b1 = b;
        this.k2 = k;
        this.b2 = b;
    }

    public Point intersection(Line other) {

        //throw new UnsupportedOperationException();
        if(this.k1 != other.k2){
            int x = (other.b2 - this.b1) / (this.k1 - other.k2);

            int y = this.k1 * x + this.b1;

            return new Point(x, y);
        } else {
            return null;
        }
    }

}
