package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {

	    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {

		            List<Map<String, String>> result = new ArrayList<>();

			            Integer sizeWhere = where.size();

				            for (Map<String, String> book: books) {
						                Integer count = 0;
								            for (Map.Entry<String, String> w: where.entrySet()) {
										                    String valueW = w.getValue();
												                    String keyW = w.getKey();
														                    String valueB = book.get(keyW);

																                    if (valueW.equals(valueB)) {
																			                        count++;
																						                }
																		                }
									                if (count.equals(sizeWhere)) {
												                result.add(book);
														            }
											        }
					            return result;
						        }
}
//END
