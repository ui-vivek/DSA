// Check if a number is even or odd using bitwise.

function checkOddEven(n) {
  if (n & (1 == 1)) {
    return "Odd";
  }
  return "Even";
}

console.log(checkOddEven(11));

// Swap two numbers without using a third variable.
let a = 2;
let b = 3;

a = a ^ b;
b = a ^ b;
a = a ^ b;
console.log(a);
console.log(b);

//Count set bits (1s) in the binary representation of a number

function countOnes(num){
    let count = 0;
    while(num>0){
        num&1 == 1 ? count++ : 0
        num = num>>1
    }
    return count;
}

console.log("Numbers of 1st",countOnes(10))