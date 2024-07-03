package StringBuilder;
public class StringBuilderEjemplos{
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append("Hola")
          .append(" ")
          .append("Mundo")
          .append("!")
          .append(" Año: ")
          .append(2024);
        
        System.out.println(sb);
        
        for (int i = 1; i <= 5; i++) {
            sb2.append(i);

            if (i < 5) {
                sb2.append(", ");
            }
        }
        
        System.out.println(sb2);
    }
}
