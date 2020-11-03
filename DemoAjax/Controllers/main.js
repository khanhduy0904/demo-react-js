document
  .getElementById("btnThemNguoiDung")
  .addEventListener("click", openNewUser);

function openNewUser() {
  document.getElementsByClassName("modal-footer")[0].innerHTML = `
    <button class="btn btn-success" onclick="addNewUser()">Agree</button>
  `;
}

//function thêm ng dùng
function addNewUser() {
  const Account = document.getElementById("TaiKhoan").value;
  const Name = document.getElementById("HoTen").value;
  const Password = document.getElementById("MatKhau").value;
  const Email = document.getElementById("Email").value;
  const Phone = document.getElementById("SoDienThoai").value;
  const Typeuser = document.getElementById("loaiNguoiDung").value;

  const newUser = new User(
    Account,
    Name,
    Password,
    Email,
    Phone,
    Typeuser
  );

  addUser(newUser).then(function () {
    XuLiDanhSachNguoiDung();
  });
}

var listUser = [];
const promise = getListUser();
promise.then(function (result) {
  listUser = result.data;
  console.log(listUser);
  renderHTML();
});

function renderHTML() {
  var htmlContent = "";
  for (var index = 0; index < listUser.length; index++) {
    var curUser = listUser[index];
    htmlContent += `
         <tr>
            <td>${index + 1}</td>
            <td>${curUser.Account}</td>
            <td>${curUser.Password}</td>
            <td>${curUser.Name}</td>
            <td>${curUser.Email}</td>
            <td>${curUser.Phone}</td>
            <td>${curUser.Typeuser}</td>
            <td>
              <button class="btn btn-success">Sửa</button>
              <button class="btn btn-danger" onclick="xoaUser(${
                curUser.id
              })">Xóa</button>
            </td>
         </tr>
            
    `;
  }
  document.getElementById("tblDanhSachNguoiDung").innerHTML = htmlContent;
}

function XuLiDanhSachNguoiDung() {
  //Service
  //Gọi lại API và Render
  getListUser().then(function (result) {
    listUser = result.data;
    // console.log(listUser);
    renderHTML();
  });
}

//XuLiDanhSachNguoiDung();

function xoaUser(id) {
  deleteUser(id).then(function () {
    XuLiDanhSachNguoiDung();
  });
}
