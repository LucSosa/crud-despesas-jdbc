# CRUD Despesas JDBC
![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=COURSE&message=CLOSE&color=RED&style=for-the-badge)

Hi! I'm Lucas Sosa. This project is a study about CRUD during this course I used Java and Postgress, the study ocurred in period between May 8th and May 10th.

# Files

In this project I used the archtetury DAO.
- To apply we should be use the files
	-	AtualizarDespesas : This class will perform the update .
	-	ListarDespesas		:  This class will perform the List's (find by id, find by category and find all).
	-	RemoverDespesas:  This class will perform the delete, using the argument ID.

# Software Used

For this project, i used:

 - PG Admin
 - Intellij IDEA Community

> **Used Database:** 

 - To create the database you must type:
	 - create table despesas (
		id bigserial primary key,
		descricao varchar(100),
		data date,
		valor decimal (10, 2),
		categoria varchar(60)
);

# Lessons learned from this project

JDBC é uma API de nível de chamada,
o que significa que as instruções SQL
são transmitidas como sequências para a API que, então,
se encarrega de executá-las no RDMS. Consequentemente, 
o valor dessas sequências pode ser alterado no tempo de execução, 
tornando o JDBC dinâmico.

https://www.devmedia.com.br/jdbc-tutorial/6638

CRUD (Create, Read, Update, Delete) 
é um acrônimo para as maneiras de se operar em informação armazenada.

https://blog.betrybe.com/tecnologia/crud-operacoes-basicas/
