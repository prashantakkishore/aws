package example;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWithInterface implements RequestHandler<Integer, String>{
	
    public String handleRequest(Integer myCount, Context context) {
        return "Your HelloWithInterface:handleRequest count is " + String.valueOf(myCount);
    }
}