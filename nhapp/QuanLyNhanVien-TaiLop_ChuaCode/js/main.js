/**
 * Hệ thống: Quản lý nhân viên
 * Người tạo : Đăng Trung Hiếu
 * Chức năng:
 * 	1. Cho phép thêm nhân viên mới vào trong hệ thống cty
 *  2. Hiển thị danh sách toàn nhân viên ra màn hình
 *  3. Xóa nhân viên khỏi hệ thống
 *  4. Cập nhật thông tin của một nhân viên
 *  5. Tìm kiếm nhân viên theo tên hoặc mã nhân viên
 *  6. Validate dữ liệu
 */

var emplList = [];

//tìm nhân viên theo id => trả về vị trí nhân viên đó trong ds
const findById = function (id) {
  for (var i = 0; i < emplList.length; i++) {
    if (emplList[i].id === id) {
      return i;
    }
  }
  return -1;
};

//function 1: thêm nhân viên
const addEmpl = function () {
  //process:
  /**
   * 1.Dom tới html, lấy dữ liệu từ form
   * 2.tạo đối tương nhân viên chứa dữ liệu lấy được
   * 3.lưu đối tượng vào mảng emplList
   */
  const lastName = document.getElementById("ho").value;
  const firstName = document.getElementById("ten").value;
  const id = document.getElementById("msnv").value;
  const startedDate = document.getElementById("datepicker").value;
  const position = document.getElementById("chucvu").value;

  //kiểm tra tồn tại nhân viên trong ds chưa
  const index = findById(id);

  if (index !== -1) {
    alert("Nhân viên đã tồn tại");
    return;
  }

  const newEmpl = new Employee(id, lastName, firstName, startedDate, position);

  emplList.push(newEmpl);

  //render giao diện danh sách nhân viên
  renderEmpls();

  //luư danh sách mới xuống localstorage
  saveData();
};

//function 2: hiển thị danh sách nhân viên
const renderEmpls = function () {
  var htmlContent = "";

  for (var i = 0; i < emplList.length; i++) {
    const currentEmpl = emplList[i];
    //template string
    htmlContent += `  
    <tr>
      <td>${i + 1} </td>
      <td>${currentEmpl.lastName + " " + currentEmpl.firstName}</td>
      <td>${currentEmpl.id}</td>
      <td>${currentEmpl.startedDate}</td>
      <td>${currentEmpl.position}</td>
      <td>$${currentEmpl.calcSalary()}</td>
      <td>
        <button class="btn btn-danger rounded-circle" onclick="deleteEmpl( '${
          currentEmpl.id
        }' )"> 
          <i class="fa fa-trash"></i> 
        </button>

        <button class="btn btn-info rounded-circle" onclick="getUpdateEmpl('${
          currentEmpl.id
        }')"> 
          <i class="fa fa-pencil"></i>
        </button>
        
        
      </td>
    </tr>`;
  }
  console.log(htmlContent);
  document.getElementById("tbodyEmpl").innerHTML = htmlContent;
};

//function: Xóa nhân viên khỏi danh sách
const deleteEmpl = function (id) {
  const index = findById(id);
  if (index !== -1) {
    emplList.splice(index, 1);

    saveData();

    renderEmpls();
  }
};

const getUpdateEmpl = function (id) {
  // tìm nhân viên trong danh sách theo id
  const index = findById(id);
  if (index !== -1) {
    // lấy thông tin của nhân viên muốn chỉnh sửa hiện lên form
    document.getElementById("ho").value = emplList[index].lastName;
    document.getElementById("ten").value = emplList[index].firstName;
    document.getElementById("msnv").value = emplList[index].id;
    document.getElementById("datepicker").value = emplList[index].startedDate;
    document.getElementById("chucvu").value = emplList[index].position;

    //chặn ô id không cho người dùng chỉnh sửa
    document.getElementById("msnv").setAttribute("disabled", true);

    //ẩn button thêm, hiện button cập nhật
    document.getElementById("btnAdd").style.display = "none";
    document.getElementById("btnUpdate").style.display = "block";

    
  }
};

//function 3: lưu dữ liệu vào localstorage
const saveData = function () {
  localStorage.setItem("emplList", JSON.stringify(emplList));
};

//function 4: lấy dữ liệu từ localstorage
const getData = function () {
  const emplListJSON = localStorage.getItem("emplList");
  //kiểm tra tồn tại dữ liệu
  if (!emplListJSON) return;

  //map từ mảng cũ [n1,n2,n3] => [new Emp(n1), new Emp(n2), new Emp(n3)]
  const emplListFromLocal = JSON.parse(emplListJSON);

  for (var i = 0; i < emplListFromLocal.length; i++) {
    //n1
    const currentEmpl = emplListFromLocal[i];
    //=> new Emp(n1): Giống hoàn toàn n1, chỉ khác là có phương thức, n1 thì không
    const empl = new Employee(
      currentEmpl.id,
      currentEmpl.lastName,
      currentEmpl.firstName,
      currentEmpl.startedDate,
      currentEmpl.position
    );
    emplList.push(empl);
  }

  //tạo giao diện danh sách nhân viên
  renderEmpls();
};

getData();

//callback function
// document
// .getElementById("btnAdd").addEventListener("click", addEmpl);
