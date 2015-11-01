# Escola - Sistema de gerenciamento Escolar
This is a simple project of mamanagement of school. This, are been done with java (1.8) and JavaFX 2.0

# Ambiente
- Baixar, caso não possua, o java jdk 1.8 e setar como default no sistema
- Verificar se no eclipse o jdk 1.8 é o utilizado:
  - Abra a aba Preferences do Eclipse e navegue até Java | Installed JREs.
  - Caso não esteja a JDK 1.8, Clique em Add, selecione Standard VM e a informe a Pasta onde se encontra o JDK 8.
  - Remova os outros JREs ou JDKs então o JDK 8 torna-se o padrão.
- Após esse passo ainda é preciso fazer:
  - Navegue até Java | Compiler. Altere o Compiler compliance level para 1.8.
- Feito isso, é a hora de preparar o eclipse(Estou utlizando a MARS) para o JAVAFX:
  - Abra o menu help -> install new software
  - Primeiro devemos instalar o xText, é uma dependência do JavaFx
  - Colocar a URL no campo Work With e seguira instalação -  http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/
  - Só é preciso selecionar o item Xtext.
  - Após o eclipse reiniciar, ir até a mesma tela anterior e por a seguinte URL:
    - http://download.eclipse.org/efxclipse/updates-released/2.1.0/site 
  - Após o eclipse reiniciar devemos baixar o Scene Builder
  - Baixar o Schene Builder na URI http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-1x-archive-2199384.html
  - Abrir o Eclipse. Naviegue até preferences na aba JavaFX . Especifique o caminho até o executável do Scene Builder.
Ambiente preparado !

# Projeto
- git clone https://github.com/luanoliveira1992/escola.git
- Importar o projeto no eclipse como JavaFx Project
- No Arquivo EscolaAPP rodar como um projeto Java Normal



