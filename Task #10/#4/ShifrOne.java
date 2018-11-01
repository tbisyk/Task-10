package com.gmail.t.bisyk;

public class ShifrOne {

	public ShifrOne() {
		super();
	}

	public StringBuilder shifrA(int l) {
		StringBuilder[] lit = new StringBuilder[27];
		for(int i=0;i<27;i++) {
		    lit[i] = new StringBuilder("");
		}
		lit[0].append("   db   ").append(System.lineSeparator());
		lit[0].append("  dPYb  ").append(System.lineSeparator());
		lit[0].append(" dP__Yb ").append(System.lineSeparator());
		lit[0].append("dP''''Yb").append(System.lineSeparator());

		lit[1].append(" 88''Yb ").append(System.lineSeparator());
		lit[1].append(" 88__dP ").append(System.lineSeparator());
		lit[1].append(" 88''Yb ").append(System.lineSeparator());
		lit[1].append(" 88oodP ").append(System.lineSeparator());

		lit[2].append(" dP''b8 ").append(System.lineSeparator());
		lit[2].append("dP   `' ").append(System.lineSeparator());
		lit[2].append("Yb      ").append(System.lineSeparator());
		lit[2].append(" YboodP ").append(System.lineSeparator());
		
		lit[3].append("8888b.  ").append(System.lineSeparator());
		lit[3].append(" 8I  Yb ").append(System.lineSeparator());
		lit[3].append(" 8I  dY ").append(System.lineSeparator());
		lit[3].append("8888Y'  ").append(System.lineSeparator());
		
		lit[4].append(" 888888 ").append(System.lineSeparator());
		lit[4].append(" 88__   ").append(System.lineSeparator());
		lit[4].append(" 88''   ").append(System.lineSeparator());
		lit[4].append(" 888888 ").append(System.lineSeparator());
		
		lit[5].append(" 888888 ").append(System.lineSeparator());
		lit[5].append(" 88__   ").append(System.lineSeparator());
		lit[5].append(" 88''   ").append(System.lineSeparator());
		lit[5].append(" 88     ").append(System.lineSeparator());
		
		lit[6].append(" dP''b8 ").append(System.lineSeparator());
		lit[6].append("dP   `' ").append(System.lineSeparator());
		lit[6].append("Yb  '88 ").append(System.lineSeparator());
		lit[6].append(" YboodP ").append(System.lineSeparator());
		
		lit[7].append(" 88  88 ").append(System.lineSeparator());
		lit[7].append(" 88  88 ").append(System.lineSeparator());
		lit[7].append(" 888888 ").append(System.lineSeparator());
		lit[7].append(" 88  88 ").append(System.lineSeparator());
		
		lit[8].append("   88   ").append(System.lineSeparator());
		lit[8].append("   88   ").append(System.lineSeparator());
		lit[8].append("   88   ").append(System.lineSeparator());
		lit[8].append("   88   ").append(System.lineSeparator());
		
		lit[9].append("  88888 ").append(System.lineSeparator());
		lit[9].append("     88 ").append(System.lineSeparator());
		lit[9].append(" o.  88 ").append(System.lineSeparator());
		lit[9].append(" 'bodP' ").append(System.lineSeparator());
		
		lit[10].append(" 88  dP ").append(System.lineSeparator());
		lit[10].append(" 88odP  ").append(System.lineSeparator());
		lit[10].append(" 88'Yb  ").append(System.lineSeparator());
		lit[10].append(" 88  Yb ").append(System.lineSeparator());
		
		lit[11].append(" 88     ").append(System.lineSeparator());
		lit[11].append(" 88     ").append(System.lineSeparator());
		lit[11].append(" 88  .o ").append(System.lineSeparator());
		lit[11].append(" 88ood8 ").append(System.lineSeparator());
		
		lit[12].append("8b    d8").append(System.lineSeparator());
		lit[12].append("88b  d88").append(System.lineSeparator());
		lit[12].append("88YbdP88").append(System.lineSeparator());
		lit[12].append("88 YY 88").append(System.lineSeparator());
		
		lit[13].append(" 88b 88 ").append(System.lineSeparator());
		lit[13].append(" 88Yb88 ").append(System.lineSeparator());
		lit[13].append(" 88 Y88 ").append(System.lineSeparator());
		lit[13].append(" 88  Y8 ").append(System.lineSeparator());
		
		lit[14].append(" dP'Yb  ").append(System.lineSeparator());
		lit[14].append("dP   Yb ").append(System.lineSeparator());
		lit[14].append("Yb   dP ").append(System.lineSeparator());
		lit[14].append(" YbodP  ").append(System.lineSeparator());
		
		lit[15].append(" 88''Yb ").append(System.lineSeparator());
		lit[15].append(" 88__dP ").append(System.lineSeparator());
		lit[15].append(" 88'''  ").append(System.lineSeparator());
		lit[15].append(" 88     ").append(System.lineSeparator());
		
		lit[16].append("  dP'Yb ").append(System.lineSeparator());
		lit[16].append(" dP   Yb").append(System.lineSeparator());
		lit[16].append(" Yb b dP").append(System.lineSeparator());
		lit[16].append("  `'YoYo ").append(System.lineSeparator());
		
		lit[17].append(" 88''Yb ").append(System.lineSeparator());
		lit[17].append(" 88__dP ").append(System.lineSeparator());
		lit[17].append(" 88'Yb  ").append(System.lineSeparator());
		lit[17].append(" 88  Yb ").append(System.lineSeparator());
		
		lit[18].append(" .dP'Y8 ").append(System.lineSeparator());
		lit[18].append(" `Ybo.' ").append(System.lineSeparator());
		lit[18].append(" o.`Y8b ").append(System.lineSeparator());
		lit[18].append(" 8bodP' ").append(System.lineSeparator());
		
		lit[19].append(" 888888 ").append(System.lineSeparator());
		lit[19].append("   88   ").append(System.lineSeparator());
		lit[19].append("   88   ").append(System.lineSeparator());
		lit[19].append("   88   ").append(System.lineSeparator());
		
		lit[20].append(" 888888 ").append(System.lineSeparator());
		lit[20].append("   88   ").append(System.lineSeparator());
		lit[20].append("   88   ").append(System.lineSeparator());
		lit[20].append("   88   ").append(System.lineSeparator());
		
		lit[21].append("Yb    dP").append(System.lineSeparator());
		lit[21].append(" Yb  dP ").append(System.lineSeparator());
		lit[21].append("  YbdP  ").append(System.lineSeparator());
		lit[21].append("   88   ").append(System.lineSeparator());
		
		lit[22].append(" b     d").append(System.lineSeparator());
		lit[22].append("  b * d ").append(System.lineSeparator());
		lit[22].append("  bd*bd ").append(System.lineSeparator());
		lit[22].append("   P Y  ").append(System.lineSeparator());
		
		lit[23].append(" Yb  dP ").append(System.lineSeparator());
		lit[23].append("  YbdP  ").append(System.lineSeparator());
		lit[23].append("  dPYb  ").append(System.lineSeparator());
		lit[23].append(" dP  Yb ").append(System.lineSeparator());
		
		lit[24].append(" Yb  dP ").append(System.lineSeparator());
		lit[24].append("  YbdP  ").append(System.lineSeparator());
		lit[24].append("   8P   ").append(System.lineSeparator());
		lit[24].append("  dP    ").append(System.lineSeparator());
		
		lit[25].append(" 8888P ").append(System.lineSeparator());
		lit[25].append("   dP  ").append(System.lineSeparator());
		lit[25].append("  dP   ").append(System.lineSeparator());
		lit[25].append(" d8888 ").append(System.lineSeparator());
		
		lit[26].append("        ").append(System.lineSeparator());
		lit[26].append("        ").append(System.lineSeparator());
		lit[26].append("        ").append(System.lineSeparator());
		lit[26].append(" ______ ").append(System.lineSeparator());
		
		int out = ((int)l-65);
		return lit[l-65];
	}
	
	
}
