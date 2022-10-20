#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;
/*
6. Desarrolla un programa que genere dos Arrays aleatorios (arrayA y
arrayB) ambos con 10 elementos. El programa deberá sumarlos en un tercer
array (arrayR) y mostrar los tres por pantalla.ç
*/
int main()
{
    int ran;
    system("cls");
    srand(time(NULL));
    int arrai1[10];
    int arrai2[10];
    int arrai3[10];
    for (int i = 0; i < 10; i++)
    {
        ran = rand() % 100;
        arrai1[i] = ran;
        ran = rand() % 100;
        arrai2[i] = ran;
        arrai3[i] = arrai1[i]+arrai2[i];
        cout<<arrai1[i]<<endl<<arrai2[i]<<endl<<arrai3[i]<<endl;
    }
}