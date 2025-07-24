let num = 5;
//using loop
for(let i = 0;i<num;i++){
    let str = "";
    for (let j = 0; j < num; j++) {
        str += "* ";
    }
    console.log(str)
}

// inbuild methods
console.log()
for(let i=1;i<=num;i++){
    let stars = "* ".repeat(num);
    console.log(stars)
}