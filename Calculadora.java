public class Calculadora{
	public static void main(String[] args){
		if (args.length==3){
			try{
				int op1 = Integer.ParseInt(args[1]);
				int op2 = Integer.ParseInt(args[2]);
				
				if("+".equals(args[0])){
					System.out.println(op1+op2);
				}
				else if ("-".equals(args[0])){
					System.out.println(op1-op2);
				}
				else{
					System.out.println(args[0] + ": operacion desconocida");
					
				
				System.out.println(op1 + op2);
			}
			catch (Exception ex){
				System.out.println("Parametro incorrectos");
			}
		}
		else{
			System.out.println("Uso: Calculadora operador operando1 operando2");
		}
	}
}
