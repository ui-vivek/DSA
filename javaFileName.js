function formatString(str) {
  return str
    .split(" ")
    .map((word) => word.charAt(0).toUpperCase() + word.slice(1))
    .join("");
}

const input = "Find the highest/lowest frequency element";
const result = formatString(input);
console.log(result);
