package Geometric;

import config.Config;

/**
 * Created by duc on 26/12/2015.
 */
public class Vector2D {
    public double x;
    public double y;

    public Vector2D(double x,double y){
        this.x = x;
        this.y = y;
    }

    public Vector2D addVector(Vector2D v1){
        return new Vector2D(v1.x + this.x, v1.y + this.y);
    }

    public Vector2D multiByScalar(double t){
        return new Vector2D(this.x * t, this.y *t);
    }
    public double distance(Vector2D v1){
        double a = this.x - v1.x;
        double b = this.y - v1.y;
        return Math.sqrt(a * a + b * b);
    }
    public double getSin(Vector2D v1){
        return (v1.y-this.y) / this.distance(v1);
    }
    public double getCos(Vector2D v1){
        return (v1.x-this.x) / this.distance(v1);
    }
    public static final Vector2D zero = new Vector2D(0,0);

    }
