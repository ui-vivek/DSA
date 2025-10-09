let binary = "1010";

//inbuild method
// console.log(parseInt(binary, 2));

function bnryToDecml(binary) {
  let ans = 0;
  for (let pwr = binary.length; pwr > 0; pwr--) {
    ans = ans + binary[pwr - 1] * Math.pow(2, binary.length - pwr);
  }
  return ans;
}

console.log(bnryToDecml(binary));

console.log(Math.pow(2, 3));
