 console.log(checkPalindrome(121))
console.log( checkPalindrome(-121))
function checkPalindrome(x) {
    let check = x;
  if (x < 0) {
    x = -1 * x;
     return Number(x.toString().split("").reverse().join("") * -1) == check || false;
  } else {
    return Number(x.toString().split("").reverse().join("")) == check || false;
  }
}
