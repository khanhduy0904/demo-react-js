//Nối URL vào đoạn đầu của các url sau
const axiosClient = axios.create({
  baseURL: "https://5f1ec71557e3290016863abf.mockapi.io/api/v1/",
});
function getListUser() {
  //Axios Trả về promise gồm 3 trạng thái: Pending---Full fill(Success) và Reject(Fail)
  return axiosClient({
    method: "GET",
    url: "nguoidung",
  });
}
//         .then(acceptListUser)//Call back function: Gọi hàm chạy lại sau 1 khi thỏa điều kiện vì cơ chế Axios là Bất Đồng Bộ Asynchronize ---> Nó sẽ nhảy qua hàm khác chạy nếu hàm này ko thực thi
//         .catch(
//             function (error) {
//                 console.log(error)
//             }
//         )
// }

// function acceptListUser(result) {
//     console.log(result)

function addUser(User) {
  return axiosClient({
    method: "POST",
    url: "nguoidung",
    //Phải có User để add vô dataBase
    data: User,
  });
}

function deleteUser(id) {
  return axiosClient({
    method: "DELETE",
    url: `nguoidung/${id}`,
  });
}
