/* tokens '\c e \p nao sao aceitos. nao existe parametro 'if exists' para 'drop user' */
drop table shell001 if exists;
\p tables dropped.

/* range numérico */
create table shell001 (
   aplic char(20) primary key,
   ender char(255)
);

\p tables generated.

grant select, insert, update, delete on shell001 to iocastedb;
\p permissions granted.

insert into shell001 (aplic, ender) values ('task_selector', '/tasksel.jsp');
\p initial configuration saved.

commit work;

