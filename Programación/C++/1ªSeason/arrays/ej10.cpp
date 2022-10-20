#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;
/*
10. Desarrolla un programa que genere un array de tamaño 100 con
elementos aleatorios del 1 al 200. Una vez generado, crea arrayPar y
arrayImpar y almacena en estos los números que correspondan a cada uno.
(ojo con los tamaños)
*/
int main()
{
    system("cls");
    int ran = 0, aux = 0, count = 0;
    int arrai[100];
    int arraipar[100];
    int arraimpar[100];
    srand(time(NULL));
    for (int i = 0; i < 100; i++)
    {
        ran = rand() % 200 + 1;
        arrai[i] = ran;
    }
    for (int j = 0; j < 100; j++)
    {
        if (arrai[j] % 2 == 0)
        {
            arraipar[aux] = arrai[j];
            aux++;
        }
        else
        {
            arraimpar[count] = arrai[j];
            aux++;
        }
    }
}