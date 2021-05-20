package com.example.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Pcelinjak {
	
	private ArrayList<Pasa> pase;//Pase na kojima je pcelinjak bio koje godine 
	private TipPasa tip_pase;
	private NadmorskaVisina nadmorksa_visina;
	private Priroda priroda;
	private ArrayList<Kosnica> kosnice;
	private ArrayList<Dan> vremenska_prognoza;
	private float ocena;
}
