const Employee = function (id, lastName, firstName, startedDate, position) {
  this.lastName = lastName;
  this.firstName = firstName;
  this.id = id;
  this.startedDate = startedDate;
  this.position = position;

  this.calcSalary = function () {
    if (this.position === "Sếp") return 5000;
    if (this.position === "Trưởng phòng") return 3000;
    return 1000;
  };
};
