# language: pt
Funcionalidade: Teste Cadastro

	@cadastro
Cenario: Fazer cadastro
	Dado que estou na tela inicial
	Quando clico no MENU USER  
	E depois clico em CREATE NEW ACCOUNT
	Entao na tela de cadastro preencho no usernameregisterpage "Francis"
	E no emailregisterpage "chicco@lemos.com"
	E na passwordregisterpage "Chic234"
	E na confirmpasswordregisterpage "Chic234"
	E clicar no botao I GREE
	E depois clicar em REGISTER
	
	@login	
Cenario: Fazer login
	Dado que estou na tela inicial
	Quando clico no MENU USER 
	Entao preencho no username "Francis"
	E na password "Chic234"
	E depois clicar em SIGN IN
	Entao teremos a conta logada
	
		@pesquisa	
Cenario: Pesquisar produto
 Dado que estou na tela inicial
 Quando clico MENU SEARCH 
 Entao digito "Headphones" para pesquisa
 E clicamos em alguma opcao 
	