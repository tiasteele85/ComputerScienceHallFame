package co.grandcircus.computer_science_hall;

import java.util.Comparator;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {
	
	private RestTemplate restTemplate;
	
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Tiny> getTinyRecords(){
		
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		RecordResponse response = restTemplate.getForObject(url, RecordResponse.class);	
		
		List<Tiny> sortedList = response.getTiny();
		
		sortedList.sort(Comparator.comparing(Tiny::getYear));
		return sortedList;
	}
	
	public List<Complete> getCompleteRecords(){
		
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		RecordResponse response = restTemplate.getForObject(url, RecordResponse.class);
		
		List<Complete> sortedList = response.getComplete();
		sortedList.sort(Comparator.comparing(Complete::getYear));
		
		return sortedList;
		
	}
}
