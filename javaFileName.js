function formatString(str) {
  return str
    .split(" ")
    .map((word) => word.charAt(0).toUpperCase() + word.slice(1))
    .join("");
}

const input = "Count frequency of each element in the array";
const result = formatString(input);
console.log(result);
