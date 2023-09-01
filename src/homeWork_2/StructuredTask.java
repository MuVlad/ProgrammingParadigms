package homeWork_2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Трассировка пути в лабиринте:
 * __
 * Описание: Имеется двумерный массив, представляющий лабиринт, где '0' - это проход, а '1' - это стена.
 * Начальная и конечная точки заданы. Необходимо определить путь от начальной до конечной точки.
 * Почему это структурное программирование: Задача может быть решена с помощью последовательных шагов,
 * ветвлений (проверка на наличие стены или уже посещенной клетки) и циклов (для обработки всех возможных направлений движения).
 */
public class StructuredTask {
    public static void main(String[] args) {
        int[][] maze = {{0, 0, 0, 0, 1},
                        {1, 1, 1, 0, 1},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0}
        };

        Point start = new Point(0, 0, true);
        Point end = new Point(4, 4, true);

        LinkedList<Point> path = Wayfinding.findPath(maze, start, end);

        if (path.isEmpty()) {
            System.out.println("Путь не найден!");
        } else {
            System.out.println("Путь от начальной до конечной точки:");
            for (Point point : path) {
                System.out.println("(" + point.x + ", " + point.y + ")");
            }
        }
    }

    private static class Point {
        int x;
        int y;
        boolean isValis;

        public Point(int x, int y, boolean isValis) {
            this.x = x;
            this.y = y;
            this.isValis = isValis;
        }
    }

    private static class Wayfinding {
        //возможные направления движения
        private static final int[][] DIRECTIONS = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        public static LinkedList<Point> findPath(int[][] maze, Point start, Point end) {
            int rows = maze.length;
            int columns = maze[0].length;

            //массив для отслежования посещенных точек
            boolean[][] visited = new boolean[rows][columns];
            //массив для хранения родительских точек
            Point[][] parents = new Point[rows][columns];

            Queue<Point> queue = new LinkedList<>();

            queue.offer(start);
            // начальная точка
            visited[start.x][start.y] = true;


            while (!queue.isEmpty()) {
                Point current = queue.poll();

                if (current.x == end.x && current.y == end.y) {
                    // если достигли конечной точки возвращаем путь
                    return buildPath(parents, start, end);
                }

                for (int[] direction : DIRECTIONS) {
                    int nextX = current.x = direction[0];
                    int nextY = current.y = direction[1];

                    if (isValid(maze, nextX, nextY, visited)) {
                        Point nextPoint = new Point(nextX, nextY, true);
                        queue.offer(nextPoint);
                        visited[nextX][nextY] = true;
                        parents[nextX][nextY] = current;
                    }
                }
            }
            return new LinkedList<>();
        }

        private static LinkedList<Point> buildPath(Point[][] parents, Point start, Point end) {
            LinkedList<Point> path = new LinkedList<>();
            Point current = end;

            while (current != null && current != start) {
                path.addFirst(current);
                current = parents[current.x][current.y];
            }
            path.addFirst(start);
            return path;
        }

        private static boolean isValid(int[][] maze, int x, int y, boolean[][] visited) {
            int rows = maze.length;
            int columns = maze[0].length;

            return x >= 0 && x < rows && y >= 0 && y < columns && maze[x][y] == 0 && !visited[x][y];
        }
    }
}
