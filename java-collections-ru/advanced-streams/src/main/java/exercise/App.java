package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {

	    public static String getForwardedVariables(String content) {
		            String[] split = content.split("\r\n");

			            String result = "";

				            for (String s: split) {
						                System.out.println(s);
								            if (s.startsWith("environment")) {
										                    String replace = s.replace("environment=", "").replace("\"", "");
												                    String [] split2 = replace.split(",");
														                    for (String s2: split2) {
																	                        if (s2.startsWith("X_FORWARDED_")) {
																					                        if (!result.equals("")) {
																									                            result = result + ",";
																												                            }
																								                        result = result + s2.replace("X_FORWARDED_", "");
																											                    }

																				                }
																                }
									            }

					            return result;
						        }

}
//END
