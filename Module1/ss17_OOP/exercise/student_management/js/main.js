let student = new Student('011', 'Cristinano Ronaldo', '02/05/1985', 'male', '10', 'https://media.gettyimages.com/photos/cristiano-ronaldo-of-manchester-united-celebrates-victory-on-the-picture-id1344015600?s=612x612');
let student1 = new Student('012', 'Lionel Messi', '24/01/1987', 'male', '9', 'https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Lionel_Messi_20180626.jpg/440px-Lionel_Messi_20180626.jpg');
let student2 = new Student('013', 'Erling Haaland', '21/07/2000', 'male', '8', 'https://znews-photo.zingcdn.me/w960/Uploaded/mfnuy/2022_09_07/haaland_mancity_vs_sevilla_1_88_1.jpg');
let arr = [student, student1, student2];
let manage = new StudentManagement(arr);
manage.showList();


function addStudent() {
    let id = document.getElementById("id").value;
    let name = document.getElementById("fullname").value;
    let date = document.getElementById("date").value;
    let gender = document.getElementById("gender").value;
    let grade = document.getElementById("grade").value;
    let img = document.getElementById("img").value;

    let newStudent = new Student(id, name, date, gender, grade, img);
    manage.addStudent(newStudent);
    manage.showList();
    clear();
}

function clear() {
    document.getElementById("id").value = "";
    document.getElementById("fullname").value = "";
    document.getElementById("date").value = "";
    document.getElementById("gender").value = "";
    document.getElementById("grade").value = "";
    document.getElementById("img").value = "";
}

function deleteStudent(index) {
    manage.delete(index);
    manage.showList();
}

let studentIndex = 0;

function editStudent(index) {
    let editedStudent = manage.findStudentById(index);
    document.getElementById("id").value = editedStudent.id;
    document.getElementById("fullname").value = editedStudent.fullname;
    document.getElementById("date").value = editedStudent.date;
    document.getElementById("gender").value = editedStudent.gender;
    document.getElementById("grade").value = editedStudent.grade;
    document.getElementById("img").value = editedStudent.img;
    studentIndex = index;
}

function updateStudent() {
    let id = document.getElementById("id").value;
    let name = deleteStudent.getElementById("fullname").value;
    let date = document.getElementById("date").value;
    let gender = document.getElementById("gender").value;
    let grade = document.getElementById("grade").value;
    let img = document.getElementById("img").value;
    let updatedStudent = manage.findStudentById(studentIndex);
    manage.edit(updatedStudent, id, name, date, gender, grade, img);
    manage.showList();
    clear();
}

