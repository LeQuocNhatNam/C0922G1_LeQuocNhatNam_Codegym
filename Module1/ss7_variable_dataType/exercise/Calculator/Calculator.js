// function addtion() {
//         let first = parseFloat(document.getElementById("firstNumber").value);
//         let second = parseFloat(document.getElementById("secondNumber").value) ;
//         let result = first + second;
//         document.getElementById("result").innerHTML = "Addition Result is: " + result;
// }
// function subtraction() {
//     let first = parseFloat(document.getElementById("firstNumber").value);
//     let second = parseFloat(document.getElementById("secondNumber").value) ;
//     let result = first - second;
//     document.getElementById("result").innerHTML = "Subtraction result is: " + result;
// }
// function multiplication() {
//     let first = parseFloat(document.getElementById("firstNumber").value);
//     let second = parseFloat(document.getElementById("secondNumber").value) ;
//     let result = first * second;
//     document.getElementById("result").innerHTML = "Multiplication result is: " + result;
// }
// function division() {
//     let first = parseFloat(document.getElementById("firstNumber").value);
//     let second = parseFloat(document.getElementById("secondNumber").value) ;
//     let result = first / second;
//     document.getElementById("result").innerHTML = "Division result is: " + result;
//
// }

function calculator(a) {
    let first = parseFloat(document.getElementById("firstNumber").value);
    let second = parseFloat(document.getElementById("secondNumber").value);
    let result;
    if (a == "+") {
         result = first + second;
    }

    else if (a == "-") {
         result = first - second;
    }
    else if (a == "*"){
         result = first * second;
    } else
        result = first / second;

    document.getElementById("result").innerHTML = "Result is: " + result;
}