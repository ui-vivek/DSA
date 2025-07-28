let n1=5,n2=15;

function gcd(n1,n2) {

    let ans =[];
    let min = Math.min(n1,n2);
    for(let i=2;i<=min;i++){
        if(n1%i ==0 && n2%i==0){
            ans.push(i);
        }
    }

    return ans;
    
}

console.log(gcd(n1,n2))