create index IX_A74CAAD9 on requirementdata (status[$COLUMN_LENGTH:75$]);
create unique index IX_EF4BBE69 on requirementdata (uuid_[$COLUMN_LENGTH:75$], groupId);

create unique index IX_836E576D on skillset (uuid_[$COLUMN_LENGTH:75$], groupId);