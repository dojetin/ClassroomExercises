#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <windows.h>
using namespace std;
/*
Crea un programa que trabaje con un fichero mostrado por pantalla los datos que tenga
almacenados.
*/
int main()
{
    SetConsoleOutputCP(CP_UTF8);
    int eleccion = 1;
    
    while (eleccion < 5 && eleccion > 0)
    {
        do
    {
        system("cls");
        cout << "Bienvenidos queridos fieles, ¿Qué deseais realizar?\n";
        cout << "1. Lectura de la biblia\n";
        cout << "2. Escritura en la biblia desde cero\n";
        cout << "3. Añadir texto a la biblia\n";
        cout << "4. Salir\n";
        cin >> eleccion;
    } while (eleccion < 1 || eleccion > 4);
        switch (eleccion)
        {
        case 1:
        {
            string texto;
            ifstream lectura;
            lectura.open("eldel8.txt");
            if (lectura.is_open())
            {
                while (!lectura.eof())
                {
                    getline(lectura, texto);
                    cout << texto << endl;
                }
            system("pause");

                
            }else
            {
                cout << "Error al abrir el archivo.\n";
            }
            lectura.close();
            break;
        }
        case 2:
        {
            string frase2;
            ofstream escritura;
            escritura.open("eldel8.txt");
            if (escritura.is_open())
            {
                fflush(stdin);
                system("cls");
                cout << "Escribe una frase\n";
                getline(cin, frase2);
                escritura << frase2 << endl;
            }
            else
            {
                cout << "Error al abrir el archivo.\n";
            }
            escritura.close();
            break;
        }
        case 3:
        {
            string frases_m;
            ofstream escritura;
            escritura.open("eldel8.txt", ios::app);
            if (escritura.is_open())
            {
                fflush(stdin);
                system("cls");
                cout << "Escribe una frase\n";
                getline(cin, frases_m);
                escritura << frases_m << endl;
            }
            escritura.close();
            break;
        }
        default:
            exit(0);
            break;
        }
    }
}