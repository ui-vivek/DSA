/*

Input Format: N = 6


1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

*/

let nums = 6;

for (let i = 1; i < nums; i++) {
  let numStar = 1;
  let printVar = "";
  while (numStar <= i) {
    printVar = printVar + " " + numStar;
    numStar++;
  }
  console.log(printVar);
}
