# language: pt
Funcionalidade: Teste Cadastro

@cadastro
Cenario: Fazer cadastro
	Dado que estou na tela inicial
	Quando clico no MENU USER e depois em CREATE NEW ACCOUNT
	Entao na tela de cadastro preencho no username "Francisco"
	E no email "chico@lemos.com"
	E na password "Chico123"
	E na confirm password "Chico123"
	E clicar no botao I GREE
	E depois clicar em REGISTER

@login	
Cenario: Fazer login
	Dado que estou na tela inicial
	Quando clico no MENU USER 
	Entao preencho no username "Francisco"
	E na password "Chico123"
	E depois clicar em SIGN IN
	Entao teremos a conta logada

@pesquisa	
Cenario: Pesquisar produto
 Dado que estou na tela inicial
 Quando clico MENU SEARCH 
 Entao digito "Headphones" para pesquisa
 E clicamos em alguma opcao 
	

	