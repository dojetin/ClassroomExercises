#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;
/*
Desarrolla un programa que genere un número aleatorio entre 1 y 100. El usuario deberá
adivinar dicho número introduciendo valores por teclado. El programa deberá decirle al
usuario si el número que ha introducido es mayor o menor que el que genero aleatoriamente
al principio, hasta que lo adivine. Al final poner texto de felicitación por haberlo adivinado y el
número de intentos que ha necesitado.
*/
int main()
{
    int azar, intento = 0; //Definimos variables y creamos el numero "Aleatorio"
    srand(time(NULL));
    azar = rand() % (101 - 1);
    system("cls");
    do
    {
       
        system("cls");
        cout << "Intenta adivinar el numero \n"; //Le pedimos que intente adivinar el numero
        cin >> intento;
        if (intento < azar) //Si el numero introducido es menor se lo decimos y si es mayor tambien
        {
            cout << "El numero secreto es mayor\n";
        }
        else if (intento > azar)
        {
            cout << "El numero secreto es menor\n";
        }
         system("pause");
    } while (intento != azar); //Mientras no lo acierte, tiene que seguir intentandolo
    cout << "Vaya crack, lo has conseguido!!!";
}