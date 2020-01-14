public class prints_maze_class
{
    public static void printmaze(int[][]maze){
        int k = maze.length;
        int l = maze[0].length;
        
        for(int row = 0;row<k; row++){
            for(int col = 0; col<l; col++){
                if(col == 0){
                    System.out.println();
                }
                System.out.print(maze[row][col]);
            }
        }
    }
    
    
    
    public static void main()
    {
        int k = 0;
        int l = 0;
        int j = 0;
        int f = 0;              
        int[][] maze = new int[0][0];
        String X = read_data_and_print_class.readString();
        //maze 1 = 23, space, passiable
        //maze 2 = 867, space, passiable
        //maze 3 = 416, tab, passiable
        for(int i = 1;i<416;i++){
            if(i == 1){
               k = Integer.parseInt(X);
            }
            if(i == 2){
               l = Integer.parseInt(X);
               maze = new int[k][l];
            }
            if(i > 2){
               String[] ff = X.split("	", -1);
               j = Integer.parseInt(ff[0]);
               f = Integer.parseInt(ff[1]);
               maze[j][f] = 1;  
           
            }
            X = read_data_and_print_class.readString();
        }
        
        printmaze(maze);
    }
    
}
