#include <iostream>
#include <stdlib.h>
using namespace std;
int main(){
char letra;
system("cls");
cout<<"Introduce una letra \n";
cin>>letra;
switch (letra){
    case 'A':
        cout<<"Es vocal";
        break;
    case 'E':
        cout<<"Es vocal";
        break;
    case 'I':
        cout<<"Es vocal";
        break;
    case 'O':
        cout<<"Es vocal";
        break;
    case 'ckU':
        cout<<"Es vocal";
        break;

    default:
    switch (letra){
        case 'a':
        cout<<"Es vocal";
        break;
        case 'e':
        cout<<"Es vocal";
        break;
        case 'i':
        cout<<"Es vocal";
        break;
        case 'o':
        cout<<"Es vocal";
        break;
        case 'u':
        cout<<"Es vocal";
        break;
    default: cout<<"No es una vocal";
        break;
    }
        break;
        return 0;
}



}