package com.example.Service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.NadmorskaVisina;


@Service
public class NadmorskaVisinaService {

	private final KieContainer kieContainer;
	
	@Autowired
	public NadmorskaVisinaService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}
	
	
	public NadmorskaVisina changeHeight(NadmorskaVisina nv) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(nv);
		kieSession.fireAllRules();
		kieSession.dispose();
		return nv;
	}

	
}
