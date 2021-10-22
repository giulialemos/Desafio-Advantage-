# language: pt
Funcionalidade: Teste Cadastro

Cenario: Fazer cadastro
	Dado que estou na tela inicial
	Quando clico no MENU USER e depois em CRIAR NOVA CONTA
	Entao na tela de cadastro insiro os dados necessarios
	E depois clicar em REGISTRO
	
Cenario: Fazer login
	Dado que estou na tela inicial
	Quando clico no MENU USER 
	Entao preencho USERNAME e PASSWORD cadastrados no cenario anterior
	E depois clicar em SIGN IN
	Entao teremos a conta logada
	
Cenario: Pesquisar produto
 Dado que estamos na tela inicial
 Quando clicamos MENU SEARCH 
 Entao digitamos o produto desejado
 E clicamos em alguma opcao 
	

	