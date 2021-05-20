package com.example.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Pcelar {
	
	private ArrayList<Pcelinjak> kosnice;
	private float ukupna_ocena_pcelinjaka;
	private float ocena_pcelar;
}
