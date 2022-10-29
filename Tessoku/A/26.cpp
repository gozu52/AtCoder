#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

bool isPrime(int n){
    if(n<=1)return false;
    for(int i=2;i*i<=n;i++)if(n%i==0)return false;
    return true;
}

int main() {
    int q,x;cin>>q;
    while(q-->0){
        cin>>x;
        cout<<(isPrime(x)?"Yes":"No")<<endl;
    }
}