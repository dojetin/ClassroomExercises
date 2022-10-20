#include <iostream>
#include <stdlib.h>
using namespace std;
/*
9. Desarrolla un programa que almacene 5 valores de un array de enteros,
introducidos por teclado y calcular cuál es la distancia que les separa al número
mayor del menor.
*/
int main()
{   
    int aux=0,res=0,mayor=0,menor=0;
    int arrai1[5];
    system("cls");
    for (int i = 0; i < 5; i++)
    {
        cout<<"Introduce un numero \n";
        cin>>res;
        if (i==0)
        {
            mayor=res;
            menor=res;
        }else if (res>mayor)
        {
            mayor=res;

        }else if (res<menor)
        {
            menor=res;
        }
        arrai1[aux]=res;
        aux++;
    }
    cout<<"La distancia del mayor y el menor es de "<<mayor-menor;
}