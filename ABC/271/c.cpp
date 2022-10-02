#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n;cin>>n;
    vector<bool> a(n+1,false);
    for(int i=0;i<n;i++){
        int num;cin>>num;
        if(num<=n)a[num]=true;
    }
    for(int i=1;i<=n;i++){
        if(!a[i])n-=1;
    }
    cout<<n<<endl;
    return 0;
}