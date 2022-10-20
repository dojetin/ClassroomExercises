#include <iostream>
#include <stdlib.h>
using namespace std;
/*
14. Leer por teclado un número entero N no negativo y mostrar el factorial de
todos los números desde 0 hasta N
*/
int main()
{
    int num, aux, contador;
    system("cls");
    do
    {
        cout << "Introduce un numero \n";
        cin >> num;
    } while (num < 1);
    aux = num-1;
    contador = num;
    system("cls");
    for (int i = 1; i != contador; i++)
    {
        num=num*aux;
        aux--;
    }
    cout << num<<" ";
}