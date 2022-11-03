let data = "";

class SmartPhone {
    constructor(smartPhone) {
        this.smartPhone = smartPhone;
    }

    getName() {
        return this.smartPhone;
    }

}

let sonyXPeria = new SmartPhone("Sony Xperia");
let samSungGalaxy = new SmartPhone(("Samsung Galaxy"));
let nokia = new SmartPhone("Nokia 6");
let xiaomiNote4 = new SmartPhone("Xiaomi Redmi Note 4");
let apple6s = new SmartPhone("Apple iPhone 6s");
let xiaomi5sPlus = new SmartPhone("Xiaomi Mi 5s Plus");
let apple8Plus = new SmartPhone("Apple iPhone 8 plus");
let fujitsu = new SmartPhone("Fujitsu F-04E");
let oppo = new SmartPhone("Oppo A71");
let arrProduct = [sonyXPeria, samSungGalaxy, nokia, xiaomiNote4, apple6s, xiaomi5sPlus, apple8Plus, fujitsu, oppo];

showList(arrProduct);

function showList(arrProduct) {
    data += "<table style='border: solid red 0px; border-collapse: collapse;width: 600px; height: auto'>";
    data += "<tr>" + "<td></td>" + "<td><h4>Product name</h4></td>" + "<td></td>" + "<td style='text-align: center;'><h4>" +
        arrProduct.length + " products</h4></td>" + "</tr>";

    for (let index = 0; index < arrProduct.length; index++) {
        data += "<tr>";
        data += "<td>" + (index + 1) + "</td>"
        data += "<td>" + arrProduct[index].getName() + "</td>";
        data += "<td>" + "<button type='button' onclick='edit(" + index + ")'>Edit</button>" + "</td>";
        data += "<td>" + "<button type='button' onclick='deleteProduct(" + index + ")'>Delete</button>" + "</td>";
        data += "</tr>";
    }
    data += "</table>"
    document.getElementById("display").innerHTML = data;
    data = "";
}

function add() {
    let input = document.getElementById("input").value;
    let input2 = new SmartPhone(input);
    arrProduct.push(input2);
    showList(arrProduct);
}

function edit(index) {
    let newName = prompt("Please enter the new name");
    let newName1 = new SmartPhone(newName);
    arrProduct.splice(index, 1, newName1);
    showList(arrProduct);
}
function deleteProduct(index) {
    arrProduct.splice(index, 1);
    showList(arrProduct);
}
