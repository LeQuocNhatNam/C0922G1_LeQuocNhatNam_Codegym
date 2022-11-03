function exchangeMoney() {
    let aMount = parseFloat(document.getElementById("amount").value);
    let From = document.getElementById("from").value;
    let To = document.getElementById("to").value;
    let result;

    if (From == "usd" && To == "vnd")
        result = "result is " + aMount * 23000;


    else
        if (From == "vnd" && To == "usd") {
        result = "result is " + aMount / 23000;
        }
            else
                if (From == "vnd"){
                    result = "result is " + aMount;
                }
                else {
                    result = "result is " + aMount;

                }
    document.getElementById("result").innerHTML = result;

}