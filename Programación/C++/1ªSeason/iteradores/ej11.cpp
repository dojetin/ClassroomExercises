#include <iostream>
#include <stdlib.h>
using namespace std;
/*
11. Hacer el anterior pero que imprima una pirámide normal.
*/
int main()
{
    int num, aux;
    system("cls");
    do
    {
        cout << "Introduce un numero \n";
        cin >> num;
    } while (num < 1);

    for (int i = 0; i < num; i++)
    {
        for (int e = 0; e > num; e++)
        {
            cout << "*";
        }
        cout << "\n";
    }
}