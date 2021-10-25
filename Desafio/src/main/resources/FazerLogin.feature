# language: pt
Funcionalidade: Teste Login

	@login	
Cenario: Fazer login
	Dado que estou na tela inicial
	Quando clico no MENU USER 
	Entao preencho no username "Francis"
	E na password "Chic234"
	E depois clicar em SIGN IN
	Entao teremos a conta logada
	