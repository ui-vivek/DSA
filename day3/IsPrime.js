function checkPrime(x) {
  let n = 2;
  while (n < x) {
    if (x % n == 0) {
      return false;
    }
    n++;
  }
  return true;
}

let n = 16;
