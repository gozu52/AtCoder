#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

string s[9];
int cnt;

int main() {
    for(int i=0;i<9;i++)cin>>s[i];
    
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            for(int k=0;k<9;k++){
                for(int l=0;l<9;l++){
                    if(i==k&&j==l)continue;
                    int x = k-i, y = l-j;
                    int r1 = k+y, c1 = l-x;
                    int r2 = r1-x, c2 = c1-y;
                    if(r1<0||r2<0||c1<0||c2<0||r1>8||r2>8||c1>8||c2>8)continue;
                    if(s[i][j]=='#'&&s[k][l]=='#'&&s[r1][c1]=='#'&&s[r2][c2]=='#')cnt++;
                }
            }
        }
    }
    cout<<cnt/4<<endl;
}
