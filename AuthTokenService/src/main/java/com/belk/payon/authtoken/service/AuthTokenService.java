package com.belk.payon.authtoken.service;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.belk.payon.authtoken.model.AuthTokenResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class AuthTokenService {

	@Value("${app.auth.token.url}")
	private String authTokenUrl;

	@Value("${authentication.userId}")
	private String userId;

	@Value("${authentication.password}")
	private String password;

	@Value("${authentication.entityId}")
	private String entityId;

	@Value("${app.testMode}")
	private String testMode;

	@Value("${app.currencyCode}")
	private String currencyCode;

	@Value("${app.countryCode}")
	private String countryCode;

	@Value("${app.environment}")
	private String environment;

//	@Autowired
//	private RestTemplate restTemplate;
	
	private final static Logger LOG = LoggerFactory.getLogger(AuthTokenService.class);

	public AuthTokenResponse retrieveAuthTokenDetails() throws JsonParseException, JsonMappingException, IOException {

		HttpHeaders headers = new HttpHeaders();
		// headers.set(HttpHeaders.AUTHORIZATION, "");
		headers.add("Accept", MediaType.APPLICATION_JSON_UTF8.toString());  
        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED.toString());
//		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		authTokenUrl = authTokenUrl + "4111119632041111" + "/payments";
//		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(authTokenUrl)
//				.queryParam("authentication.userId", userId).queryParam("authentication.password", password)
//				.queryParam("authentication.entityId", entityId).queryParam("merchantTransactionId", "F888211111188417")
//				.queryParam("amount", new Double("19.23")).queryParam("currency", currencyCode).queryParam("paymentType", "DB")
//				.queryParam("paymentBrand", "VISA").queryParam("card.holder", "Kalam")
//				.queryParam("card.expiryMonth",new Integer("11")).queryParam("card.expiryYear", new Integer("2022"))
//				.queryParam("card.cvv", new Integer("111")).queryParam("customParameters['StoredCredentialType']", "CIT_STORED")
//				.queryParam("billing.street1", "3850 E Independence Blvd")
//				.queryParam("billing.street2", "").queryParam("billing.city", "Charlotte")
//				.queryParam("billing.state", "NC").queryParam("billing.postcode", "28205-7305")
//				.queryParam("billing.country", countryCode).queryParam("shipping.street1", "3850 E Independence Blvd")
//				.queryParam("shipping.street2", "").queryParam("shipping.city", "Charlotte")
//				.queryParam("shipping.state", "NC").queryParam("shipping.postcode", "28205-7305")
//				.queryParam("shipping.country", countryCode).queryParam("shipping.method", "LOWEST_COST")
//				.queryParam("shipping.customer.givenName", "john").queryParam("shipping.customer.surname", "joseph")
//				.queryParam("customer.givenName", "john").queryParam("customer.surname", "joseph")
//				.queryParam("customer.phone", "333-444-5556")
//				.queryParam("customer.email", "TC_BELK_SmokeTest_00240gmail.com")
//				.queryParam("customer.ip", "66.85.48.11").queryParam("cart.items[0].sku", "0438580470911")
//				.queryParam("cart.items[0].type", "26010915802").queryParam("cart.items[0].name", "Gold")
//				.queryParam("cart.items[0].quantity", new Integer("1")).queryParam("merchantInvoiceId", "75175413")
//				.queryParam("customParameters['CYBERSOURCE_orderSource']", "WEB")
//				.queryParam("customParameters['CYBERSOURCE_tenderTypes']", "3PCC")
//				.queryParam("customParameters['CYBERSOURCE_creditCardAmount']", new Double("18.23"))
//				.queryParam("customParameters['CYBERSOURCE_orderTotalAmount']", new Double("19.23"))
//				.queryParam("customParameters['CUSTOM_taxAmount']", new Double("2.23"))
//				.queryParam("customParameters['CUSTOM_fraudDetectIndicator']", new Integer("3"))
//				.queryParam("customParameters['source']", "DW");
//		if ("TEST".equalsIgnoreCase(environment)) {
//			builder.queryParam("testMode", testMode);
//		}
		
		//ParameterizedTypeReference<Map<String, Object>> requestMap = new ParameterizedTypeReference<Map<String, Object>>(){};
		
		MultiValueMap<String, Object> requestMap = new LinkedMultiValueMap<>();
		requestMap.add("authentication.userId", userId);
		requestMap.add("authentication.password", password);
		requestMap.add("authentication.entityId", entityId);
		requestMap.add("merchantTransactionId", "F888211111188418");
		requestMap.add("amount", new Double("19.23"));
		requestMap.add("currency", currencyCode);
		requestMap.add("paymentType", "DB");
		requestMap.add("paymentBrand", "VISA");
		requestMap.add("card.holder", "Kalam");
		requestMap.add("card.expiryMonth", new Integer("11"));
		requestMap.add("card.expiryYear", new Integer("2022"));
		requestMap.add("card.cvv", new Integer("111"));
		requestMap.add("customParameters['StoredCredentialType']", "CIT_STORED");
		requestMap.add("testMode", "EXTERNAL");
		requestMap.add("billing.street1", "3850 E Independence Blvd");
		requestMap.add("billing.street2", "");
		requestMap.add("billing.city", "Charlotte");
		requestMap.add("billing.state", "NC");
		requestMap.add("billing.postcode", "28205");
		requestMap.add("billing.country", "US");
		requestMap.add("shipping.street1", "3850 E Independence Blvd");
		requestMap.add("shipping.street2", "");
		requestMap.add("shipping.city", "Charlotte");
		requestMap.add("shipping.state", "NC");
		requestMap.add("shipping.postcode", "28205");
		requestMap.add("shipping.country", "US");
		requestMap.add("shipping.method", "LOWEST_COST");
		requestMap.add("shipping.customer.givenName", "john");
		requestMap.add("shipping.customer.surname", "joseph");
		requestMap.add("customer.givenName", "john");
		requestMap.add("customer.surname", "joseph");
		requestMap.add("customer.phone", "3334445556");
		requestMap.add("customer.email", "TC_BELK_SmokeTest_@gmail.com");
		requestMap.add("customer.ip", "66.85.48.11");
		requestMap.add("cart.items[0].sku", "0438580470911");
		requestMap.add("cart.items[0].type", "26010915802");
		requestMap.add("cart.items[0].name", "Gold");
		requestMap.add("cart.items[0].quantity", new Integer("1"));
		requestMap.add("merchantInvoiceId", "75175413");
		requestMap.add("customParameters['CYBERSOURCE_orderSource']", "WEB");
		requestMap.add("customParameters['CYBERSOURCE_tenderTypes']", "3PCC");
		requestMap.add("customParameters['CYBERSOURCE_creditCardAmount']", new Double("18.23"));
		requestMap.add("customParameters['CYBERSOURCE_orderTotalAmount']", new Double("19.23"));
		requestMap.add("customParameters['CUSTOM_taxAmount']", new Double("2.23"));
		requestMap.add("customParameters['CUSTOM_fraudDetectIndicator']", new Integer("3"));
		requestMap.add("customParameters['source']", "DW");
		
		

		HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(requestMap,headers);
//		HttpEntity entity = new HttpEntity(headers);
		ResponseEntity<AuthTokenResponse> response = null;
		try {
			RestTemplate restTemplate = new RestTemplate();
		 response = restTemplate.exchange(authTokenUrl, HttpMethod.POST,
				entity, AuthTokenResponse.class);
		}catch (final HttpClientErrorException httpClientErrorException) {
			throw httpClientErrorException;
			
		  } catch (HttpServerErrorException httpServerErrorException) {
			  httpServerErrorException.printStackTrace();
		  } catch (Exception exception) {
			  exception.printStackTrace();
		    } 
		Optional<AuthTokenResponse> authTokenResponse = Optional.ofNullable(response.getBody());
		return authTokenResponse.get();

	}

	
}
