
//Customer Feedback Analysis

import java.util.Arrays;
import java.util.List;

public class principal {

	public static void main(String[] args) {
		
		 // The list of customer feedback comments
        List<String> feedbackComments = Arrays.asList(
            "Great service!",
            "The product quality is superb.",
            "Great service!",
            "Delivery was late.",
            "Excellent product.",
            "Very satisfied with the purchase.",
            "Very satisfied with the purchase.",
            "Good value for money.",
            "Poor customer support.",
            "The product quality is superb."
        );

        // Process the feedback comments to analyze meaningful feedback
        // 1. Filter comments with more than 20 characters
        // 2. Log each comment being processed
        // 3. Remove duplicate comments
        // 4. Sort comments alphabetically
        // 5. Terminal operation: Print each unique, sorted comment
        feedbackComments.stream()
            .filter(comment -> comment.length() >= 20) 
            .peek(comment -> System.out.println("Processing comment: " + comment)) 
            .distinct() 
            .sorted() 
            .forEach(comment -> System.out.println(comment)); 
		}
}
