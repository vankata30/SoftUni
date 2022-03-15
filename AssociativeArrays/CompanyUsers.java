package AssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new LinkedHashMap<>();
        boolean isThere = false;
        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String company = input.split("->")[0].trim();
            String employee = input.split("->")[1].trim();
            if (!companies.containsKey(company)) {
                List<String> currentCompany = new ArrayList<>();
                currentCompany.add(employee);
                companies.put(company, currentCompany);
            }
            if (companies.containsKey(company) && !companies.get(company).contains(employee)) {
                companies.get(company).add(employee);

            }
            input = scanner.nextLine();
        }


        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));

            }
        }
    }

}


