let array = [13, 46, 24, 52, 20, 9];

function recursiveInsertionSortFun(arr, n,startIndex,endEndex) {
    if(endEndex < 0 ||  startIndex>=n || startIndex<0 || endEndex >= n){
        return;
    }
    if(arr[startIndex] > arr[endEndex]){
        let temp = arr[startIndex];
        arr[startIndex] = arr[endEndex];
        arr[endEndex] = temp;
        recursiveInsertionSortFun(arr,n,startIndex-1,endEndex-1);
    }
    recursiveInsertionSortFun(arr,n,startIndex+1,endEndex+1);

}


let ln = array.length;
// recursiveInsertionSortFun(array, ln, ln - 1, 0);
recursiveInsertionSortFun(array, ln, 0, 1);
console.log(array)
// while (ln < array.length) {
//   recursiveInsertionSortFun(array, ln);
//   ln++;
// }
