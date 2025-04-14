import java.util.HashMap;
import java.util.Map;

public class ParserJSONManuale {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nessuna stringa JSON fornita!");
            System.out.println("Esempio: java ParserJSONManuale \"{\\\"nome\\\":\\\"Luca\\\",\\\"eta\\\":22}\"");
            return;
        }
        
        String jsonString = args[0];
        System.out.println("Stringa JSON in input: " + jsonString);
        
        try {
            // Rimuovo le parentesi graffe esterne
            jsonString = jsonString.trim();
            if (jsonString.startsWith("{") && jsonString.endsWith("}")) {
                jsonString = jsonString.substring(1, jsonString.length() - 1);
            } else {
                throw new Exception("Formato JSON non valido: mancano le parentesi graffe");
            }
            
            // Divido in coppie chiave-valore
            Map<String, String> keyValueMap = new HashMap<>();
            String[] pairs = jsonString.split(",");
            
            for (String pair : pairs) {
                String[] keyValue = pair.split(":", 2);
                
                if (keyValue.length == 2) {
                    // Rimuovo le virgolette dalle chiavi e valori
                    String key = keyValue[0].trim();
                    String value = keyValue[1].trim();
                    
                    if (key.startsWith("\"") && key.endsWith("\"")) {
                        key = key.substring(1, key.length() - 1);
                    }
                    
                    if (value.startsWith("\"") && value.endsWith("\"")) {
                        value = value.substring(1, value.length() - 1);
                    }
                    
                    keyValueMap.put(key, value);
                }
            }
            
            // Estraggo i valori e creo l'oggetto Persona
            String nome = keyValueMap.get("nome");
            String etaStr = keyValueMap.get("eta");
            String email = keyValueMap.get("email");
            
            if (nome == null || etaStr == null) {
                throw new Exception("Mancano i campi obbligatori 'nome' o 'eta'");
            }
            
            int eta = Integer.parseInt(etaStr);
            
            Persona persona = (email != null) 
                ? new Persona(nome, eta, email) 
                : new Persona(nome, eta);
                
            System.out.println("Oggetto persona creato: " + persona);
            
        } catch (Exception e) {
            System.out.println("Errore durante il parsing: " + e.getMessage());
        }
    }
}
