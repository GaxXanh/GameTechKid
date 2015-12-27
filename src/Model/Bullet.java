package Model;

import Geometric.Vector2D;
import config.Config;

/**
 * Created by duc on 27/12/2015.
 */
public class Bullet extends Enemy{

    public Bullet(String imageName){
        super(imageName);
    }

    Vector2D newVelocity = Vector2D.zero;
    Vector2D velocityStep;
    Vector2D towerPosition = new Vector2D(320,640);
    Vector2D v1 = new Vector2D(320,200);
    public boolean isExist(Sprite s){
        if(this.intersects(s)) return false;
        else return true;
    }

    @Override
    void updateVelocity(double dt) {
        newVelocity = new Vector2D(towerPosition.getCos(v1) * Config.EnemyProperties.BULLET_VELOCITY,
                towerPosition.getSin(v1) * Config.EnemyProperties.BULLET_VELOCITY);
    }

    @Override
    void updatePosition(double dt) {
        velocityStep = newVelocity.multiByScalar(dt);
        this.position = this.position.addVector(velocityStep);
    }

    @Override
    public void update(double dt) {
        updateVelocity(dt);
        updatePosition(dt);
    }


}

