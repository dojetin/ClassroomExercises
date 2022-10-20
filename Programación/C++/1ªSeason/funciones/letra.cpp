#include <iostream>
#include <stdlib.h>
using namespace std;
/*
Desarrolle un algoritmo que lea números enteros por teclado hasta que le introduzcamos un 0. 
En ese momento nos mostrará por pantalla el número más alto que hayamos introducido, la 
media aritmética de todos ellos y cuantos números hemos introducido
*/

bool vocal();
int main()
{
    char letra;
    cout << "Introduce una letra";
    cin >> letra;
    if (vocal(letra==true))
    {
        cout<<"Es vocal";
    }else{
        cout<<"Es consonante";
    }
    
}

bool vocal(char letra)
{
    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
    {
        return true;
    }
    else
    {
        return false;
    }
}
