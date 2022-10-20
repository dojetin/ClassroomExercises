#include <iostream>
#include <stdlib.h>

using namespace std;
/*

*/
int main()
{
    system("cls");
    string frase;
    int contador=0;
    cout<<"Dime una frase y te cuento las vocales\n";
    getline(cin,frase);
    for (int i = 0; i < frase.length(); i++)
    {
        if (frase[i]=='a'||frase[i]=='A'||frase[i]=='e'||frase[i]=='E'||frase[i]=='i'||frase[i]=='I'||frase[i]=='o'||frase[i]=='O'||frase[i]=='u'||frase[i]=='U')
        {
            contador++;
            if (frase[i]=='a'||frase[i]=='A')
            {
               frase[i]='e';
            }
        }
    }
    cout<<"Tiene "<<contador<<" vocales\n";
    cout<<frase;
    



}