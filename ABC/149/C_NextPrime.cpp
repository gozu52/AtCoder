#include <bits/stdc++.h>
using namespace std;

bool isPrime(int x){
    for(int i=2;i*i<=x;i++){
        if(x%i==0)return false;
    }
    return true;
}
int main(){
    int x; cin >> x;
    while(true){
        if(isPrime(x)){
            cout << x << endl;
            break;
        }
        x++;
    }
    return 0;
}