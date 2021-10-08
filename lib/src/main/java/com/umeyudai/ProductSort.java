package com.umeyudai;

import java.time.LocalDate;
import java.util.Arrays;

public class ProductSort {

	public static void main(String[] args) {
		Product[] parray = {
				new Product("S-2801", "XenPhone", 33000, LocalDate.of(2022,3,15), true),
				new Product("B-1102", "Experience", 48000, LocalDate.of(2023,7,1), true),
				new Product("A-2341", "WinPhone", 13500, LocalDate.of(2021,3,25), false),
				new Product("R-3344", "jPhone-20", 99000, LocalDate.of(2023,8,12), true),
				new Product("C-2076", "Gala-S80", 78000, LocalDate.of(2023,9,8), true)
		};
		Arrays.sort(parray);
		for(Product p : parray) {
			System.out.println(p);
		}

	}

}
