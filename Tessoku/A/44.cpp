#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,q,query,x,y;
bool f=true;

int main() {
    cin>>n>>q;
    int a[n+5];
    for(int i=1;i<=n;i++)a[i]=i;
    while(q-->0){
        cin>>query;
        if(query==1){
            cin>>x>>y;
            (f?a[x]=y:a[n-x+1]=y);
        }else if(query==2){
            f = (f?false:true);
        }else{
            cin>>x;
            cout<<(f?a[x]:a[n-x+1])<<endl;
        }
    }
}