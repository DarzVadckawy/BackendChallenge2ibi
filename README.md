 # A Backend Challenge from 2iBi 
 
 Esta é uma API Rest desenvolvida usando a framework Spring Boot
 
 Ela está documentada pelo Swagger UI e a mesma pode ser acedida pelo seguinte link: https://countriesapi2ibi.herokuapp.com/swagger-ui.html
 No link acima, encontram-se todos os endpoints da API.
 
 
 Abaixo segue a lista de alguns dos endpoints (de salientar que a documentação completa está disponível no link acima):
 
 https://countriesapi2ibi.herokuapp.com/api/countries/list.    (Listar todos os países registados)
	
	https://countriesapi2ibi.herokuapp.com/api/countries/list/{varivável}/{ordem}. (Aqui podemos retornar a lista ordenada de acordo com a variável desejada
	e com a ordem podendo ser asc (ordem crescente) ou desc (ordem decrescente).
	Exemplo:	https://countriesapi2ibi.herokuapp.com/api/countries/list/id/asc  (Para listar em ordem crescente usando o ID como parâmetro)
										https://countriesapi2ibi.herokuapp.com/api/countries/list/id/desk  (Para listar em ordem decrescente usando o ID como parâmetro)

 
 https://countriesapi2ibi.herokuapp.com/api/countries/save.    (Salvar um novo país)
	
 https://countriesapi2ibi.herokuapp.com/api/countries/{id}.    (Pesquisar um determinado país pelo seu ID)
	
 https://countriesapi2ibi.herokuapp.com/api/countries/delete.  (Remover um país)
	
 https://countriesapi2ibi.herokuapp.com/api/countries/update.  (Actualizar um país já registado)



 
