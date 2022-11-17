package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

	    public static long getCountOfFreeEmails(List<String> emailsList) {

		            long amount = emailsList.stream()
				                    .filter(emailList -> emailList.contains("@gmail.com") || emailList.contains("@yandex.ru") || emailList.contains("@hotmail.com"))
						                    .count();
			            return amount;
				        }

}
// END
