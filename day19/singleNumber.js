function test() {
  let arr = [2, 2, 1];

  let obj = {};

  for (let x of arr) {
    if (obj[x] == 1) {
      obj[x] = 2;
    } else {
      obj[x] = 1;
    }
  }
  for (let [key, value] of Object.entries(obj)) {
    if (value == 1) {
      return key;
    }
  }
}

//using XOR
nums = [4, 1, 2, 1, 2];
let ans = 0;
for (let n of nums) {
  ans = ans ^ n;
}

console.log(ans);
