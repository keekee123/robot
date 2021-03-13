
package robot;

import java.awt.Point;
import java.util.Scanner;
/*class checkCode
{
    public int code(String command)
    {
    
        String check[]=command.split("");
        if (check)
        return 1;
    }
}
*/
class Robot {

  public static void main(String[] arguments) {
    Point robot = new Point(0, 0);
    /*checkCode cc = new checkCode();*/
    String command;

    System.out.println("Robot location : " + robot.x + "." + robot.y);
    System.out.print("Enter the steps : ");
    
    Scanner sc = new Scanner(System.in);
    
    command=sc.nextLine();
    sc.close();
    char[] direction = command.toCharArray();
    char symbol[] = new char[direction.length];
    char steps[] = new char[direction.length];

    for (int i=0,c1 =0,c2=0;i<=direction.length-1;i++)

    {
        if (direction[i]=='f'||direction[i]=='b'||direction[i]=='l'||direction[i]=='r'||direction[i]=='F'||direction[i]=='B'||direction[i]=='L'||direction[i]=='R')
        {
            symbol[c1] =direction[i];
            System.out.print("("+symbol[c1]+")");
            c1++;
        }
        else 
        {
        steps[c2]=direction[i];
        System.out.println("[" + steps[c2] + "]");
        c2++;
        }
    }

    for (int j=0;j<=direction.length/2;j++)
    {
        if (symbol[j]=='l'||symbol[j]=='L')
        {
            robot.x -= steps[j];
        }
        if (symbol[j]=='r'||symbol[j]=='R')
        {
            robot.x += steps[j];
        }
        if (symbol[j]=='f'||symbol[j]=='F')
        {
            robot.y += steps[j];
        }
        if (symbol[j]=='b'||symbol[j]=='B')
        {
            robot.y -= steps[j];
        }

    }

    System.out.println("\nNew Robot location : ("+ robot.x + "." + robot.y+")");
    System.out.println("X : " + robot.x + '\n' + "Y : " +robot.y);
    
}
}