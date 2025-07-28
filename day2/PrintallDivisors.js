let n = 36;

function deviser(n) {
  let ans = [];
  let deviser = 1;
  while (deviser <= n) {
    if (n % deviser == 0) {
      ans.push(deviser);
    }
    deviser++;
  }
  return ans;
}

console.log(deviser(n));
