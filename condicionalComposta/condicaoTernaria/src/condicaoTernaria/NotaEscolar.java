package condicaoTernaria;
//Aqui usamos a condição ternária 

public class NotaEscolar {
    public static void main(String[] args) {
    	int nota = 6;
    	
    	//Posso usar assim o ternário 
    	//String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
    	
    	
    	//encadeado ternário 
    	String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
    	System.out.println(resultado);
	}
}
