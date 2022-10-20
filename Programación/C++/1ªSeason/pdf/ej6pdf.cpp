#include <iostream>
#include <stdlib.h>
using namespace std;
/*
6- Desarrollar un programa que pide tres números enteros y luego evalúa si la
multiplicación de los dos primeros es igual al tercero.
*/
int main()
{
    int num1, num2, num3;
    system("cls");
    cout << "Introduce 3 numeros \n";
    cin >> num1;
    cin >> num2;
    cin >> num3;
    if (num1 * num2 == num3)
    {
        cout << "Es igual";
    }
    else
    {
        cout << "No es igual";
    }
}