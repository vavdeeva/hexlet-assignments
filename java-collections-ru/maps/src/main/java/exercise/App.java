package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
	    public static Map<String, Integer> getWordCount(String sentence) {
		            Map<String, Integer> wordsCount = new HashMap<>();

			            if (!sentence.equals("")) {
					                String sentenceToLow = sentence.toLowerCase();
							            String[] words = sentenceToLow.split(" ");

								                for (String word : words) {
											                Integer count = 1;
													                if (wordsCount.get(word) != null) {
																                    count = wordsCount.get(word) + 1;
																		                    }
															                wordsCount.put(word, count);
																	            }
										        }
				            return wordsCount;
					        }

	        public static String toString(Map<String, Integer> wordsCount) {
			        String result = "{";
				        String resultMid = "";
					        for (String w: wordsCount.keySet()) {
							            resultMid = resultMid + "\n  " + w + ": " + wordsCount.get(w);
								            }
						        if (!resultMid.equals("")) {
								            resultMid = resultMid + "\n";
									            }
							        return result + resultMid + "}";
								    }
}
//END
