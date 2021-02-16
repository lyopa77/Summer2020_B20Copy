package bootCamp;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, LocalDate>  employee = new LinkedHashMap<>();
        employee.put("John", LocalDate.of(2019, 5, 25));
        employee.put(null, LocalDate.of(2018, 5, 25));
        employee.put(null, LocalDate.of(2018, 5, 30));
        employee.put("Daniel", LocalDate.of(2017, 5, 25));
        employee.put("Daniel", LocalDate.of(2017, 5, 26));
        employee.put("Daniel", LocalDate.of(2017, 6, 25));

        System.out.println(employee);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println( employee.get(null));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("===============================");
        for( String eachKey : employee.keySet()){
            System.out.println("Each key "+ eachKey);
        }

        System.out.println("=================================");
        for(LocalDate eachValue  : employee.values()){
            System.out.println(eachValue);
        }

        System.out.println("================================");

        for(Map.Entry<String, LocalDate>  each : employee.entrySet()){
            System.out.println(each.getKey());
            System.out.println(each.getValue());
        }



    }
}
