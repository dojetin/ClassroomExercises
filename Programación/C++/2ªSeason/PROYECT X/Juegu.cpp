#include <iostream>
#include <stdlib.h>
#include <windows.h>
#include <fstream>
using namespace std;
/*

*/
int main()
{
    string linea;
    SetConsoleOutputCP(CP_UTF8);
    struct Jugador
    {
        string nombre;
        int vida = 100;
        float ad = 10;
        float ap = 10;
        int mana = 100;
    };

    struct enemigo
    {
        int vida = 100;
        int danyo = 14;
    };
    system("cls");
    int eleccion;
    Jugador jugador1;
    cout << "¿Qué nombre quieres usar?\n";
    cin >> jugador1.nombre;
    system("cls");
    cout << "Bienvenido " + jugador1.nombre + "\n";
    system("pause");
    system("cls");
    do
    {
        cout << "¿Qué arma inicial quieres usar?\n";
        cout << "1. Espada de doran (+5 ad +10 vida)\n";
        cout << "2. Anillo de doran (+4 ap +20 mana)\n";
        cin >> eleccion;
    } while (eleccion < 1 || eleccion > 2);

    switch (eleccion)
    {
    case 1:
        jugador1.ad = jugador1.ad + 5;
        jugador1.vida = jugador1.vida + 10;
        cout << "Has elegido la: Espada de doran, sabia elección, este objeto te acompañara durante todo tu camino\n";
        break;
    case 2:
        jugador1.ap = jugador1.ap + 4;
        jugador1.mana = jugador1.mana + 20;
        cout << "Has elegido el: Anillo de doran, menudo acierto, este objeto te acompañara durante todo tu camino\n";
        break;
    default:
        break;
    }
    system("pause");
    system("cls");
    cout << "Ahora te enfrentaras a tu primer enemigo, pulsa espacio cuando estés listo\n";
    system("pause");
    ifstream lectura;
    lectura.open("orco.txt");
    enemigo enemigo1;
    if (lectura.is_open())
    {
        cout << "             " << jugador1.nombre << "                             orco";  
        getline(lectura, linea);
        cout << linea << endl;
        while (!lectura.eof())
        {
            getline(lectura, linea);
            cout << linea << endl;
        }
    }

    while (jugador1.vida > 0 && enemigo1.vida > 0)
    {
        do
        {

            cout << "             " << jugador1.nombre << "                             orco";
            getline(lectura, linea);
            cout << linea << endl;
            while (!lectura.eof())
            {
                getline(lectura, linea);
                cout << linea << endl;
            }

            cout << "             " << jugador1.vida << "HP";
            cout << "                             " << enemigo1.vida << "HP\n";
            cout << "             " << jugador1.mana << "MP\n\n";
            cout << "\tQué deseas hacer?\n";
            cout << "\t1. Ataque físico\n";
            cout << "\t2. Ataque mágico\n";
            int eleccion;
            cin >> eleccion;

            if (eleccion == 1)
            {
                enemigo1.vida = enemigo1.vida - jugador1.ad;
                if (enemigo1.vida > 0)
                {
                    jugador1.vida = jugador1.vida - enemigo1.danyo;
                }
            }
            else if (jugador1.mana >= 20)
            {
                jugador1.mana = jugador1.mana - 20;
                enemigo1.vida = enemigo1.vida - jugador1.ap;
                if (enemigo1.vida > 0)
                {
                    jugador1.vida = jugador1.vida - enemigo1.danyo;
                }
            }
            else
            {
                
                cout << "No te queda maná mongol\n";
                system("pause");
            }
        } while (eleccion > 2 || eleccion < 0);
    }
    if (jugador1.vida < 0)
    {
        cout << "Eres malardo amigo";
    }
    else
    {
        cout << "Ere un crack amigo";
    }
}
