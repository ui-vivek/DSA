// You are given an integer n. You need to return the number of digits in the number.
// The number will have no leading zeroes, except when the number is 0 itself.

// 1st
let num = 123;
console.log(num.toString().length)

// 2nd
let count = 0;
while(num>0){
    let rem = num%10;
    num = num - rem
    num=num/10;
    count++;
}
console.log(count)