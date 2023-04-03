import java.util.HashMap;
import java.util.Map;

public class FaturamentoMensal {

    public static void main(String[] args) {

        Map<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        double totalFaturamento = 0.0;

        for (Map.Entry<String, Double> entry : faturamento.entrySet()) {
            totalFaturamento += entry.getValue();
        }

        for (Map.Entry<String, Double> entry : faturamento.entrySet()) {
            double percentual = (entry.getValue() / totalFaturamento) * 100.0;
            System.out.println("Estado: " + entry.getKey() + " - Percentual de Representação: " + percentual + "%");
        }
    }
}
