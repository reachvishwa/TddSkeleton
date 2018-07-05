package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralTest {

	@Test 
	public void RomanNumeralTestfor1() {

		NumeralConverter numconv = new NumeralConverter();
		String result = numconv.getRomanNumeral(1);
		assertThat(result, is("I"));
	}

	@Test
	public void RomanNumeralTestfor10() {

		NumeralConverter numconv = new NumeralConverter();
		String result = numconv.getRomanNumeral(10);
		assertThat(result, is("X"));
	}

	@Test
	public void RomanNumeralTestfor7() {

		NumeralConverter numconv = new NumeralConverter();
		String result = numconv.getRomanNumeral(7);
		assertThat(result, is("VII"));
	}


	@Test
	public void normalNumberTestforI() {

		NumeralConverter numconv = new NumeralConverter();
		int romcon = numconv.getNormalNumeral("I");
		assertThat(romcon, is(1));
	}

	@Test
	public void normalNumberTestforX() {

		NumeralConverter numconv = new NumeralConverter();
		int romcon = numconv.getNormalNumeral("X");
		assertThat(romcon, is(10));
	}

	@Test
	public void normalNumberTestforVII() {

		NumeralConverter numconv = new NumeralConverter();
		int romcon = numconv.getNormalNumeral("VII");
		assertThat(romcon, is(7));
	}

	@Test
	public void normalNumberTestforIV() {

		NumeralConverter numconv = new NumeralConverter();
		int romcon = numconv.getNormalNumeral("IV");
		assertThat(romcon, is(4));
	}
}
