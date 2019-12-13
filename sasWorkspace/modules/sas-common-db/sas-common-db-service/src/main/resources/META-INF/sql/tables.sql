create table evalvendor (
	evalVendorId LONG not null primary key,
	empName VARCHAR(75) null,
	empEmail VARCHAR(75) null,
	audioId LONG,
	audioPath VARCHAR(75) null,
	videoId LONG,
	videoPath VARCHAR(75) null,
	imageId LONG,
	imagePath VARCHAR(75) null,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table requirementdata (
	uuid_ VARCHAR(75) null,
	requirementDataId LONG not null primary key,
	skillSetId VARCHAR(75) null,
	experience LONG,
	jd VARCHAR(75) null,
	budget LONG,
	remarks VARCHAR(75) null,
	status VARCHAR(75) null,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table skillset (
	uuid_ VARCHAR(75) null,
	skillSetId LONG not null primary key,
	skillSetName VARCHAR(75) null,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table sourcevendor (
	sourceVendorId LONG not null primary key,
	empName VARCHAR(75) null,
	empEmail VARCHAR(75) null,
	empMobile VARCHAR(75) null,
	empDob DATE null,
	empExperience LONG,
	empLocation VARCHAR(75) null,
	cvId LONG,
	cvPath VARCHAR(75) null,
	statusByCustomer VARCHAR(75) null,
	statusByRM BOOLEAN,
	deployedOnCustomer BOOLEAN,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);