
public class App {

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");

        String title;
        String options;
        int result;

        // Teste com valores completos:
        System.out.println("Teste 1:");
        title = "Menu Principal";
        options = "1. Opção 1;2. Opção 2;3. Opção 3;4. Opção 4;5. Opção 5;6. Opção 6;7. Opção 7;8. Opção 8;9. Opção 9;10. Opção 10";

        result = menuBuild.buildMenu(title, options);

        if (result == -1) {
            System.out.println("Erro: O título do menu é nulo. 1");
        } else if (result == -2) {
            System.out.println("O menu não possui opções disponíveis. 1");
        }else{
            System.out.println("\n\nCheck: O menu foi construido corretamente. 1");
        }

        // Teste com título nulo:
        System.out.println("\nTeste 2:");
        title = null;
        options = "1. Opção 1;2. Opção 2;3. Opção 3;4. Opção 4;5. Opção 5;6. Opção 6;7. Opção 7;8. Opção 8;9. Opção 9;10. Opção 10";

        result = menuBuild.buildMenu(title, options);
        
        if (result == -1) {
            System.out.println("Erro: O título do menu é nulo. 2");
        } else if (result == -2) {
            System.out.println("O menu não possui opções disponíveis. 2");
        }else if(result == 0){
            System.out.println("Check: O menu foi construido corretamente. 2");
        }

        // Teste com opções nulas:
        System.out.println("\nTeste 3:");
        title = "Menu Principal";
        options = null;
        result = menuBuild.buildMenu(title, options);
        
        if (result == -1) {
            System.out.println("Erro: O título do menu é nulo. 3");
        } else if (result == -2) {
            System.out.println("O menu não possui opções disponíveis. 3");
        }else if(result == 0){
            System.out.println("Check: O menu foi construido corretamente. 3");
        }
        
        // Teste com título e opções nulas:
        System.out.println("\nTeste 4:");
        title = null;
        options = null;
        result = menuBuild.buildMenu(title, options);
        
        if (result == -1) {
            System.out.println("Erro: O título do menu é nulo. 4");
        } else if (result == -2) {
            System.out.println("O menu não possui opções disponíveis. 4");
        }else if(result == 0){
            System.out.println("Check: O menu foi construido corretamente. 4");
        }
    }
}
