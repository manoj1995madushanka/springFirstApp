package first.firewire.binarySearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BinarySearchApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binrySearch(new int[] {12 ,4, 6},3);
		
		System.out.print(result);
		
		SpringApplication.run(BinarySearchApplication.class, args);
	}

}
