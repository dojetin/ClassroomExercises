#include <iostream>
#include <stdlib.h>
#include <cmath>
using namespace std;

int main()
{
    string usuario, pass, sol1, sol2, sol3, sol5, res_arrai; //Declaracion de variables
    char menu = 'a';
    int altura = 0, aux_login = 0, sol4 = 0, nota = 0, a = 0, b = 0, c = 0, xmas = 0, xmenos = 0, aux_arrai = 0, otro_aux_arrai = 0, muestramesta = 0, base = 0;
    int arrai[15];
    system("cls");
    while (((usuario != "Leonardo") || (pass != "DaVinci")) && (aux_login < 3)) //Login que a los 3 intentos fallidos te echa
    {
        cout << "Introduce el usuario\n";
        cin >> usuario;
        cout << "Introduce la password\n";
        cin >> pass;
        if ((usuario != "Leonardo") || (pass != "DaVinci"))
        {
            aux_login++;
        }
    }
    if (aux_login != 3)
    {
        while (menu != 'S') //Aqui te pregunto que quieres hacer
        {
            do
            {
                system("cls");
                cout << "Bienvenido Leonardo! Que operacion desea realizar?\n";
                cout << "Cuestionario (Q)\n";
                cout << "Calculos (C)\n";
                cout << "Muestas (M)\n";
                cout << "Planos de Piramides (P)\n";
                cout << "Salir (S)\n";
                cin >> menu;
            } while (menu != 'Q' && menu != 'C' && menu != 'M' && menu != 'P' && menu != 'S');
            switch (menu)
            {
                system("cls");
            case 'Q':
                cout << "Pregunta 1: Donde esta guardada la Gioconda?\n"; //Preguntas del cuestionario
                cin >> sol1;
                if (sol1 == "Louvre" || sol1 == "louvre")
                {
                    nota++;
                }
                cout << "Pregunta 2: En que animales estan inspirados?\n";
                cin >> sol2;
                if (sol2 == "Aves" || sol2 == "aves")
                {
                    nota++;
                }
                cout << "Pregunta 3: A pesar de ser un genio, que disciplina se le resistio?\n";
                cin >> sol3;
                if (sol3 == "Cocina" || sol3 == "cocina")
                {
                    nota++;
                }
                cout << "Pregunta 4: Que significa da Vinci?\n";
                cout << "1-Su apellido\n";
                cout << "2-Su lugar de precedencia\n";
                cout << "3-Su segundo nombre\n";
                cin >> sol4;
                if (sol4 == 2)
                {
                    nota++;
                }
                cout << "Pregunta 5: Que herramienta es necesaria para poder leer los apuntes de leonardo?\n";
                cin >> sol5;
                if (sol5 == "Espejo" || sol5 == "espejo")
                {
                    nota++;
                }
                cout << " \n";
                cout << "Veamos las soluciones...\n"; //Te muestro las soluciones
                cout << "Sol1: Louvre\nSol2: Aves\nSol3: Cocina\nSol4:2\nSol5: Espejo\n";
                cout << "Has sacado un " << nota << " felicidades!\n";
                system("pause");
                break;
            case 'C':
                cout << "Bienvenido a la calculadora de Gauss\n"; //Calculadora
                cout << "Introduce el valor de a\n";
                cin >> a;
                cout << "Introduce el valor de b\n";
                cin >> b;
                cout << "Introduce el valor de c\n";
                cin >> c;
                if (((b * b) - (4 * a * c)) >= 0) //Hace la comprobacion
                {
                    xmas = ((-b + sqrt(b * b - 4 * a * c)) / 2 * a);
                    xmenos = ((-b - sqrt(b * b - 4 * a * c)) / 2 * a);
                    cout << "La primera solucion es \n"
                         << xmas << endl;
                    cout << "La segunda solucion es \n"
                         << xmenos << endl;
                }
                else //Si la comprobacion es false
                {
                    cout << "No hay raices reales\n";
                }
                system("pause");
                break;
            case 'M':
                do
                {
                    cout << "Introduce el numero que quieras guardar\n"; //Un bucle que te pide tantos numeros como desees y los guarda en un array
                    cin >> muestramesta;
                    arrai[aux_arrai] = muestramesta;
                    aux_arrai++;
                    cout << "Quieres introducir otro numero?\nSi\nNo\n";
                    cin >> res_arrai;
                } while (res_arrai == "si" || res_arrai == "Si");
                for (int i = 0; i < aux_arrai; i++)
                {
                    cout << "Has introducido los siguientes numeros \n"; //Luego te los muestra
                    cout << arrai[otro_aux_arrai] << endl;
                    otro_aux_arrai++;
                }
                system("pause");
                break;
            case 'P':

                cout << "Introduce la altura de la piramide\n"; //Te pide la altura de la piramide
                cin >> altura;
                base = altura;
                cout << "Primera piramide:\n";
                for (int j = 0; j < altura; j++)
                {
                    for (int w = 0; w < base; w++)
                    {
                        cout << "*";
                    }
                    base--;
                    cout << "\n";
                }
                base = 1;
                cout << "Segunda piramide:\n";
                for (int j = 0; j < altura; j++)
                {
                    for (int w = 0; w < base; w++)
                    {
                        cout << "*";
                    }
                    cout << "\n";
                    base++;
                }
                system("pause");
                break;
            case 'S':
                break;
            default:
                break;
            }
        }
    }
}