package Model;

/**
 * Created by duc on 26/12/2015.
 */
public abstract class Enemy extends GameObject{
    public Enemy(String imageName){
        super(imageName);
    }

    public void updateAnimation(double dt){

    }
    abstract void updateVelocity(double dt);
    abstract void updatePosition(double dt);
    //abstract void update

    //public AnimatedImage loadAnimation(String animationName){

    //}

    }

