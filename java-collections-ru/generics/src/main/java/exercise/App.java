package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
	    public static List<Map> findWhere(List<Map> books, Map<String, String> where) {
		            List<Map> result = new ArrayList<>();
			            Integer sizeWhere = where.size();

				            for (Map book: books) {
						                Integer count = 0;
								            for (Map.Entry<String, String> w: where.entrySet()) {
										                    Object valueW = w.getValue();
												                    Object keyW = w.getKey();
														                    Object valueB = book.get(keyW);

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
