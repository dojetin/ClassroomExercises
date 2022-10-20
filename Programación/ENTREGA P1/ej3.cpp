#include <iostream>
#include <stdlib.h>

using namespace std;
/*

*/
struct alumnos
{
    string nombre;
    double nota1tr;
    double nota2tr;
    double nota3tr;
    double final;
};

int main()
{
    system("cls");
    struct alumnos a1;
    cout<<"Dime el nombre del alumno\n";
    getline(cin,a1.nombre);
    cout<<"Dime la nota del primer trimestre\n";
    cin>>a1.nota1tr;
    cout<<"Dime la nota del segundo trimestre\n";
    cin>>a1.nota2tr;
    cout<<"Dime la nota del tercer trimestre\n";
    cin>>a1.nota3tr;

    cin.ignore();
    a1.final=((a1.nota1tr+a1.nota2tr+a1.nota3tr)/3);
    cout<<"La nota del primer trimestre es "<<a1.nota1tr<<endl<<"La nota del segundo trimestre es "<<a1.nota2tr<<endl<<"La nota del tercer trimestre es "<<a1.nota3tr<<endl;
    cout<<"La nota final es "<<a1.final<<endl;

    system("pause");
    system("cls");
    struct alumnos a2;
    cout<<"Dime el nombre del alumno\n";
    getline(cin,a2.nombre);
    cout<<"Dime la nota del primer trimestre\n";
    cin>>a2.nota1tr;
    cout<<"Dime la nota del segundo trimestre\n";
    cin>>a2.nota2tr;
    cout<<"Dime la nota del tercer trimestre\n";
    cin>>a2.nota3tr;

    cin.ignore();
    a2.final=((a2.nota1tr+a2.nota2tr+a2.nota3tr)/3);
    cout<<"La nota del primer trimestre es "<<a2.nota1tr<<endl<<"La nota del segundo trimestre es "<<a2.nota2tr<<endl<<"La nota del tercer trimestre es "<<a2.nota3tr<<endl;
    cout<<"La nota final es "<<a2.final<<endl;
    
    system("pause");    
    system("cls");
    struct alumnos a3;
    cout<<"Dime el nombre del alumno\n";
    getline(cin,a3.nombre);
    cout<<"Dime la nota del primer trimestre\n";
    cin>>a3.nota1tr;
    cout<<"Dime la nota del segundo trimestre\n";
    cin>>a3.nota2tr;
    cout<<"Dime la nota del tercer trimestre\n";
    cin>>a3.nota3tr;

    cin.ignore();
    a3.final=((a3.nota1tr+a3.nota2tr+a3.nota3tr)/3);
    cout<<"La nota del primer trimestre es "<<a3.nota1tr<<endl<<"La nota del segundo trimestre es "<<a3.nota2tr<<endl<<"La nota del tercer trimestre es "<<a3.nota3tr<<endl;
    cout<<"La nota final es "<<a3.final<<endl;
    
    system("pause");
    system("cls");
    struct alumnos a4;
    cout<<"Dime el nombre del alumno\n";
    getline(cin,a4.nombre);
    cout<<"Dime la nota del primer trimestre\n";
    cin>>a4.nota1tr;
    cout<<"Dime la nota del segundo trimestre\n";
    cin>>a4.nota2tr;
    cout<<"Dime la nota del tercer trimestre\n";
    cin>>a4.nota3tr;

    cin.ignore();
    a4.final=((a4.nota1tr+a4.nota2tr+a4.nota3tr)/3);
    cout<<"La nota del primer trimestre es "<<a4.nota1tr<<endl<<"La nota del segundo trimestre es "<<a4.nota2tr<<endl<<"La nota del tercer trimestre es "<<a4.nota3tr<<endl;
    cout<<"La nota final es "<<a4.final<<endl;

    system("pause");
    system("cls");
    struct alumnos a5;
    cout<<"Dime el nombre del alumno\n";
    getline(cin,a5.nombre);
    cout<<"Dime la nota del primer trimestre\n";
    cin>>a5.nota1tr;
    cout<<"Dime la nota del segundo trimestre\n";
    cin>>a5.nota2tr;
    cout<<"Dime la nota del tercer trimestre\n";
    cin>>a5.nota3tr;

    cin.ignore();
    a5.final=((a5.nota1tr+a5.nota2tr+a5.nota3tr)/3);
    cout<<"La nota del primer trimestre es "<<a5.nota1tr<<endl<<"La nota del segundo trimestre es "<<a5.nota2tr<<endl<<"La nota del tercer trimestre es "<<a5.nota3tr<<endl;
    cout<<"La nota final es "<<a5.final<<endl;
    
    //mejor nota
    if (a1.final>a2.final&&a1.final>a3.final&&a1.final>a4.final&&a1.final>a5.final)
    {
       cout<<a1.nombre<<" es el que tiene mejor nota\n";
    }else if (a2.final>a3.final&&a2.final>a4.final&&a2.final>a5.final)
    {
       cout<<a2.nombre<<" es el que tiene mejor nota\n";
    }else if (a3.final>a4.final&&a3.final>a5.final)
    {
       cout<<a3.nombre<<" es el que tiene mejor nota\n";
    }else if (a4.final>a5.final)
    {
        cout<<a4.nombre<<" es el que tiene mejor nota\n";
    }else
    {
        cout<<a5.nombre<<" es el que tiene mejor nota\n";
    }

    

    //peor nota
    if (a1.final<a2.final&&a1.final<a3.final&&a1.final<a4.final&&a1.final<a5.final)
    {
       cout<<a1.nombre<<" es el que tiene peor nota\n";
    }else if (a2.final<a3.final&&a2.final<a4.final&&a2.final<a5.final)
    {
       cout<<a2.nombre<<" es el que tiene peor nota\n";
    }else if (a3.final<a4.final&&a3.final<a5.final)
    {
       cout<<a3.nombre<<" es el que tiene peor nota\n";
    }else if (a4.final<a5.final)
    {
        cout<<a4.nombre<<" es el que tiene peor nota\n";
    }else
    {
        cout<<a5.nombre<<" es el que tiene peor nota\n";
    }
    
    
}