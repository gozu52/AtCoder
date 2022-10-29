#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int gcd(int x,int y){
    return (x%y==0?y:gcd(y,x%y));
}

int main() {
    int a,b;cin>>a>>b;
    cout<<gcd(a,b)<<endl;
}