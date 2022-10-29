#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n,x;cin>>n>>x;
    for(int i=0;i<n;i++){
        int a;cin>>a;
        if(a==x){
            cout<<"Yes"<<endl;
            return 0;
        }
    }
    cout<<"No"<<endl;
}