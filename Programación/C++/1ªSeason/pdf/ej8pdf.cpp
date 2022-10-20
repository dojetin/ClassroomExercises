#include <iostream>
#include <stdlib.h>
using namespace std;
/*
8- Crear un programa que pida dos números, luego calcule el promedio y muestre un
mensaje según el promedio obtenido de acuerdo al rango de datos del siguiente cuadro:
<0,5] Categoría Alfa
<5,10] Categoría Beta
<10,13] Categoría Gama
<13,16] Categoría Delta
<16,20] Categoría Epsilon
*/
int main()
{
    double media, num1, num2;
    system("cls");
    cout << "Introduce dos numeros \n";
    cin >> num1;
    cin >> num2;
    media = (num1 + num2) / 2;
    system("cls");

    if (media < 0.5)
    {
        cout << "Ha obtenido la categoria Alfa";
    }
    else if (media < 5.10)
    {
        cout << "Ha obtenido la categoria Beta";
    }
    else if (media < 10.13)
    {
        cout << "Ha obtenido la categoria Gama";
    }
    else if (media < 13.16)
    {
        cout << "Ha obtenido la categoria Delta";
    }
    else
        cout << "Ha obtenido la categoria Epsilon";
}