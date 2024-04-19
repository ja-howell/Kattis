using System;
using System.IO;

namespace RobotTurtles
{
    class Program
    {
        static void Main()
        {
            // Read 8x8 grid from standard input (console)
            char[][] grid = new char[8][];
            for (int i = 0; i < 8; i++)
            {
                string line = Console.ReadLine();
                grid[i] = line.ToCharArray();
            }

            Solution solution = new Solution();
            string path = solution.TurtlesBFS(grid);
            Console.WriteLine(path);
        }
    }
}