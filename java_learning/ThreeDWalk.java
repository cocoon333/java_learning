public class ThreeDWalk {
    public static void main(String[] args) {
        int n;
        int count;
        int orgin[] = {0, 0, 0};

        n = Integer.parseInt(args[0]);
        count = 0;

        for (int i=0; i<100; ++i) {
            orgin[0] = 0;
            orgin[1] = 0;
            orgin[2] = 0;
            if(walk(n, orgin)){
                count += 1;
            }
        }
        System.out.println(count);
    }
    
    public static boolean walk(int steps, int[] position){
        int direction;
        double forward_or_backward;

        if (steps == 0){
            return false;
        }

        direction = StdRandom.uniform(3);
        forward_or_backward = StdRandom.uniform();

        if (forward_or_backward < 0.5){
            position[direction] -= 1;
        }
        else{
            position[direction] += 1;
        }

        if (position[0] == 0 && position[1] == 0 && position[2] == 0) {
            return true;
        }

        return walk(steps-1, position);
    }
}
