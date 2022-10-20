#include <iostream>
#include <stdlib.h>
#include <windows.h>
#include <time.h>
using namespace std;
int main()
{
    //Esto pa verlo en españo
    SetConsoleOutputCP(CP_UTF8);
    system("cls");
    //Declaracion de variables
    char arrai[7][7];
    char letra_menu, cons_vit, sist_ignic, sist_hidra, prueba_radio, bate_emerg;
    int intento_fila = 0, intento_columna = 0, col_azar = 0, fila_azar = 0, azar = 0, pass_cat = 2005, pass_robin = 1987, numero_filas = 7, numero_columnas = 7, intento_cat = 1000, intento_robin = 1000, cohetes = 0, errores = 0, gasofa = 0, km = 0;
    
    //Este do es el que adivina la contraseña sumandose 1 por uno y comparando
    do
    {
        cout << "*Hackeando Contraseña*\n";
        cout << intento_robin << endl
             << intento_cat << endl;
        if (intento_robin != pass_robin)
        {
            intento_robin++;
        }
        else
        {
            intento_cat++;
        }

    } while (intento_cat != pass_cat || intento_robin != pass_robin);
    system("cls");
    cout << "**Contraseña hackeada**\n";
    cout << "La contraseña de robin es " << intento_robin << endl;
    cout << "La contraseña de catwoman es " << intento_cat << endl;
    system("pause");

    //Este do repite hasta que metas una de las letras que debes meter
    do
    {
        system("cls");
        //Aquí te pido una letra para el switch
        cout << "¡Bienvenido al Batmovil!\n ¿Qué desea realizar?\n";
        cout << " C-Chequeo de controles\n D-Kilometraje\n E-Juego\n S-Salida\n";
        cin >> letra_menu;
        switch (letra_menu)
        {
        case 'C':
        case 'c':
            system("cls");
            //Este do repite el proceso si hay errores
            do
            {
                azar=0;
                errores = 0;
                srand(time(NULL));
                azar = rand() % (300);
                cout << "Comprobación de errores\n";
                cout << "*Comprobación del motor*\n";
                cout << "La temperatura del motor es de " << azar << endl;
                if (azar >= 90 && azar <= 150)
                {
                    cout << "Encendiendo ventiladores de refrigeración\n";
                }
                system("pause");
                //Siempre compruebo si meten la letra bien por si acaso
                do
                {
                    system("cls");
                    cout << "*Comprobación de constantes vitales*\n";
                    cout << "[y/n]\n";
                    cin >> cons_vit;
                } while (cons_vit != 'y' && cons_vit != 'n');
                do
                {
                    system("cls");
                    cout << "*Comprobación de sistemas de ignición*\n";
                    cout << "[y/n]\n";
                    cin >> sist_ignic;
                } while (sist_ignic != 'y' && sist_ignic != 'n');
                do
                {
                    system("cls");
                    cout << "*Comprobación de sistemas hidraulicos*\n";
                    cout << "[y/n]\n";
                    cin >> sist_hidra;
                } while (sist_hidra != 'y' && sist_hidra != 'n');
                do
                {
                    system("cls");
                    cout << "*Comprobación radio*\n";
                    cout << "[y/n]\n";
                    cin >> prueba_radio;
                } while (prueba_radio != 'y' && prueba_radio != 'n');

                do
                {
                    system("cls");
                    cout << "*Comprobación de batería de emergencia*\n";
                    cout << "[y/n]\n";
                    cin >> bate_emerg;
                } while (bate_emerg != 'y' && bate_emerg != 'n');

                srand(time(NULL));
                cohetes = rand() % (301);
                if (cohetes == 0)
                {
                    cout << "¡No quedan cohetes, debes recargar!!\n";
                }
                else if (cohetes <= 10)
                {
                    cout << "¡No quedan muchos cohetes, deberias recargar!!\n";
                }
                if (azar > 150)
                {
                    cout << "Motores demasiado calientes para continuar, espere que se enfrien\n";
                    errores++;
                }
                if (cons_vit == 'n')
                {
                    cout << "Error en constantes vitales \n";
                    errores++;
                }
                if (sist_ignic == 'n')
                {
                    cout << "Error en sistemas de ignición \n";
                    errores++;
                }
                if (sist_hidra == 'n')
                {
                    cout << "Error en sistemas hidraulicos \n";
                    errores++;
                }
                if (prueba_radio == 'n')
                {
                    cout << "Error en radio \n";
                    errores++;
                }
                if (bate_emerg == 'n')
                {
                    cout << "Error en batería de emergencia\n";
                    errores++;
                }
                system("pause");
                system("cls");
            } while (errores != 0);
            break;
        case 'D':
        case 'd':
            system("cls");
            srand(time(NULL));
            gasofa = rand() % (80);
            //Se pregunta los km y si hay suficiente gasofa
            do
            {
                cout << "¿Cuantos kilómetros desea recorrer?\n";
                cin >> km;
            } while (km < 0);
            if ((km * 0.006) > gasofa)
            {
                cout << "No hay suficiente gasolina\n";
            }
            else
            {
                cout << "Hay suficiente gasolina, puedes estar tranquilo :)\n";
            }
            system("pause");
            break;
        case 'E':
        case 'e':

            system("cls");

            //Aquí rellenamos el array de #
            for (int indice_fila = 0; indice_fila < numero_filas; indice_fila++)
            {
                for (int indice_columna = 0; indice_columna < numero_columnas; indice_columna++)
                {
                    arrai[indice_fila][indice_columna] = '#';
                }
            }
            srand(time(NULL));
            col_azar = rand() % (7);
            fila_azar = rand() % (7);
            arrai[fila_azar][col_azar] = 'H';
            //Lo mmostramos
            for (int indice_fila = 0; indice_fila < numero_filas; indice_fila++)
            {
                for (int indice_columna = 0; indice_columna < numero_columnas; indice_columna++)
                {
                    cout << arrai[indice_fila][indice_columna];
                }
                cout << endl;
            }
            Sleep(2000);
            system("cls");
            //Preguntamos a ver si adivinan
            cout << "¿En que fila estaba la H?\n";
            cin >> intento_fila;
            cout << "¿En que columna estaba la H?\n";
            cin >> intento_columna;
            if (intento_fila == fila_azar + 1 && intento_columna == col_azar + 1)
            {
                //Si acierta
                cout << "¡Has acertado campeón!\n";
                system("pause");
            }
            else
            {
                //Si no acierta
                cout << "Eres tontito\n";
                system("pause");
            }
            break;
        case 'S':
        case 's':
            //Si la respuesta es una S o s termina el programa
            exit(0);
        default:
            break;
        }
    } while (letra_menu != 'C' || letra_menu != 'c' || letra_menu != 'D' || letra_menu != 'd' || letra_menu != 'E' || letra_menu != 'e' || letra_menu != 'S' || letra_menu != 's');
}
