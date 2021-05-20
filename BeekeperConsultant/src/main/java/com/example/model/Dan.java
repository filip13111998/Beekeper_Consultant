package com.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Dan {
	private float temperatura;
	private float vlaznost_vazduha;
	private float jacina_vetra;
	private TipDan tip_dana;
	private float ocena;
}
