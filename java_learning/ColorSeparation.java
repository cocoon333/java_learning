import java.awt.Color;
public class ColorSeparation{
    public static void main(String[] args){
        Picture picture;

        for (int i=0; i<3; ++i){
            picture = new Picture(args[0]);
            for (int j=0; j<picture.width(); ++j){
                for (int k=0; k<picture.height(); ++k){
                    if (i == 0){
                        picture.set(j, k, toRed(picture.get(j, k)));
                    }

                    else if(i == 1){
                        picture.set(j, k, toGreen(picture.get(j, k)));
                    else{
                        picture.set(j, k, toBlue(picture.get(j, k)));
                    }
                }
            }
            picture.show();
            StdDraw.pause(1000);
        }
    }


	public static Color toRed(Color color) {
        int y = (int) (Math.round(lum(color)));
        Color red = new Color(y, 0, 0);
        return red;
    }

	public static Color toGreen(Color color) {
        int y = (int) (Math.round(lum(color)));
        Color green = new Color(0, y, 0);
        return green;
    }

	public static Color toBlue(Color color) {
        int y = (int) (Math.round(lum(color)));
        Color blue = new Color(0, 0, y);
        return blue;
    }

    public static double lum(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return 0.299*r + 0.587*g + 0.114*b;
    }
}
