package Model;

import Geometric.Size;
import Geometric.Vector2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Author: Gác Xanh (phamanh)
 * Date: 26/12/2015
 * Class: OOP2
 * Project: GameTechKid
 */
public class Sprite {
    protected Size size;
    protected Vector2D position;
    protected Image image;

    public Sprite(String imageName){

        try {
            this.image = new Image(new FileInputStream(imageName));

            this.position = new Vector2D(10, 11);
            this.size = new Size(image.getWidth(), image.getHeight());
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
    public Sprite(){}

    public void setPostion(Vector2D position){
        this.position=position;
    }

    public void render(GraphicsContext gc){
        gc.drawImage(this.image,position.x,position.y,size.width,size.height);

    }
}
