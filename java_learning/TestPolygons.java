public class TestPolygons {
    public static void main(String[] args){
        testTriangleCoordinates();
    }
    public static void testTriangleCoordinates()
    {
		double coordinates[][];
		coordinates = NestedPolygons.run(3);
		assert(DoubleEqual(coordinates[0][0], 0.5866025403784438));
		assert(DoubleEqual(coordinates[0][1], 0.41339745962155616));
		assert(DoubleEqual(coordinates[0][2], 0.5));

		assert(DoubleEqual(coordinates[1][2], 0.4));
		assert(DoubleEqual(coordinates[1][1], 0.55));
		assert(DoubleEqual(coordinates[1][0], 0.55));
		
    }
    public static boolean DoubleEqual(double num1, double num2){
        if (num1+0.0000000000000001 > num2 && num1-0.0000000000000001 < num2) return true;
        else return false;
    }

}

