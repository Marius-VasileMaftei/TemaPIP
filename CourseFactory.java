package TemaC;

public class CourseFactory {
//	private Course curs;
//	
//	public void clean() {
//		if(curs != null) {
//			curs = null;
//		}
//	}
	
	public Course alegeCurs(String an, double nota) {
		if(an.equals("III") && nota == 10 ) {
			return  new ComputerSecurity();
		}else if(an.equals("III") && (nota < 10 && nota >= 9.5)){
			return new QuantumInformation();
		}else if(an.equals("III") && (nota < 9.5 && nota >= 9)){
			return new ArtificialIntelligence();
		}else if(an.equals("III") && (nota < 9 && nota >= 8.5)){
			return new MachineLearning();
		}else if((an.equals("II") && (nota <= 10 && nota >= 8)) || (an.equals("III") && (nota < 8.5 && nota >= 7.5))){
			return new  ComputerGraphics();
		}else if((an.equals("II") && (nota < 8 && nota >= 7)) || (an.equals("III") && (nota < 7.5 && nota >= 6))){
			return new PrinciplesProgramming();
		}
		return null;
	}
}
