package com.belk.payon.reversal.service;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.belk.payon.reversal.model.ReversalResponse;

@Service
public class ReversalService {
	
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

	@Value("${app.environment}")
	private String environment;

	@Autowired
	private RestTemplate restTemplate;

	public ReversalResponse getReversalDetails() {
		HttpHeaders headers = new HttpHeaders();
		// headers.set(HttpHeaders.AUTHORIZATION, "");
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		authTokenUrl = authTokenUrl + "paymentId";
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(authTokenUrl)
				.queryParam("authentication.userId", userId).queryParam("authentication.password", password)
				.queryParam("authentication.entityId", entityId).queryParam("merchantTransactionId", "D888211111172418")
				.queryParam("amount", 30.25).queryParam("currency", currencyCode).queryParam("paymentType", "DB")
				.queryParam("customParameters[source]", "DW");
		if ("TEST".equalsIgnoreCase(environment)) {
			builder.queryParam("testMode", testMode);
		}

		HttpEntity entity = new HttpEntity(headers);
		ResponseEntity<ReversalResponse> response = restTemplate.exchange(builder.toUriString(), HttpMethod.POST,
				entity, ReversalResponse.class);
		Optional<ReversalResponse> authFraudTokenResponse = Optional.ofNullable(response.getBody());
		return authFraudTokenResponse.get();
	}

	@Bean
	public RestTemplate restTemplate() throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

		SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy)
				.build();

		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();

		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		messageConverters.add(converter);
		restTemplate.setMessageConverters(messageConverters);
		return restTemplate;
	}

}
