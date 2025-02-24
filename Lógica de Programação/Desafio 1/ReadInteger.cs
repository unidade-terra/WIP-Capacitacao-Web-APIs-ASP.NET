using System;


namespace ConsoleApp1.Utils
{
    public class Readers
    {
        public static int ReadInteger()
        {
            while (true)
            {
                string input = Console.ReadLine();

                if (int.TryParse(input, out int result))
                {
                    return result;
                }
                else
                {
                    Console.WriteLine("Invalid input. Please enter an integer.");
                }
            }
        }
    }
}