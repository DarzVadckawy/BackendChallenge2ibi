 # A Backend Challenge from 2iBi 
 
 Esta é uma API Rest desenvolvida usando a framework Spring Boot
 
 Ela está documentada pelo Swagger UI e a mesma pode ser acedida pelo seguinte link: https://bit.ly/3q0LXw9
 No link acima, encontram-se todos os endpoints da API.
 
 
 Abaixo segue a lista de alguns dos endpoints (de salientar que a documentação completa está disponível no link acima):
 
 https://countriesapi2ibi.herokuapp.com/list.    (Listar todos os países registados)
	
	https://countriesapi2ibi.herokuapp.com/list/{varivável}/{ordem}. (Aqui podemos retornar a lista ordenada de acordo com a variável desejada
	e com a ordem podendo ser asc (ordem crescente) ou desc (ordem decrescente).
	Exemplo:	https://countriesapi2ibi.herokuapp.com/list/id/asc  (Para listar em ordem crescente usando o ID como parâmetro)
										https://countriesapi2ibi.herokuapp.com/list/id/desk  (Para listar em ordem decrescente usando o ID como parâmetro)

 
 https://countriesapi2ibi.herokuapp.com/save.    (Salvar um novo país)
	
 https://countriesapi2ibi.herokuapp.com/{id}.    (Pesquisar um determinado país pelo seu ID)
	
 https://countriesapi2ibi.herokuapp.com/delete.  (Remover um país)
	
 https://countriesapi2ibi.herokuapp.com/update.  (Actualizar um país já registado)



 
