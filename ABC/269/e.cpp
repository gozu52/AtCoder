#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int ans(int a,int b, int c,int d){
    cout<<"? "<<a<<" "<<b<<" "<<c<<" "<<d<<endl;
    cin>>a;
    return a;
}

int main(){
    int n;cin>>n;
    int ng = 1, ok = n+1;
    while(ng+1!=ok){
        int mid = (ok+ng)/2;
        int next = ans(ng,mid-1,1,n);
        if(next==mid-ng){
            ng = mid;
        }else{
            ok = mid;
        }
    }
    int l = 1, r = n+1;
    while(l+1!=r){
        int mid = (l+r)/2;
        int next = ans(1,n,l,mid-1);
        if(next==mid-l){
            l = mid;
        }else{
            r = mid;
        }
    }
    cout<<"! "<<ng<<" "<<l<<endl;
}