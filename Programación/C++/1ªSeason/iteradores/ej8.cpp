#include <iostream>
#include <stdlib.h>
using namespace std;
/*
8. Crea un programa que imprime en pantalla tantos números pares como se le
indique desde el teclado, empezando por el número 2, y finalmente los sume
todos 
*/
int main()
{
    int num = 0, suma = 0, total=0;
    system("cls");
    cout << "Cuantos numeros pares quieres? \n";
    cin >> num;
    system("cls");
    for (int i = 0; i < num; i++)
    {
        
        suma = suma + 2;
        cout << suma<<endl;
        total=total+suma;
    }

    cout<<"La suma es "<<total;
    return 0;
}