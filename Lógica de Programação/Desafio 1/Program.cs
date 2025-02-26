using System.Xml.Linq;
using ConsoleApp1.Utils; // This is crucial!
int valueOne,valueTwo,valueThree = 0;
 
valueOne = Readers.ReadInteger();
valueTwo = Readers.ReadInteger();
valueThree = Readers.ReadInteger();

Console.Write(valueOne);
Console.Write(valueTwo);
Console.Write(valueThree);

valueTwo = valueThree;
valueThree = valueOne;
valueOne = valueTwo;

Console.Write("\n");
Console.Write(valueOne);
Console.Write(valueTwo);
Console.Write(valueThree);


