#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#define all(x) (x).begin(),(x).end()

using namespace std;
using ll = long long;
using ld = long double;
using P = pair<int,int>;
using PL = pair<ll,ll>;
const int INF = 1e9;
const ll INFL = 1e18;
const int dx[4] = {1,0,-1,0};
const int dy[4] = {0,1,0,-1};
// cout<<fixed<<setprecision(10);
// priority_queue<int,vector<int>,greater<int>> pq;
int H,W,N,h,w;

int main(){
    cin>>H>>W>>N>>h>>w;
    /**
     * @brief 
     * 入力
     * 0indexに変換
     * 
     */
    vector<vector<int>> a(H,vector<int>(W));
    for(int i=0;i<H;i++){
        for(int j=0;j<W;j++){
            cin>>a[i][j];a[i][j]--;
        }
    }
    /**
     * @brief 
     * count each values
     * 
     */
    vector<vector<vector<int>>> s(N, vector<vector<int>>(H+1,vector<int>(W+1,0)));
    for(int i=0;i<H;i++){
        for(int j=0;j<W;j++){
            s[a[i][j]][i+1][j+1]++;
        }
    }
    // for(int i=0;i<H;i++){
    //     cout<<"i: "<<i<<endl;
    //     for(int j=0;j<W;j++){
    //         cout<<a[i][j]<<" "<<s[a[i][j]][i+1][j+1]<<endl;
    //     }
    //     cout<<" "<<endl;
    // }
    /**
     * @brief 
     * それぞれの値に対する累積和
     * 
     */
    for(int i=0;i<N;i++){
        for(int j=1;j<=H;j++){
            for(int k=1;k<=W;k++){
                s[i][j][k] += s[i][j-1][k];
            }
        }
        for(int j=1;j<=H;j++){
            for(int k=1;k<=W;k++){
                s[i][j][k] += s[i][j][k-1];
            }
        }
    }   
    // for(int i=0;i<N;i++){
    //     cout<<i<<endl;
    //     for(int j=1;j<=H;j++){
    //         for(int k=1;k<=W;k++){
    //             cout<<s[i][j][k]<<" ";
    //         }
    //         cout<<endl;
    //     }
    // }
    for(int i=0;i<=H-h;i++){
        for(int j=0;j<=W-w;j++){
            int ans = 0;
            for(int k=0;k<N;k++){
                if(s[k][i+h][j+w]-s[k][i+h][j]-s[k][i][j+w]+s[k][i][j]<s[k][H][W]){
                    ans++;
                }
            }
            cout<<ans;
            if(j<W-w)cout<<" ";
        }
        cout<<endl;
    }
    return 0;
}