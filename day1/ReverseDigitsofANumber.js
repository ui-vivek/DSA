// 1st
let num = 52101;
let rev = num.toString().split("").reverse().join("");
console.log(rev);

// 2nd
let num2 = 8574;
let rev2 = 0;

while(num2>0){
    let rem = num2%10
    rev2 = rev2*10+rem;

    num2=(num2-rem)/10;
}
console.log(rev2)


