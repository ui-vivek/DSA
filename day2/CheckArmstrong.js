let n = 371;
function checkArm(x) {
  let nArr = n.toString().split("");
  let pow = nArr.length;
  let ans = 0;
  nArr.forEach((e) => {
    ans = ans + Math.pow(e, pow);
  });
  return ans;
}

console.log(n == checkArm(n));
