#include <bits/stdc++.h>
using namespace std;

int main(){
    int v, a, b, c; cin >> v >> a >> b >> c;
    v %= (a+b+c);
    if(v-a <0)cout << "F" << endl;
    else if(v-b < 0)cout << "M" << endl;
    else cout << "T" << endl;
}