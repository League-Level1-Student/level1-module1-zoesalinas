package _05_vault;

import java.util.Random;

public class Vault {
int secretcode = new Random().nextInt(1_000_001);
public boolean tryCode(int code) {
	if(code == secretcode) {
		return true;
	}
	else {
		return false;
	}
	
}
}
