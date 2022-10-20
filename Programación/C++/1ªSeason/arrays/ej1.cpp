#include <iostream>
#include <stdlib.h>
#include<time.h>

using namespace std;
/*
1. Desarrolla un programa que cree 10 valores de un array de enteros
aleatorios y calcule su media aritmética.
*/
int main()
{
    system("cls");
    int piteranguila[10];
    int total=0, media=0;
    srand(time(NULL));
    for (int i = 0; i < 10; i++)
    {
        piteranguila[i]=rand()%100;
        total=total+piteranguila[i];
       

    }
    media=total/10;
    cout<<"La media es "<<media;
}