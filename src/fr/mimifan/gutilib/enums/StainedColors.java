package fr.mimifan.gutilib.enums;

public enum StainedColors {
	
	white((short)0),
	orange((short)1),
	magenta((short)2),
	light_blue((short)3),
	yellow((short)4),
	lime((short)5),
	pink((short)6),
	gray((short)7),
	light_gray((short)8),
	cyan((short)9),
	purple((short)10),
	blue((short)11),
	brown((short)12),
	green((short)13),
	red((short)14),
	black((short)15);

	short value;
	StainedColors(short value) {
		this.value = value;
	}
	
	public short getValue() {
	    return this.value;
	}
	
	public static short getValue(String color) {
		StainedColors[] stainedColors = StainedColors.values();
		for(int i = 0; i < 15; i++) {
			String colorName = stainedColors[i].name();
			if(colorName == color) {
				return stainedColors[i].value;
			}
		}
		return (short)0;
	}
	
}
