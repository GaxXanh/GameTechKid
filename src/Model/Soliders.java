package Model;

import Geometric.Vector2D;
import config.Config;

/**
 * Created by duc on 26/12/2015.
 */
public class Soliders extends Enemy {
    public Soliders(String imageName){
        super(imageName);
    }

    Vector2D newVelocity = Vector2D.zero;
    Vector2D velocityStep;
    Vector2D towerPosition = new Vector2D(320,640);

    protected boolean isMove=true;

    public boolean isAlive(Sprite s){
        if(this.intersects(s)) return false;
        else return true;
    }

    @Override
    void updateVelocity(double dt) {
        //newVelocity = new Vector2D(0,+Config.EnemyProperties.SOLIDER_VELOCITY);
            if(this.position.distance(towerPosition)<200) {
                isMove=false;
                newVelocity = Vector2D.zero;
            }else newVelocity = new Vector2D(0,+Config.EnemyProperties.SOLIDER_VELOCITY);


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
