#include <bits/stdc++.h>
#define ll = long long
using namespace std;

int n,cnt;

int gcd(int a, int b){
    return (a%b==0?b:gcd(b,a%b));
}

int main(){
    cin>>n;
    vector<int> a(n);
    for(int i=0;i<n;i++)cin>>a[i];
    sort(a.begin(),a.end());
    int base = a[0];
    for(int i=1;i<n;i++)base = gcd(base,a[i]);
    if(a[0]==a[n-1]){
        cout<<0<<endl;
        return 0;        
    }
    for(int i=0;i<n;i++){
        a[i] /= base;
        if(a[i]%2==0){
            while(a[i]>1&&a[i]%2==0){
                a[i]/=2;cnt++;
            }
        }
        if(a[i]%3==0){
            while(a[i]>2&&a[i]%3==0){
                a[i]/=3;cnt++;
            }
        }
        if(a[i]!=1){
            cout<<-1<<endl;
            return 0;
        }        
        if(a[i]!=1){
            cout<<-1<<endl;
            return 0;    
        }
    }
    cout<<cnt<<endl;
}