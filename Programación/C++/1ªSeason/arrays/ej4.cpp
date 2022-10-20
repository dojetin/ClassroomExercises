#include <iostream>
#include <stdlib.h>
using namespace std;
/*
4. Desarrolla un programa que almacene las temperaturas de los 31 días
de diciembre, deberá pedir la de cada día por pantalla, cuando estén todas, el
programa elaborará una estadística donde queden reflejadas la máxima, la
mínima y la media del mes.
*/
int main()
{
    int tmp = 0, max = 0, min = 0, media = 0, res = 0, dias = 0, aux = 0;
    system("cls");
    do
    {
        cout << "En que mes estamos?\n";
        cout << " 1. Enero\n 2. Febrero\n 3. Marzo\n 4. Abril\n 5. Mayo\n 6. Junio\n 7. Julio\n 8. Agosto\n 9. Septiembre\n 10. Octubre\n 11. Noviembre\n 12. Dicciembre\n";
        cin >> res;
    } while (res > 13 && res < 0);

    switch (res)
    {
    case 1:
        dias = 31;
        break;
    case 2:
        cout << "El anyo es bisiesto?\n 1. Si\n 2. No\n";
        cin >> aux;
        if (aux = 1)
        {
            dias = 29;
        }
        else
        {
            dias = 28;
        }
        break;
    case 3:
        dias = 31;
        break;
    case 4:
        dias = 30;
        break;
    case 5:
        dias = 31;
        break;
    case 6:
        dias = 30;
        break;
    case 7:
        dias = 31;
        break;
    case 8:
        dias = 31;
        break;
    case 9:
        dias = 30;
        break;
    case 10:
        dias = 31;
        break;
    case 11:
        dias = 30;
        break;
    case 12:
        dias = 31;
        break;

    default:
        break;
    }

    system("cls");

    for (int i = 1; i< dias;i++)
    {
        cout << "Dia " << i << "\nQue temperatura hace hoy?\n";
        cin >> tmp;
        if (i == 1)
        {
            max = tmp;
            min = tmp;
        }

        media = media + tmp;
        if (tmp < min)
        {
            min = tmp;
        }
        else if (tmp > max)
        {
            max = tmp;
        }
    }
    media = media / dias;
    system("cls");
    cout << "La temperatura maxima es " << max << endl;
    cout << "La temperatura minima es " << min << endl;
    cout << "La media es " << media << endl;
}