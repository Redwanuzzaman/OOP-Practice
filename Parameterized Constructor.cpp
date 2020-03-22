#include <iostream>

using namespace std;

class Test
{
	int ant;
	public :
		Test(int i)       //constructor with arguments
		{
			ant = i;
		}
		 :                //other members
};
int main()
{
	Test object1(45);             //ok, Argument value provided
	Test object2(2222);           //Error !! No default constructor available

}
