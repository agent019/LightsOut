import greenfoot.*;

public class Maze extends Actor
{
    private int rows;
    private int cols;
    private Square[][] maze;
    private Explorer explorer;
    int level = 0;

    public Maze(int level)
    {
        maze = new Square[10][10];
        this.level = level;

        if(level==0)
        {
            maze[0][0] = new Square(false, false, false, false, 0, 0, false, false, false, false, false, false, false, false, false, false);
            maze[0][1] = new Square(false, false, false, false, 0, 1, false, false, false, false, false, false, false, false, false, false);
            maze[0][2] = new Square(false, false, false, false, 0, 2, false, false, false, false, false, false, false, false, false, false);
            maze[0][3] = new Square(false, false, false, false, 0, 3, false, false, false, false, false, false, false, false, false, false);
            maze[0][4] = new Square(false, false, false, false, 0, 4, false, false, false, false, false, false, false, false, false, false);
            maze[0][5] = new Square(false, false, false, false, 0, 5, false, false, false, false, false, false, false, false, false, false);
            maze[0][6] = new Square(false, false, false, false, 0, 6, false, false, false, false, false, false, false, false, false, false);
            maze[0][7] = new Square(false, false, false, false, 0, 7, false, false, false, false, false, false, false, false, false, false);
            maze[0][8] = new Square(false, false, false, false, 0, 8, false, false, false, false, false, false, false, false, false, false);
            maze[0][9] = new Square(false, false, false, false, 0, 9, false, false, false, false, false, false, false, false, false, false);

            maze[1][0] = new Square(false, false, false, false, 1, 0, false, false, false, false, false, false, false, false, false, false);
            maze[1][1] = new Square(false, false, false, false, 1, 1, false, false, false, false, false, false, false, false, false, false);
            maze[1][2] = new Square(false, false, false, false, 1, 2, false, false, false, false, false, false, false, false, false, false);
            maze[1][3] = new Square(false, false, false, false, 1, 3, false, false, false, false, false, false, false, false, false, false);
            maze[1][4] = new Square(false, false, false, false, 1, 4, false, false, false, false, false, false, false, false, false, false);
            maze[1][5] = new Square(false, false, false, false, 1, 5, false, false, false, false, false, false, false, false, false, false);
            maze[1][6] = new Square(false, false, false, false, 1, 6, false, false, false, false, false, false, false, false, false, false);
            maze[1][7] = new Square(false, false, false, false, 1, 7, false, false, false, false, false, false, false, false, false, false);
            maze[1][8] = new Square(false, false, false, false, 1, 8, false, false, false, false, false, false, false, false, false, false);
            maze[1][9] = new Square(false, false, false, false, 1, 9, false, false, false, false, false, false, false, false, false, false);

            maze[2][0] = new Square(false, false, false, false, 2, 0, false, false, false, false, false, false, false, false, false, false);
            maze[2][1] = new Square(false, false, false, false, 2, 1, false, false, false, false, false, false, false, false, false, false);
            maze[2][2] = new Square(false, false, false, false, 2, 2, false, false, false, false, false, false, false, false, false, false);
            maze[2][3] = new Square(false, false, false, false, 2, 3, false, false, false, false, false, false, false, false, false, false);
            maze[2][4] = new Square(false, false, false, false, 2, 4, false, false, false, false, false, false, false, false, false, false);
            maze[2][5] = new Square(false, false, false, false, 2, 5, false, false, false, false, false, false, false, false, false, false);
            maze[2][6] = new Square(false, false, false, false, 2, 6, false, false, false, false, false, false, false, false, false, false);
            maze[2][7] = new Square(false, false, false, false, 2, 7, false, false, false, false, false, false, false, false, false, false);
            maze[2][8] = new Square(false, false, false, false, 2, 8, false, false, false, false, false, false, false, false, false, false);
            maze[2][9] = new Square(false, false, false, false, 2, 9, false, false, false, false, false, false, false, false, false, false);

            maze[3][0] = new Square(false, false, false, false, 3, 0, false, false, false, false, false, false, false, false, false, false);
            maze[3][1] = new Square(false, false, false, false, 3, 1, false, false, false, false, false, false, false, false, false, false);
            maze[3][2] = new Square(false, false, false, false, 3, 2, false, false, false, false, false, false, false, false, false, false);
            maze[3][3] = new Square(false, false, false, false, 3, 3, false, false, false, false, false, false, false, false, false, false);
            maze[3][4] = new Square(false, false, false, false, 3, 4, false, false, false, false, false, false, false, false, false, false);
            maze[3][5] = new Square(false, false, false, false, 3, 5, false, false, false, false, false, false, false, false, false, false);
            maze[3][6] = new Square(false, false, false, false, 3, 6, false, false, false, false, false, false, false, false, false, false);
            maze[3][7] = new Square(false, false, false, false, 3, 7, false, false, false, false, false, false, false, false, false, false);
            maze[3][8] = new Square(false, false, false, false, 3, 8, false, false, false, false, false, false, false, false, false, false);
            maze[3][9] = new Square(false, false, false, false, 3, 9, false, false, false, false, false, false, false, false, false, false);

            maze[4][0] = new Square(false, false, false, false, 4, 0, false, false, false, false, false, false, false, false, false, false);
            maze[4][1] = new Square(false, false, false, false, 4, 1, false, false, false, false, false, false, false, false, false, false);
            maze[4][2] = new Square(false, false, false, false, 4, 2, false, false, false, false, false, false, false, false, false, false);
            maze[4][3] = new Square(false, false, false, false, 4, 3, false, false, false, false, false, false, false, false, false, false);
            maze[4][4] = new Square(false, false, false, false, 4, 4, false, false, false, false, false, false, false, false, false, false);
            maze[4][5] = new Square(false, false, false, false, 4, 5, false, false, false, false, false, false, false, false, false, false);
            maze[4][6] = new Square(false, false, false, false, 4, 6, false, false, false, false, false, false, false, false, false, false);
            maze[4][7] = new Square(false, false, false, false, 4, 7, false, false, false, false, false, false, false, false, false, false);
            maze[4][8] = new Square(false, false, false, false, 4, 8, false, false, false, false, false, false, false, false, false, false);
            maze[4][9] = new Square(false, false, false, false, 4, 9, false, false, false, false, false, false, false, false, false, false);

            maze[5][0] = new Square(true, true, true, false, 5, 0, false, false, true, true, false, false, true, true, false, false);
            maze[5][1] = new Square(true, true, false, false, 5, 1, false, false, false, false, false, false, false, false, false, false);
            maze[5][2] = new Square(true, true, false, false, 5, 2, false, false, false, false, false, false, false, false, false, false);
            maze[5][3] = new Square(true, true, false, false, 5, 3, false, false, false, false, false, false, false, false, false, false);
            maze[5][4] = new Square(true, true, false, false, 5, 4, false, false, false, false, false, false, false, false, false, false);
            maze[5][5] = new Square(true, true, false, false, 5, 5, false, false, false, false, false, false, false, false, false, false);
            maze[5][6] = new Square(true, true, false, false, 5, 6, false, false, false, false, false, false, false, false, false, false);
            maze[5][7] = new Square(true, true, false, false, 5, 7, false, false, false, false, false, false, false, false, false, false);
            maze[5][8] = new Square(true, true, false, true, 5, 8, false, false, false, false, true, true, false, false, true, true);
            maze[5][9] = new Square(true, true, true, true, 5, 9, false, false, true, true, true, true, true, true, true, true);

            maze[6][0] = new Square(false, false, false, false, 6, 0, false, false, false, false, false, false, false, false, false, false);
            maze[6][1] = new Square(false, false, false, false, 6, 1, false, false, false, false, false, false, false, false, false, false);
            maze[6][2] = new Square(false, false, false, false, 6, 2, false, false, false, false, false, false, false, false, false, false);
            maze[6][3] = new Square(false, false, false, false, 6, 3, false, false, false, false, false, false, false, false, false, false);
            maze[6][4] = new Square(false, false, false, false, 6, 4, false, false, false, false, false, false, false, false, false, false);
            maze[6][5] = new Square(false, false, false, false, 6, 5, false, false, false, false, false, false, false, false, false, false);
            maze[6][6] = new Square(false, false, false, false, 6, 6, false, false, false, false, false, false, false, false, false, false);
            maze[6][7] = new Square(false, false, false, false, 6, 7, false, false, false, false, false, false, false, false, false, false);
            maze[6][8] = new Square(false, false, false, false, 6, 8, false, false, false, false, false, false, false, false, false, false);
            maze[6][9] = new Square(false, false, false, false, 6, 9, false, false, false, false, false, false, false, false, false, false);

            maze[7][0] = new Square(false, false, false, false, 7, 0, false, false, false, false, false, false, false, false, false, false);
            maze[7][1] = new Square(false, false, false, false, 7, 1, false, false, false, false, false, false, false, false, false, false);
            maze[7][2] = new Square(false, false, false, false, 7, 2, false, false, false, false, false, false, false, false, false, false);
            maze[7][3] = new Square(false, false, false, false, 7, 3, false, false, false, false, false, false, false, false, false, false);
            maze[7][4] = new Square(false, false, false, false, 7, 4, false, false, false, false, false, false, false, false, false, false);
            maze[7][5] = new Square(false, false, false, false, 7, 5, false, false, false, false, false, false, false, false, false, false);
            maze[7][6] = new Square(false, false, false, false, 7, 6, false, false, false, false, false, false, false, false, false, false);
            maze[7][7] = new Square(false, false, false, false, 7, 7, false, false, false, false, false, false, false, false, false, false);
            maze[7][8] = new Square(false, false, false, false, 7, 8, false, false, false, false, false, false, false, false, false, false);
            maze[7][9] = new Square(false, false, false, false, 7, 9, false, false, false, false, false, false, false, false, false, false);

            maze[8][0] = new Square(false, false, false, false, 8, 0, false, false, false, false, false, false, false, false, false, false);
            maze[8][1] = new Square(false, false, false, false, 8, 1, false, false, false, false, false, false, false, false, false, false);
            maze[8][2] = new Square(false, false, false, false, 8, 2, false, false, false, false, false, false, false, false, false, false);
            maze[8][3] = new Square(false, false, false, false, 8, 3, false, false, false, false, false, false, false, false, false, false);
            maze[8][4] = new Square(false, false, false, false, 8, 4, false, false, false, false, false, false, false, false, false, false);
            maze[8][5] = new Square(false, false, false, false, 8, 5, false, false, false, false, false, false, false, false, false, false);
            maze[8][6] = new Square(false, false, false, false, 8, 6, false, false, false, false, false, false, false, false, false, false);
            maze[8][7] = new Square(false, false, false, false, 8, 7, false, false, false, false, false, false, false, false, false, false);
            maze[8][8] = new Square(false, false, false, false, 8, 8, false, false, false, false, false, false, false, false, false, false);
            maze[8][9] = new Square(false, false, false, false, 8, 9, false, false, false, false, false, false, false, false, false, false);

            maze[9][0] = new Square(false, false, false, false, 9, 0, false, false, false, false, false, false, false, false, false, false);
            maze[9][1] = new Square(false, false, false, false, 9, 1, false, false, false, false, false, false, false, false, false, false);
            maze[9][2] = new Square(false, false, false, false, 9, 2, false, false, false, false, false, false, false, false, false, false);
            maze[9][3] = new Square(false, false, false, false, 9, 3, false, false, false, false, false, false, false, false, false, false);
            maze[9][4] = new Square(false, false, false, false, 9, 4, false, false, false, false, false, false, false, false, false, false);
            maze[9][5] = new Square(false, false, false, false, 9, 5, false, false, false, false, false, false, false, false, false, false);
            maze[9][6] = new Square(false, false, false, false, 9, 6, false, false, false, false, false, false, false, false, false, false);
            maze[9][7] = new Square(false, false, false, false, 9, 7, false, false, false, false, false, false, false, false, false, false);
            maze[9][8] = new Square(false, false, false, false, 9, 8, false, false, false, false, false, false, false, false, false, false);
            maze[9][9] = new Square(false, false, false, false, 9, 9, false, false, false, false, false, false, false, false, false, false);
            /*System.out.println("Play again?"); 
            System.out.println("YES? (Enter)");

            if(Greenfoot.isKeyDown("enter"))
            {
            level=1;
            }*/
        }

        if(level==1)
        {
            maze[0][0] = new Square(true, false, true, true, 0, 0, false, false, true, true, true, true, false, false, false, false);
            maze[0][1] = new Square(true, false, true, false, 0, 1, false, false, true, true, false, false, false, false, true, false);
            maze[0][2] = new Square(true, true, false, false, 0, 2, false, false, false, false, false, false, false, false, false, false);
            maze[0][3] = new Square(true, false, false, false, 0, 3, false, false, false, false, false, false, false, false, false, false);
            maze[0][4] = new Square(true, true, false, false, 0, 4, false, false, false, false, false, false, false, false, false, false);
            maze[0][5] = new Square(true, true, false, true, 0, 5, false, false, false, false, true, true, false, false, true, true);
            maze[0][6] = new Square(true, false, true, false, 0, 6, false, false, true, true, false, false, false, false, true, false);
            maze[0][7] = new Square(true, true, false, false, 0, 7, false, false, false, false, false, false, false, false, false, false);
            maze[0][8] = new Square(true, true, false, false, 0, 8, false, false, false, false, false, false, false, false, false, false);
            maze[0][9] = new Square(true, true, false, true, 0, 9, false, false, false, false, true, true, false, false, true, true);

            maze[1][0] = new Square(false, false, true, true, 1, 0, false, false, false, false, false, false, false, false, false, false);
            maze[1][1] = new Square(false, true, true, true, 1, 1, false, false, false, false, false, false, true, true, true, true);
            maze[1][2] = new Square(true, false, true, false, 1, 2, false, false, true, true, false, false, false, false, true, false);
            maze[1][3] = new Square(false, true, false, false, 1, 3, false, false, false, false, false, false, false, false, false, false);
            maze[1][4] = new Square(true, false, false, false, 1, 4, false, false, false, false, false, false, true, false, true, false);
            maze[1][5] = new Square(true, true, false, false, 1, 5, false, false, false, false, false, false, false, false, false, false);
            maze[1][6] = new Square(false, true, false, true, 1, 6, false, false, true, false, false, false, false, false, true, true);
            maze[1][7] = new Square(true, false, true, false, 1, 7, false, false, true, true, false, false, false, false, false, false);
            maze[1][8] = new Square(true, false, false, false, 1, 8, false, false, false, false, false, false, false, false, false, false);
            maze[1][9] = new Square(true, false, false, true, 1, 9, false, false, false, false, true, true, false, false, false, false);

            maze[2][0] = new Square(false, true, true, false, 2, 0, false, false, false, false, true, false, true, true, false, false);
            maze[2][1] = new Square(true, false, false, false, 2, 1, false, false, false, false, false, false, true, false, true, false);
            maze[2][2] = new Square(false, true, false, true, 2, 2, false, false, true, false, false, false, false, false, true, true);
            maze[2][3] = new Square(true, false, true, true, 2, 3, false, false, true, true, true, true, false, false, false, false);
            maze[2][4] = new Square(false, false, true, true, 2, 4, false, false, false, false, false, false, false, false, false, false);
            maze[2][5] = new Square(true, true, true, true, 2, 5, false, false, true, true, true, true, true, true, true, true);
            maze[2][6] = new Square(true, false, true, false, 2, 6, false, false, true, true, false, false, false, false, true, false);
            maze[2][7] = new Square(false, true, false, true, 2, 7, false, false, true, false, false, false, false, false, true, true);
            maze[2][8] = new Square(false, false, true, true, 2, 8, false, false, false, false, false, false, false, false, false, false);
            maze[2][9] = new Square(false, false, true, true, 2, 9, false, false, false, false, false, false, false, false, false, false);

            maze[3][0] = new Square(true, true, true, true, 3, 0, false, false, true, true, true, true, true, true, true, true);
            maze[3][1] = new Square(false, false, true, true, 3, 1, false, false, false, false, false, false, false, false, false, false);
            maze[3][2] = new Square(true, false, true, false, 3, 2, false, false, true, true, false, false, false, false, true, false);
            maze[3][3] = new Square(false, true, false, true, 3, 3, false, false, true, false, false, false, false, false, true, true);
            maze[3][4] = new Square(false, false, true, false, 3, 4, false, false, false, false, true, false, false, false, true, false);
            maze[3][5] = new Square(true, true, false, false, 3, 5, false, false, false, false, false, false, false, false, false, false);
            maze[3][6] = new Square(false, true, false, true, 3, 6, false, false, true, false, false, false, false, false, true, true);
            maze[3][7] = new Square(true, false, true, true, 3, 7, false, false, true, true, true, true, false, false, false, false);
            maze[3][8] = new Square(false, false, true, true, 3, 8, false, false, false, false, false, false, false, false, false, false);
            maze[3][9] = new Square(false, false, true, true, 3, 9, false, false, false, false, false, false, false, false, false, false);

            maze[4][0] = new Square(true, true, true, false, 4, 0, false, false, true, true, false, false, true, true, false, false);
            maze[4][1] = new Square(false, false, false, true, 4, 1, false, false, true, false, false, false, true, false, false, false);
            maze[4][2] = new Square(false, false, true, true, 4, 2, false, false, false, false, false, false, false, false, false, false);
            maze[4][3] = new Square(true, false, true, false, 4, 3, false, false, true, true, false, false, false, false, true, false);
            maze[4][4] = new Square(false, true, false, true, 4, 4, false, false, true, false, false, false, false, false, true, true);
            maze[4][5] = new Square(true, false, true, true, 4, 5, false, false, true, true, true, true, false, false, false, false);
            maze[4][6] = new Square(true, false, true, false, 4, 6, false, false, true, true, false, false, false, false, true, false);
            maze[4][7] = new Square(false, true, false, false, 4, 7, false, false, true, false, false, false, false, false, false, false);
            maze[4][8] = new Square(false, true, false, true, 4, 8, false, false, false, false, false, false, false, false, true, true);
            maze[4][9] = new Square(false, false, true, true, 4, 9, false, false, false, false, false, false, false, false, false, false);

            maze[5][0] = new Square(true, true, true, true, 5, 0, false, false, true, true, true, true, true, true, true, true);
            maze[5][1] = new Square(false, false, true, true, 5, 1, false, false, false, false, false, false, false, false, false, false);
            maze[5][2] = new Square(false, false, true, false, 5, 2, false, false, false, false, false, false, false, false, false, false);
            maze[5][3] = new Square(false, false, false, true, 5, 3, false, false, false, false, false, false, false, false, false, false);
            maze[5][4] = new Square(true, true, true, false, 5, 4, true, false, true, true, false, false, true, true, false, false);
            maze[5][5] = new Square(false, false, false, false, 5, 5, false, false, true, false, false, false, false, false, true, false);
            maze[5][6] = new Square(false, true, false, true, 5, 6, false, false, false, false, false, false, false, false, true, true);
            maze[5][7] = new Square(true, false, true, false, 5, 7, false, false, true, true, false, false, false, false, true, false);
            maze[5][8] = new Square(true, true, false, false, 5, 8, false, false, false, false, false, false, false, false, false, false);
            maze[5][9] = new Square(false, true, false, true, 5, 9, false, false, true, false, false, false, false, false, true, true);

            maze[6][0] = new Square(true, true, true, false, 6, 0, false, false, true, true, false, false, true, true, false, false);
            maze[6][1] = new Square(false, false, false, true, 6, 1, false, false, true, false, false, false, false, false, false, false);
            maze[6][2] = new Square(false, true, true, true, 6, 2, false, false, false, false, false, false, true, true, true, true);
            maze[6][3] = new Square(false, false, true, true, 6, 3, false, false, false, false, false, false, false, false, false, false);
            maze[6][4] = new Square(true, true, true, false, 6, 4, false, false, true, true, false, false, true, true, false, false);
            maze[6][5] = new Square(false, false, false, true, 6, 5, false, false, false, false, false, false, true, false, false, false);
            maze[6][6] = new Square(true, true, true, false, 6, 6, false, false, true, true, false, false, true, true, false, false);
            maze[6][7] = new Square(false, true, false, true, 6, 7, false, false, true, false, false, false, false, false, true, true);
            maze[6][8] = new Square(true, false, true, false, 6, 8, false, false, true, true, false, false, false, false, false, false);
            maze[6][9] = new Square(true, false, false, true, 6, 9, false, false, false, false, true, true, false, false, false, false);

            maze[7][0] = new Square(true, false, true, false, 7, 0, false, false, true, true, false, false, false, false, false, false);
            maze[7][1] = new Square(false, false, false, false, 7, 1, false, false, false, false, true, false, false, false, false, false);
            maze[7][2] = new Square(true, false, false, true, 7, 2, false, false, false, false, true, true, false, false, false, false);
            maze[7][3] = new Square(false, false, true, false, 7, 3, false, false, false, false, true, false, false, false, true, false);
            maze[7][4] = new Square(true, true, false, true, 7, 4, false, false, false, false, true, true, false, false, true, true);
            maze[7][5] = new Square(false, false, true, false, 7, 5, false, false, false, false, true, false, false, false, true, false);
            maze[7][6] = new Square(true, true, false, false, 7, 6, false, false, false, false, false, false, false, false, false, false);
            maze[7][7] = new Square(true, true, false, false, 7, 7, false, false, false, false, false, false, false, false, false, false);
            maze[7][8] = new Square(false, false, false, true, 7, 8, false, false, true, false, false, false, true, false, false, false);
            maze[7][9] = new Square(false, true, true, true, 7, 9, false, false, false, false, false, false, true, true, true, true);

            maze[8][0] = new Square(false, true, true, true, 8, 0, false, false, false, false, false, false, true, true, true, true);
            maze[8][1] = new Square(false, false, true, true, 8, 1, false, false, false, false, false, false, false, false, false, false);
            maze[8][2] = new Square(false, true, true, true, 8, 2, false, false, false, false, false, false, true, true, true, true);
            maze[8][3] = new Square(false, false, true, true, 8, 3, false, false, false, false, false, false, false, false, false, false);
            maze[8][4] = new Square(true, true, true, false, 8, 4, false, false, true, true, false, false, true, true, false, false);
            maze[8][5] = new Square(false, true, false, true, 8, 5, false, false, true, false, false, false, false, false, true, true);
            maze[8][6] = new Square(true, false, true, false, 8, 6, false, false, true, true, false, false, false, false, false, false);
            maze[8][7] = new Square(true, false, false, true, 8, 7, false, false, false, false, true, true, false, false, false, false);
            maze[8][8] = new Square(false, true, true, false, 8, 8, false, false, false, false, true, false, true, true, false, false);
            maze[8][9] = new Square(true, false, false, true, 8, 9, false, false, false, false, true, true, true, false, false, false);

            maze[9][0] = new Square(true, true, true, false, 9, 0, true, false, true, true, false, false, true, true, false, false);
            maze[9][1] = new Square(false, true, false, true, 9, 1, false, false, true, false, false, false, false, false, true, true);
            maze[9][2] = new Square(true, true, true, false, 9, 2, false, false, true, true, false, false, true, true, false, false);
            maze[9][3] = new Square(false, true, false, false, 9, 3, false, false, true, false, true, false, false, false, false, false);
            maze[9][4] = new Square(true, true, false, false, 9, 4, false, false, false, false, false, false, false, false, false, false);
            maze[9][5] = new Square(true, true, false, false, 9, 5, false, false, false, false, false, false, false, false, false, false);
            maze[9][6] = new Square(false, true, false, true, 9, 6, false, false, true, false, false, false, false, false, true, true);
            maze[9][7] = new Square(false, true , true, false, 9, 7, false, false, false, false, true, false, true, true, false, false);
            maze[9][8] = new Square(true, true, false, true, 9, 8, true, false, false, false, true, true, false, false, true, true);
            maze[9][9] = new Square(false, true, true, true, 9, 9, false, true, false, false, false, false, true, true, true, true);
        }
        if(level==2)
        {
            maze[0][0] = new Square(true, true, true, false, 0, 0, false, false, true, true, false, false, true, true, false, false);
            maze[0][1] = new Square(true, false, false, true, 0, 1, false, false, false, false, true, true, true, false, false, false);
            maze[0][2] = new Square(true, true, true, false, 0, 2, false, false,  true, true, false, false, true, true, false, false);
            maze[0][3] = new Square(true, false, false, false, 0, 3, false, false, false, false, false, false, false, false, false, false);
            maze[0][4] = new Square(true, false, false, true, 0, 4, false, false, false, false, true, true, false, false, false, false);
            maze[0][5] = new Square(true, false, true, false, 0, 5, false, false, true, true, false, false, false, false, true, false);
            maze[0][6] = new Square(true, true, false, false, 0, 6, false, false, false, false, false, false, false, false, false, false);
            maze[0][7] = new Square(true, false, false, false, 0, 7, false, false, false, false, false, false, true, false, false, false);
            maze[0][8] = new Square(true, false, false, false, 0, 8, false, false, false, false, false, false, false, false, false, false);
            maze[0][9] = new Square(true, false, false, true, 0, 9, false, false, false, false, true, false, false, false, false, false);

            maze[1][0] = new Square(true, false, true, true, 1, 0, false, false, true, true, true, true, false, false, false, false);
            maze[1][1] = new Square(false, true, true, false, 1, 1, false, false, false, false, true, false, true, true, false, false);
            maze[1][2] = new Square(true, false, false, false, 1, 2, false, false, false, false, false, false, true, false, true, false);
            maze[1][3] = new Square(false, true, false, true, 1, 3, false, false, false, false, false, false, false, false, true, true);
            maze[1][4] = new Square(false, false, true, false, 1, 4, false, false, false, false, false, false, false, false, true, false);
            maze[1][5] = new Square(false, true, false, true, 1, 5, false, false, false, false, false, false, false, false, true, true);
            maze[1][6] = new Square(true, false, true, true, 1, 6, false, false, false, false, true, true, false, false, false, false);
            maze[1][7] = new Square(false, false, true, true, 1, 7, false, false, false, false, false, false, false, false, false, false);
            maze[1][8] = new Square(false, false, true, true, 1, 8, false, false, false, false, false, false, false, false, false, false);
            maze[1][9] = new Square(false, false, true, true, 1, 9, false, false, false, false, false, false, false, false, false, false);

            maze[2][0] = new Square(false, false, true, false, 2, 0, false, false, false, false, true, false, false, false, false, false);
            maze[2][1] = new Square(true, true, false, true, 2, 1, false, false, false, false, true, true, false, false, true, true);
            maze[2][2] = new Square(false, true, true, true, 2, 2, false, false, false, false, false, false, true, true, true, true);
            maze[2][3] = new Square(true, false, true, false, 2, 3, false, false, true, true, false, false, false, false, true, false);
            maze[2][4] = new Square(false, true, false, true, 2, 4, false, false, true, false, false, false, false, false, true, true);
            maze[2][5] = new Square(true, false, true, false, 2, 5, false, false, true, true, false, false, false, false, true, false);
            maze[2][6] = new Square(false, true, false, true, 2, 6, false, false, true, false, false, false, false, false, true, true);
            maze[2][7] = new Square(false, false, true, true, 2, 7, false, false, false, false, false, false, false, false, false, false);
            maze[2][8] = new Square(false, false, true, true, 2, 8, false, false, false, false, false, false, false, false, false, false);
            maze[2][9] = new Square(false, true, true, true, 2, 9, false, false, false, false, false, false, true, true, true, true);

            maze[3][0] = new Square(false, false, true, false, 3, 0, false, false, false, false, false, false, false, false, true, false);
            maze[3][1] = new Square(true, true, false, false, 3, 1, false, false, false, false, false, false, false, false, false, false);
            maze[3][2] = new Square(true, false, false, false , 3, 2, false, false, false, false, false, false, false, false, true, false);
            maze[3][3] = new Square(false, true, false, true, 3, 3, false, false, true, false, false, false, false, false, true, true);
            maze[3][4] = new Square(true, true, true, false, 3, 4, false, false, true, true, false, false, true, true, false, false);
            maze[3][5] = new Square(false, false, false, true, 3, 5, true, false, true, false, false, false, true, false, false, false);
            maze[3][6] = new Square(true, true, true, false, 3, 6, false, false, true, true, false, false, true, true, false, false);
            maze[3][7] = new Square(false, false, false, true, 3, 7, false, false, true, false, false, false, false, false, false, false);
            maze[3][8] = new Square(false, true, true, false, 3, 8, false, false, false, false, true, false, true, true, false, false);
            maze[3][9] = new Square(true, false, false, true, 3, 9, false, false, false, false, true, true, true, false, false, false);

            maze[4][0] = new Square(false, false, true, true, 4, 0, false, false, false, false, false, false, false, false, false, false);
            maze[4][1] = new Square(true, true, true, false, 4, 1, false, false, true, true, false, false, true, true, false, false);
            maze[4][2] = new Square(false, false, false, true, 4, 2, false, false, false, false, false, false, true, false, false, false);
            maze[4][3] = new Square(true, true, true, false, 4, 3, false, false, true, true, false, false, true, true, false, false);
            maze[4][4] = new Square(true, false, false, true, 4, 4, false, false, false, false, true, true, true, false, false, false);
            maze[4][5] = new Square(false, true, true, false, 4, 5, false, false, false, false, true, false, true, true, false, false);
            maze[4][6] = new Square(true, true, false, false, 4, 6, false, false, false, false, false, false, false, false, false, false);
            maze[4][7] = new Square(false, true, false, false, 4, 7, false, false, false, false, true, false, false, false, false, false);
            maze[4][8] = new Square(true, true, false, true, 4, 8, false, false, false, false, true, true, false, false, true, true);
            maze[4][9] = new Square(false, true, true, true, 4, 9, false, false, false, false, false, false, true, true, true, true);

            maze[5][0] = new Square(false, false, true, false, 5, 0, false, false, false, false, true, false, false, false, true, false);
            maze[5][1] = new Square(true, true, false, true, 5, 1, false, false, false, false, true, true, false, false, true, true);
            maze[5][2] = new Square(false, false, true, false, 5, 2, false, false, false, false, true, false, false, false, true, false);
            maze[5][3] = new Square(true, true, false, true, 5, 3, false, false, false, false, true, true, false, false, true, true);
            maze[5][4] = new Square(false, false, true, false, 5, 4, false, false, false, false, true, false, false, false, false, false);
            maze[5][5] = new Square(true, true, false, false, 5, 5, false, false, false, false, false, false, false, false, false, false);
            maze[5][6] = new Square(true, true, false, false, 5, 6, false, false, false, false, false, false, false, false, false, false);
            maze[5][7] = new Square(true, false, false, false, 5, 7, false, false, false, false, false, false, false, false, true, false);
            maze[5][8] = new Square(true, true, false, false, 5, 8, false, false, false, false, false, false, false, false, false, false);
            maze[5][9] = new Square(true, false, false, true, 5, 9, false, false, false, false, true, true, true, false, false, false);

            maze[6][0] = new Square(false, false, true, true, 6, 0, false, false, false, false, false, false, false, false, false, false);
            maze[6][1] = new Square(true, true, true, false, 6, 1, true, false, true, true, false, false, true, true, false, false);
            maze[6][2] = new Square(false, true, false, true, 6, 2, false, false, false, false, false, false, false, false, true, true);
            maze[6][3] = new Square(true, false, true, true, 6, 3, false, false, true, true, true, true, false, false, false, false);
            maze[6][4] = new Square(false, true, true, false, 6, 4, false, false, false, false, false, false, true, true, false, false);
            maze[6][5] = new Square(true, false, false, true, 6, 5, false, false, false, false, true, true, true, false, false, false);
            maze[6][6] = new Square(true, false, true, false, 6, 6, false, false, true, true, false, false, false, false, false, false);
            maze[6][7] = new Square(false, true, false, true, 6, 7, false, false, false, false, false, false, false, false, true, true);
            maze[6][8] = new Square(true, false, true, true, 6, 8, false, false, true, true, true, true, false, false, false, false);
            maze[6][9] = new Square(false, false, true, true, 6, 9, false, false, false, false, false, false, false, false, false, false);

            maze[7][0] = new Square(false, true, true, false, 7, 0, false, false, false, false, true, false, true, true, false, false);
            maze[7][1] = new Square(true, true, false, false, 7, 1, false, false, false, false, false, false, false, false, false, false);
            maze[7][2] = new Square(true, false, false, false, 7, 2, false, false, false, false, false, false, false, false, true, false);
            maze[7][3] = new Square(false, true, false, true, 7, 3, false, false, true, false, false, false, false, false, true, true);
            maze[7][4] = new Square(true, false, true, true, 7, 4, false, false, true, true, true, true, false, false, false, false);
            maze[7][5] = new Square(false, false, true, true, 7, 5, false, false, false, false, false, false, false, false, false, false);
            maze[7][6] = new Square(false, true, true, false, 7, 6, false, false, false, false, false, false, true, true, false, false);
            maze[7][7] = new Square(true, true, false, false, 7, 7, false, false, false, false, false, false, false, false, false, false);
            maze[7][8] = new Square(false, false, false, true, 7, 8, false, false, true, false, false, false, true, false, false, false);
            maze[7][9] = new Square(false, false, true, true, 7, 9, false, false, false, false, false, false, false, false, false, false);

            maze[8][0] = new Square(true, false, true, false, 8, 0, false, false, true, true, false, false, false, false, false, false);
            maze[8][1] = new Square(true, true, false, false, 8, 1, false, false, false, false, false, false, false, false, false, false);
            maze[8][2] = new Square(false, true, false, true, 8, 2, false, false, false, false, false, false, false, false, true, true);
            maze[8][3] = new Square(true, false, true, false, 8, 3, false, false, true, true, false, false, false, false, true, false);
            maze[8][4] = new Square(false, true, false, false, 8, 4, false, false, true, false, false, false, false, false, false, false);
            maze[8][5] = new Square(false, true, false, false, 8, 5, false, false, false, false, true, false, false, false, false, false);
            maze[8][6] = new Square(true, false, false, false, 8, 6, false, false, false, false, false, false, false, false, false, false);
            maze[8][7] = new Square(true, false, false, true, 8, 7, false, false, false, false, true, true, false, false, false, false);
            maze[8][8] = new Square(false, false, true, true, 8, 8, false, false, false, false, false, false, false, false, false, false);
            maze[8][9] = new Square(false, true, true, true, 8, 9, false, false, false, false, false, false, true, true, true, true);

            maze[9][0] = new Square(false, true, true, false, 9, 0, false, false, false, false, false, false, true, true, false, false);
            maze[9][1] = new Square(true, true, false, false, 9, 1, false, false, false, false, false, false, false, false, false, false);
            maze[9][2] = new Square(true, true, false, false, 9, 2, false, false, false, false, false, false, false, false, false, false);
            maze[9][3] = new Square(false, true, false, true, 9, 3, false, false, true, false, false, false, false, false, true, true);
            maze[9][4] = new Square(true, true, true, false, 9, 4, true, false, true, true, false, false, true, true, false, false);
            maze[9][5] = new Square(true, true, false, false, 9, 5, false, false, false, false, false, false, false, false, false, false);
            maze[9][6] = new Square(false, true, false, true, 9, 6, false, false, false, false, false, false, false, false, true, true);
            maze[9][7] = new Square(false, true, true, true, 9, 7, false, false, false, false, false, false, true, true, true, true);
            maze[9][8] = new Square(false, true, true, false, 9, 8, false, false, false, false, true, false, true, true, false, false);
            maze[9][9] = new Square(true, true, false, true, 9, 9, false, true, false, false, true, true, false, false, true, true);
        }
        if(level==3)
        {
            maze[0][0] = new Square(true, true, true, false, 0, 0, false, false, true, true, false, false, true, true, false, false);
            maze[0][1] = new Square(true, false, false, false, 0, 1, false, false, false, false, false, false, true, false, true, false);
            maze[0][2] = new Square(true, true, false, false, 0, 2, false, false, false, false, false, false, false, false, false, false);
            maze[0][3] = new Square(true, true, false, false, 0, 3, false, false, false, false, false, false, false, false, false, false);
            maze[0][4] = new Square(true, true, false, false, 0, 4, false, false, false, false, false, false, false, false, false, false);
            maze[0][5] = new Square(true, true, false, false, 0, 5, false, false, false, false, false, false, false, false, false, false);
            maze[0][6] = new Square(true, true, false, false, 0, 6, false, false, false, false, false, false, false, false, false, false);
            maze[0][7] = new Square(true, false, false, false, 0, 7, false, false, false, false, false, false, false, false, true, false);
            maze[0][8] = new Square(true, true, false, false, 0, 8, false, false, false, false, false, false, false, false, false, false);
            maze[0][9] = new Square(true, true, false, true, 0, 9, true, false, false, false, true, true, false, false, true, true);

            maze[1][0] = new Square(true, false, true, true, 1, 0, false, false, true, true, true, true, false, false, false, false);
            maze[1][1] = new Square(false, false, true, true, 1, 1, false, false, false, false, false, false, false, false, false, false);
            maze[1][2] = new Square(true, true, true, false, 1, 2, false, false, true, true, false, false, true, true, false, false);
            maze[1][3] = new Square(true, false, false, false, 1, 3, false, false, false, false, false, false, true, false, false, false);
            maze[1][4] = new Square(true, true, false, false, 1, 4, false, false, false, false, false, false, false, false, false, false);
            maze[1][5] = new Square(true, true, false, false, 1, 5, false, false, false, false, false, false, false, false, false, false);
            maze[1][6] = new Square(true, true, false, false, 1, 6, false, false, false, false, false, false, false, false, false, false);
            maze[1][7] = new Square(false, true, false, true, 1, 7, false, false, false, false, false, false, false, false, true, true);
            maze[1][8] = new Square(true, false, true, false, 1, 8, false, false, true, true, false, false, false, false, false, false);
            maze[1][9] = new Square(true, false, false, true, 1, 9, false, false, false, false, true, true, false, false, false, false);

            maze[2][0] = new Square(false, true, true, false, 2, 0, false, false, false, false, false, false, true, true, false, false);
            maze[2][1] = new Square(false, false, false, false, 2, 1, false, false, false, false, true, false, false, false, false, false);
            maze[2][2] = new Square(true, true, false, true, 2, 2, false, false, false, false, true, true, false, false, true, true);
            maze[2][3] = new Square(false, true, true, false, 2, 3, false, false, false, false, false, false, true, true, false, false);
            maze[2][4] = new Square(true, true, false, false, 2, 4, false, false, false, false, false, false, false, false, false, false);
            maze[2][5] = new Square(true, true, false, false, 2, 5, false, false, false, false, false, false, false, false, false, false);
            maze[2][6] = new Square(true, false, false, false, 2, 6, false, false, false, false, false, false, false, false, false, false);
            maze[2][7] = new Square(true, true, false, true, 2, 7, false, false, false, false, true, true, false, false, true, true);
            maze[2][8] = new Square(false, false, true, true, 2, 8, false, false, false, false, false, false, false, false, false, false);
            maze[2][9] = new Square(false, false, true, true, 2, 9, false, false, false, false, false, false, false, false, false, false);

            maze[3][0] = new Square(true, false, true, false, 3, 0, false, false, true, true, false, false, false, false, true, false);
            maze[3][1] = new Square(false, true, false, false, 3, 1, false, false, false, false, false, false, false, false, false, false);
            maze[3][2] = new Square(true, true, false, false, 3, 2, false, false, false, false, false, false, false, false, false, false);
            maze[3][3] = new Square(true, true, false, true, 3, 3, false, false, false, false, true, true, false, false, true, true);
            maze[3][4] = new Square(true, false, true, false, 3, 4, false, false, true, true, false, false, false, false, true, false);
            maze[3][5] = new Square(true, true, false, false, 3, 5, false, false, false, false, false, false, false, false, false, false);
            maze[3][6] = new Square(false, true, false, false, 3, 6, false, false, false, false, false, false, false, false, false, false);
            maze[3][7] = new Square(true, true, false, true, 3, 7, false, false, false, false, true, true, false, false, true, true);
            maze[3][8] = new Square(false, false, true, true, 3, 8, false, false, false, false, false, false, false, false, false, false);
            maze[3][9] = new Square(false, false, true, true, 3, 9, false, false, false, false, false, false, false, false, false, false);

            maze[4][0] = new Square(false, false, true, true, 4, 0, false, false, false, false, false, false, false, false, false, false);
            maze[4][1] = new Square(true, false, true, false, 4, 1, false, false, true, true, false, false, false, false, false, false);
            maze[4][2] = new Square(true, true, false, false, 4, 2, false, false, false, false, false, false, false, false, false, false);
            maze[4][3] = new Square(true, true, false, false, 4, 3, false, false, false, false, false, false, false, false, false, false);
            maze[4][4] = new Square(false, true, false, true, 4, 4, false, false, true, false, false, false, false, false, true, true);
            maze[4][5] = new Square(true, false, true, true, 4, 5, false, false, true, true, true, true, false, false, false, false);
            maze[4][6] = new Square(true, false, true, false, 4, 6, false, false, true, true, false, false, false, false, false, false);
            maze[4][7] = new Square(true, false, false, true, 4, 7, false, false, false, false, true, true, false, false, false, false);
            maze[4][8] = new Square(false, false, true, true, 4, 8, false, false, false, false, false, false, false, false, false, false);
            maze[4][9] = new Square(false, false, true, true, 4, 9, false, false, false, false, false, false, false, false, false, false);

            maze[5][0] = new Square(false, true, true, true, 5, 0, true, false, false, false, false, false, true, true, true, true);
            maze[5][1] = new Square(false, true, true, false, 5, 1, false, false, false, false, false, false, true, true, false, false);
            maze[5][2] = new Square(true, true, false, false, 5, 2, false, false, false, false, false, false, false, false, false, false);
            maze[5][3] = new Square(true, true, false, false, 5, 3, false, false, false, false, false, false, false, false, false, false);
            maze[5][4] = new Square(true, false, false, false, 5, 4, false, false, false, false, false, false, false, false, false, false);
            maze[5][5] = new Square(false, true, false, true, 5, 5, false, false, true, false, false, false, false, false, true, true);
            maze[5][6] = new Square(false, false, true, true, 5, 6, false, false, false, false, false, false, false, false, false, false);
            maze[5][7] = new Square(false, false, true, true, 5, 7, false, false, false, false, false, false, false, false, false, false);
            maze[5][8] = new Square(false, false, true, true, 5, 8, false, false, false, false, false, false, false, false, false, false);
            maze[5][9] = new Square(false, false, true, true, 5, 9, false, false, false, false, false, false, false, false, false, false);

            maze[6][0] = new Square(true, false, true, false, 6, 0, false, false, true, true, false, false, false, false, true, false);
            maze[6][1] = new Square(true, true, false, false, 6, 1, false, false, false, false, false, false, false, false, false, false);
            maze[6][2] = new Square(true, false, false, false, 6, 2, false, false, false, false, false, false, false, false, true, false);
            maze[6][3] = new Square(true, true, false, false, 6, 3, false, false, false, false, false, false, false, false, false, false);
            maze[6][4] = new Square(false, true, false, false, 6, 4, false, false, false, false, false, false, false, false, false, false);
            maze[6][5] = new Square(true, true, false, true, 6, 5, false, false, false, false, true, true, false, false, true, true);
            maze[6][6] = new Square(false, false, true, true, 6, 6, false, false, false, false, false, false, false, false, false, false);
            maze[6][7] = new Square(false, false, true, true, 6, 7, false, false, false, false, false, false, false, false, false, false);
            maze[6][8] = new Square(false, false, true, true, 6, 8, false, false, false, false, false, false, false, false, false, false);
            maze[6][9] = new Square(false, false, true, true, 6, 9, false, false, false, false, false, false, false, false, false, false);

            maze[7][0] = new Square(false, false, true, true, 7, 0, false, false, false, false, false, false, false, false, false, false);
            maze[7][1] = new Square(true, true, true, false, 7, 1, false, false, true, true, false, false, true, true, false, false);
            maze[7][2] = new Square(false, true, false, true, 7, 2, false, false, false, false, false, false, false, false, true, true);
            maze[7][3] = new Square(true, false, true, false, 7, 3, false, false, true, true, false, false, false, false, false, false);
            maze[7][4] = new Square(true, true, false, false, 7, 4, false, false, false, false, false, false, false, false, false, false);
            maze[7][5] = new Square(true, true, false, false, 7, 5, false, false, false, false, false, false, false, false, false, false);
            maze[7][6] = new Square(false, true, false, true, 7, 6, false, false, true, false, false, false, false, false, true, true);
            maze[7][7] = new Square(false, true, true, false, 7, 7, false, false, false, false, false, false, true, true, false, false);
            maze[7][8] = new Square(false, true, false, true, 7, 8, false, false, false, false, false, false, false, false, true, true);
            maze[7][9] = new Square(false, false, true, true, 7, 9, false, false, false, false, false, false, false, false, false, false);

            maze[8][0] = new Square(false, false, true, true, 8, 0, false, false, false, false, false, false, false, false, false, false);
            maze[8][1] = new Square(true, false, true, false, 8, 1, false, false, true, true, false, false, false, false, false, false);
            maze[8][2] = new Square(true, false, false, true, 8, 2, false, false, false, false, true, true, false, false, false, false);
            maze[8][3] = new Square(false, false, true, false, 8, 3, false, false, false, false, false, false, false, false, true, false);
            maze[8][4] = new Square(true, true, false, true, 8, 4, true, false, false, false, true, true, false, false, true, true);
            maze[8][5] = new Square(true, false, true, false, 8, 5, false, false, true, true, false, false, false, false, false, false);
            maze[8][6] = new Square(true, true, false, false, 8, 6, false, false, false, false, false, false, false, false, false, false);
            maze[8][7] = new Square(true, true, false, false, 8, 7, false, false, false, false, false, false, false, false, false, false);
            maze[8][8] = new Square(true, true, false, false, 8, 8, false, false, false, false, false, false, false, false, false, false);
            maze[8][9] = new Square(false, true, false, true, 8, 9, false, false, true, false, false, false, false, false, true, true);

            maze[9][0] = new Square(false, true, true, false, 9, 0, false, false, false, false, false, false, true, true, false, false);
            maze[9][1] = new Square(false, true, false, true, 9, 1, false, false, false, false, false, false, false, false, true, true);
            maze[9][2] = new Square(false, true, true, false, 9, 2, false, false, false, false, false, false, true, true, false, false);
            maze[9][3] = new Square(false, true, false, true, 9, 3, false, false, false, false, false, false, false, false, true, true);
            maze[9][4] = new Square(true, true, true, false, 9, 4, false, false, true, true, false, false, true, true, false, false);
            maze[9][5] = new Square(false, true, false, false, 9, 5, false, false, true, false, false, false, false, false, false, false);
            maze[9][6] = new Square(true, true, false, false, 9, 6, false, false, false, false, false, false, false, false, false, false);
            maze[9][7] = new Square(true, true, false, false, 9, 7, false, false, false, false, false, false, false, false, false, false);
            maze[9][8] = new Square(true, true, false, false, 9, 8, false, false, false, false, false, false, false, false, false, false);
            maze[9][9] = new Square(true, true, false, true, 9, 9, false, true, false, false, true, true, false, false, true, true);
        }

        if(level==4)
        {
            Win win = new Win();
            Greenfoot.setWorld(win);
        }
        /*
        if(level==5)
        {
        Scene1 one = new Scene1();
        Greenfoot.setWorld(one);
        }
        if(level==6)
        {
        Scene2 two = new Scene2();
        Greenfoot.setWorld(two);
        }
        if(level==7)
        {
        Scene3 three = new Scene3();
        Greenfoot.setWorld(three);
        }*/
    }

    public void act()
    {

    }

    public Square getSquare(int row, int col)
    {
        return this.maze[row][col];
    }

    public int rows()
    {
        return this.rows;
    }

    public int cols()
    {
        return this.cols;
    }

    public void setExplorer(Explorer e)
    {
        this.explorer = e;
    }
}