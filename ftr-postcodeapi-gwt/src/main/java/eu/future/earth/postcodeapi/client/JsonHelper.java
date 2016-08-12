package eu.future.earth.postcodeapi.client;

import com.google.gwt.user.client.Event;

public class JsonHelper {
	public static boolean isLower(char charAt, Event event) {
		if (validChar(charAt)) {
			if (!event.getShiftKey()) {
				return true;
			}
		}
		return false;
	}

	public static boolean isCharLower(char charAt) {

		if (charAt == 'a') {
			return true;
		}
		if (charAt == 'b') {
			return true;
		}
		if (charAt == 'c') {
			return true;
		}

		if (charAt == 'd') {
			return true;
		}

		if (charAt == 'e') {
			return true;
		}

		if (charAt == 'f') {
			return true;
		}

		if (charAt == 'g') {
			return true;
		}

		if (charAt == 'h') {
			return true;
		}

		if (charAt == 'i') {
			return true;
		}

		if (charAt == 'j') {
			return true;
		}

		if (charAt == 'k') {
			return true;
		}

		if (charAt == 'l') {
			return true;
		}

		if (charAt == 'm') {
			return true;
		}

		if (charAt == 'n') {
			return true;
		}

		if (charAt == 'o') {
			return true;
		}

		if (charAt == 'p') {
			return true;
		}

		if (charAt == 'q') {
			return true;
		}

		if (charAt == 'r') {
			return true;
		}

		if (charAt == 's') {
			return true;
		}

		if (charAt == 't') {
			return true;
		}

		if (charAt == 'u') {
			return true;
		}

		if (charAt == 'v') {
			return true;
		}

		if (charAt == 'w') {
			return true;
		}

		if (charAt == 'x') {
			return true;
		}

		if (charAt == 'y') {
			return true;
		}

		if (charAt == 'z') {
			return true;
		}
		return false;
	}

	public static boolean validChar(char charAt) {

		if (charAt == 'A') {
			return true;
		}
		if (charAt == 'B') {
			return true;
		}
		if (charAt == 'C') {
			return true;
		}

		if (charAt == 'D') {
			return true;
		}

		if (charAt == 'E') {
			return true;
		}

		if (charAt == 'F') {
			return true;
		}

		if (charAt == 'G') {
			return true;
		}

		if (charAt == 'H') {
			return true;
		}

		if (charAt == 'I') {
			return true;
		}

		if (charAt == 'J') {
			return true;
		}

		if (charAt == 'K') {
			return true;
		}

		if (charAt == 'L') {
			return true;
		}

		if (charAt == 'M') {
			return true;
		}

		if (charAt == 'N') {
			return true;
		}

		if (charAt == 'O') {
			return true;
		}

		if (charAt == 'P') {
			return true;
		}

		if (charAt == 'Q') {
			return true;
		}

		if (charAt == 'R') {
			return true;
		}

		if (charAt == 'S') {
			return true;
		}

		if (charAt == 'T') {
			return true;
		}

		if (charAt == 'U') {
			return true;
		}

		if (charAt == 'V') {
			return true;
		}

		if (charAt == 'W') {
			return true;
		}

		if (charAt == 'X') {
			return true;
		}

		if (charAt == 'Y') {
			return true;
		}

		if (charAt == 'Z') {
			return true;
		}

		//Lower
		if (charAt == 'a') {
			return true;
		}
		if (charAt == 'b') {
			return true;
		}
		if (charAt == 'c') {
			return true;
		}

		if (charAt == 'd') {
			return true;
		}

		if (charAt == 'e') {
			return true;
		}

		if (charAt == 'f') {
			return true;
		}

		if (charAt == 'g') {
			return true;
		}

		if (charAt == 'h') {
			return true;
		}

		if (charAt == 'i') {
			return true;
		}

		if (charAt == 'j') {
			return true;
		}

		if (charAt == 'k') {
			return true;
		}

		if (charAt == 'l') {
			return true;
		}

		if (charAt == 'm') {
			return true;
		}

		if (charAt == 'n') {
			return true;
		}

		if (charAt == 'o') {
			return true;
		}

		if (charAt == 'p') {
			return true;
		}

		if (charAt == 'q') {
			return true;
		}

		if (charAt == 'r') {
			return true;
		}

		if (charAt == 's') {
			return true;
		}

		if (charAt == 't') {
			return true;
		}

		if (charAt == 'u') {
			return true;
		}

		if (charAt == 'v') {
			return true;
		}

		if (charAt == 'w') {
			return true;
		}

		if (charAt == 'x') {
			return true;
		}

		if (charAt == 'y') {
			return true;
		}

		if (charAt == 'z') {
			return true;
		}

		return false;
	}

	public static boolean validNumber(char charAt) {
		if (charAt == '1') {
			return true;
		}
		if (charAt == '2') {
			return true;
		}
		if (charAt == '3') {
			return true;
		}
		if (charAt == '4') {
			return true;
		}
		if (charAt == '5') {
			return true;
		}
		if (charAt == '6') {
			return true;
		}
		if (charAt == '7') {
			return true;
		}
		if (charAt == '8') {
			return true;
		}
		if (charAt == '9') {
			return true;
		}
		if (charAt == '0') {
			return true;
		}

		return false;
	}
}
