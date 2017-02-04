/* Alterar o ano de fabricação dos veículos 
da sua frota para 2006 cujos veículos são movidos à gasolina. */

UPDATE roda_dura.frota SET  ano_carro = 2006
WHERE combustivel_carro = "Gasolina";


/* vai alterar duas linhas 
2	Civic	2009	Gasolina	Honda
3	Meriva	1998	Gasolina	Chevrolet


*/
