create table database_Student (
	studentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	studentName VARCHAR(75) null,
	studentGrade VARCHAR(75) null,
	Gender VARCHAR(75) null,
	age INTEGER
);