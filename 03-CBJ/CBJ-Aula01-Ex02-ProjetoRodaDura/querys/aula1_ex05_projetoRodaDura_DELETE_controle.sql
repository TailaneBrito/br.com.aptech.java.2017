/* Excluir as despesas menores ou iguais à R$ 10.000. */

DELETE FROM roda_dura.controle
WHERE valor <= 10000;


/* linhas excluidas

100	Salário Funcionários	8000	Despesa
300	Aluguel Loja			1500	Despesa
400	Internet				100		Despesa
500	Outros					10000	Receita

*/
