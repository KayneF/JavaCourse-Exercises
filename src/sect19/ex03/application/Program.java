package sect19.ex03.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> votes = new TreeMap<>();
		String defaultPath = System.getProperty("user.home") + "/temp/in.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(defaultPath))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0]; 
				int count = Integer.parseInt(fields[1]);
				
				if (votes.containsKey(name)) {
					int totalVotes = votes.get(name);
					votes.put(name, count + totalVotes);
				}
				else {
					votes.put(name, count);
				}
				line = br.readLine();
			}
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		scan.close();
	}
}
