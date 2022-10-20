#include <iostream>
#include <stdlib.h>
using namespace std;
/*
Realice un programa que nos lleve la cuentas de nuestros ingresos y gastos. Al iniciar el 
programa debe salir un menú con estas opciones:
1-Ver saldo
2-Ingreso
3-Gasto
4-Salir
Inicialmente nuestro saldo es 0. 
Si elegimos 1 (Ver saldo) nos muestra nuestro saldo actual y vuelve al menú
Si elegimos 2 (Ingreso) nos pide que ingresemos una nueva cantidad, la mete en el saldo total y 
vuelve al menú
Si elegimos 3 (Gasto) nos pide que introduzcamos un nuevo gasto. Si la cantidad que 
introducimos es mayor al saldo nos niega la operación y vuelve al menú
Si elegimos 4 Finaliza el programa.
*/
int main()
{
    int eleccion;
    double saldo = 0, ingreso = 0, gasto = 0;   //Declaracion e inicializacion de variables
    do
    {
        do //Aquí se le pide un numero del 1 al 4
        {
            system("cls");
            cout << "1-Ver saldo\n2-Ingreso\n3-Gasto\n4-Salir\n";
            cin >> eleccion;

        } while (eleccion < 0 && eleccion > 5);
        switch (eleccion)   //Este es el menu con cada opcion
        {
        case 1: //Le muestra el saldo
            cout << "Tu saldo actual es de " << saldo << endl;
            system("pause");
            break;
        case 2: //Le hace el ingreso
            cout << "Cuanto quieres ingresar?\n";
            cin >> ingreso;
            saldo = saldo + ingreso;
            system("pause");
            break;
        case 3: //Le resta una cantidad
            cout << "Cuanto vas a gastar? \n";
            cin >> gasto;
            if (gasto > saldo)  //Si el gasto es mayor al saldo le niega la operación
            {
                cout << "Operacion denegada \n";
            }
            else
                saldo = saldo - gasto;
            system("pause");
            break;
        default:
            break;
        }
    } while (eleccion != 4);
}
