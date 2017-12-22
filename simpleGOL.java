package dataStructures.array;  
public class simpleGOL{  
    private final int HEIGHT=15;//二维游戏世界的大小。HEIGHT*WIDTH 个字符  
    private final int WIDTH =60;  
    private char[][] world = new char[HEIGHT][WIDTH];  
    private final char Y ='*'; //用字符*代表一个细胞  
    private final char No = ' ';  
    /** 
     * 构造器。使用预定义的数据初始化world.  
     */  
    simpleGOL(){  
        world[3][4] = world[3][5] = world[3][6] =Y;  
        //glider  
        world[10][4] =  world[10][5] =  world[10][6] =  world[11][6] =  world[12][5] = Y;  
    }  
    /** 
     * 在控制台中输出world数据 
     */  
    private void print(){  
        for (int height = 0; height < HEIGHT; height++) {  
            for (int width = 0;width < WIDTH; width++) {  
                char c = ( world[height][width] == Y) ? Y: No ;  
                System.out.print(c);  
            }  
            System.out.println("");  
        }  
        System.out.println("");  
    }     
}  
