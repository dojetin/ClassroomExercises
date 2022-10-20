#include <iostream>
#include <stdlib.h>
using namespace std;
/*
8. Desarrolla un programa que dado un array de números de 5 posiciones
con los siguiente valores {1,2,3,4,5}, guardar los valores de este array en otro
array nuevo pero con los valores invertidos, {5,4,3,2,1}.
*/
int main()
{
    system("cls");
    int arrai1[5] = {1, 2, 3, 4, 5};
    int arrai2[5];
    int j = 4;
    for (int i = 0; i < 5; i++)
    {
        arrai2[i] = arrai1[j];
        j--;
        cout << arrai2[i] << endl;
    }
}