//using inbuild methords
let num = 13;
console.log(num.toString(2));

//using loop

function decTobinary(num){
    let binary = "";
    while(num > 0){
        binary = (num&1) + binary;
        num = num >> 1;
    }

    return binary;
}

console.log(decTobinary(11))