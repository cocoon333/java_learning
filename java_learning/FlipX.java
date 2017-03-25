import java.awt.Color;
public class FlipX{
    public static void main(String[] args){
        Picture picture;
        
        picture = new Picture(args[0]);

        for (int i=0; i<picture.height(); ++i){
            for (int j=0; j<picture.width()/2; ++j){
                Color c1 = picture.get(j, i);
                Color c2 = picture.get(picture.width()-j-1, i);
                picture.set(j, i, c2);
                picture.set(picture.width()-j-1, i, c1);
            }
        }

        picture.show();
    }
}
