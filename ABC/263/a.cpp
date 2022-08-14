#include <bits/stdc++.h>
using namespace std;

int a[14];

int main(){
    for(int i=0;i<5;i++){
        int tmp;
        cin >> tmp;
        a[tmp]++;
    }
    int two = 0, three = 0;
    for(int i=0;i<14;i++){
        if(a[i]==2)two++;
        if(a[i]==3)three++;
    }
    if(two>0&&three>0){
        cout << "Yes" << endl;
    }else{
        cout << "No" << endl;
    }
}