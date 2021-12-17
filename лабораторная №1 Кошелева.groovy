#include <iostream>

using namespace std;

int main()
{
 cout << "Task 1" << " ;
 cout << sizeof(int) << " ; //4, long int = int
 cout << sizeof(short int) << " ; //2
 cout << sizeof(long long int) << " ; //8, bc double the int
 cout << sizeof(float) << " ; //4
 cout << sizeof(double) << " ; //8
 cout << sizeof(long double) << " ; //8, bc long long double would be 16
 cout << sizeof(char) << " ; //1
 cout << sizeof(bool) << " ; //1
 cout << endl;


 cout << "Task 2" << " ;
    int num_1; // значение
 cin >> num_1;
    unsigned int order = sizeof(int) * 8; // количество разрядов 4*8 = 32
     unsignedint mask = 1 << order - 1;
    for (int i = 1; i <= order; i++)
    {
        putchar(num_1 & mask ? '1' : '0');
 num_1 <<= 1;
        if (i % 8 == 0)
        {
            putchar(' ');
        }
        if (i % order - 1 == 0)
        {
            putchar(' ');
        }
    }
    cout << endl;


    cout << "Task 3" << ' ';

    union {
        float num_2;
        int a;
    };
    cin >> num_2;
    mask = 1 << order - 1; // маска побитового сравнения
    for (int i = 1; i <= order; i++)
    {
        putchar(a & mask ? '1' : '0');
        a <<= 1;
        if (i % 8 == 0) // если остаток деления от 8 равен 0
        {
            putchar(' '); // то вставляем пробел, отделяя другое значение (отделяем 8 битов от других 8 битов)
        }
        if (i % order - 1 == 0)
        {
            putchar(' ');
        }
    }
    cout << endl;


    cout << "Task 4" << ' ';
    union {
        double num_3;
        int b[2];
    };
    cin >> num_3;
    
    for (int j=1; j >= 0; j--){
        mask = 1 << order - 1;
     for (int i = 1; i <= order; i++)
        {
        putchar(b[j] & mask ? '1' : '0');
        mask >>= 1;

        if (j == 1 && i == 1)
        {
            putchar(' ');
        }
        if (j == 1 && i == 12)
        {
            putchar(' ');
        }
         }
    }
    cout << endl; 
    
    return 0;
}