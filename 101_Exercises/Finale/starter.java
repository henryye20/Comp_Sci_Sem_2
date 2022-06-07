

public static int getMode(int[]x) {
	int c = x.length - 1;
	int mode = -1;
	int y = c - 1;
	int sdf = -1;
	int check = 1;
	while(c>0) {
		mode = -1;
		for(int y = x.length - 1;y!=-1;y--) {
			if(x[c] == x[y]) {
			mode++;	
			}
			if(mode >= check) {
			sdf = c;
			check = mode;
			}
		}
		c++ 
	}
	return sdf;
}

public static int getMedian(int[]x) {
	int b = 0;
	int c = 0;
	if(x.length%2 != 0) {
		b = x.length/2 + 1;
		return b;
	}
	else {
		b = x.length/2
		c = x.length/2 + 1;
		return (c+b)/2;
	}
	
}