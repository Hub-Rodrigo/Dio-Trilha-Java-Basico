package AulaHeranca.Exercicio2;

class RodarApplicativo {
    
    public static void main(String[] args){
        //Vetor criado para efetuar polimofismo e sobrecrita das subclasses
       ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        

        //metodo  que acontecero o polimofismo
        for(ClasseMae classe: classes){
        classe.metodo1();
        }

        System.out.println("");
        //nao acorer polimofismo e por isso classe sera sobrescrita
        for(ClasseMae classe: classes){
        classe.metodo2();
            
        }

        System.out.println("");
        //metodo para  sobrescrever a sub classe
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();

    }
    
}
