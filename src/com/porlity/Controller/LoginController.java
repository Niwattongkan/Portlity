package com.porlity.Controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

@Controller
public class LoginController {
	@RequestMapping("/login")
	@ResponseBody
	public String LoginObject(HttpServletRequest request) {
		HttpTransport transport = new NetHttpTransport();
		JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(transport, jsonFactory)
				.setAudience(Collections.singletonList("322812928410-ru9dr6in3oa9gcqbu6tefptb61fd1pt9.apps.googleusercontent.com"))
				.build();
		System.out.println("id token backend: " + request.getParameter("idtoken"));
		String idTokenString = request.getParameter("idtoken");
		Boolean emailVerified = false;
		GoogleIdToken idToken = null;
		
		try {
			idToken = verifier.verify(idTokenString);
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (idToken != null) {
			Payload payload = idToken.getPayload();
			String userId = payload.getSubject();
			System.out.println("User ID: " + userId);
			String email = payload.getEmail();
			emailVerified = payload.getEmailVerified();
			String name = (String) payload.get("name");
			String pictureUrl = (String) payload.get("picture");
			String locale = (String) payload.get("locale");
			String familyName = (String) payload.get("family_name");
			String givenName = (String) payload.get("given_name");
		} else {
			System.out.println("Invalid ID token.");
		}
		//
		return emailVerified.toString();
	}

}