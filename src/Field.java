import java.util.ArrayList;
import java.util.List;

public class Field {
        int[][] arr = {
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,2,2,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},};
        List<Integer> snakeX = new ArrayList<>();
        List<Integer> snakeY = new ArrayList<>();
        {
        snakeX.add(1);
        snakeY.add(1);
        snakeX.add(2);
        snakeY.add(1);
        snakeX.add(3);
        snakeY.add(1);
        }
        int tailX = 1;
        int tailY = 1;
        int length = 3;
        int dir = -1;
    public void moveRight() {
        if (dir != 3) {
            dir = 1;
            for (int i = 0; i < length - 1; i++) {
                snakeX.set(i, snakeX.get(i + 1));
                snakeY.set(i, snakeY.get(i + 1));
            }
            // tail coordinates changes to 1 after every move!
            arr[tailY][tailX] = 1;
            // we add every time 1 more step here:
            snakeX.set(length - 1, snakeX.get(length - 1) + 1);
            // if we reach the limit which is 9 we only make it 0:
            if (snakeX.get(length - 1) == 40) {
                snakeX.set(length - 1, 0);
            }
            // updating tails of snake:
            tailY = snakeY.get(0);
            tailX = snakeX.get(0);
            places(arr, snakeX, snakeY);
            pause();
        }
    }
    public void moveDown() {
        if (dir != 0) {
            dir = 2;
            for (int i = 0; i < length - 1; i++) {
                snakeX.set(i, snakeX.get(i + 1));
                snakeY.set(i, snakeY.get(i + 1));
            }
            // tail coordinates changes to 1 after every move!
            arr[tailY][tailX] = 1;
            // we add every time 1 more step here:
            snakeY.set(length - 1, snakeY.get(length - 1) + 1);
            // if we reach the limit which is 6 we only make it 0:
            if (snakeY.get(length - 1) == 20) {
                snakeY.set(length - 1, 0);
            }
            // updating tails of snake:
            tailY = snakeY.get(0);
            tailX = snakeX.get(0);
            places(arr, snakeX, snakeY);
            pause();
        }
    }
    public void moveLeft() {
        if (dir != 1) {
            dir = 3;
            for (int i = 0; i < length - 1; i++) {
                snakeX.set(i, snakeX.get(i + 1));
                snakeY.set(i, snakeY.get(i + 1));
            }
            // tail coordinates changes to 1 after every move!
            arr[tailY][tailX] = 1;
            // we add every time 1 more step here:
            snakeX.set(length - 1, snakeX.get(length - 1) - 1);
            // if we reach the limit which is 0 we only make it 9:
            if (snakeX.get(length - 1) == -1) {
                snakeX.set(length - 1, 39);
            }
            // updating tails of snake:
            tailY = snakeY.get(0);
            tailX = snakeX.get(0);
            places(arr, snakeX, snakeY);
            pause();
        }
    }
    public void moveUp() {
        if (dir != 2) {
            dir = 0;
            for (int i = 0; i < length - 1; i++) {
                snakeX.set(i, snakeX.get(i + 1));
                snakeY.set(i, snakeY.get(i + 1));
            }
            // tail coordinates changes to 1 after every move!
            arr[tailY][tailX] = 1;
            // we add every time 1 more step here:
            snakeY.set(length - 1, snakeY.get(length - 1) - 1);
            // if we reach the limit which is 0 we only make it 5:
            if (snakeY.get(length - 1) == -1) {
                snakeY.set(length - 1, 19);
            }
            // updating tails of snake:
            tailY = snakeY.get(0);
            tailX = snakeX.get(0);
            places(arr, snakeX, snakeY);
            pause();
        }
    }
    public static void places(int[][] arr, List<Integer> x, List<Integer> y) {
        if (!eat(arr)) {
            random(arr);
        }
        for (int i = x.size() - 1; i >= 0; i--) {
            if (i == x.size() - 1) {
                arr[y.get(i)][x.get(i)] = 3;
            } else {
                arr[y.get(i)][x.get(i)] = 2;
            }
        }
    }
    public static void random(int[][] arr) {
        while (true) {
            int rx = (int) (Math.random() * 9);
            int ry = (int) (Math.random() * 6);
            if (arr[ry][rx] == 1) {
                arr[ry][rx] = 9;
                break;
            }
        }
    }
    public static boolean eat(int[][] arr) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 40; j++) {
                if (arr[i][j] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
    private void pause() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
