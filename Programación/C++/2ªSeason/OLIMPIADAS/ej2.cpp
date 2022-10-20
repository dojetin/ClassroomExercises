#include <iostream>
#include <stdlib.h>
using namespace std;
/*
  for (int i = 0; i < num_reyes; i++)
        {
            if (name==nombre_reyes[num_reyes])
            {
                numerito++;
                num_reyes--;
            }

        }
*/
int main()
{
    system("cls");
    int aux = 0, numerito = 1;
    int cantidad_reyes = 0;
    string name;
    cout << "Cuantos reyes habia en la dinastia?\n";
    cin >> cantidad_reyes;
    int num_reyes = cantidad_reyes;
    string nombre_reyes[cantidad_reyes];
    if (cantidad_reyes > 0)
    {
        for (int i = 0; i < cantidad_reyes; i++)
        {
            cout << "dime el nombre\n";
            cin >> nombre_reyes[i];
        }
        cout << "que nombre quieres comprobar?\n";
        cin >> name;
        for (int i = 0; i < cantidad_reyes; i++)
        {
            if (name == nombre_reyes[i])
            {
                numerito++;
            }
        }

        cout << name << numerito;
        cout << endl;
    }
}